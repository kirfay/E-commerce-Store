package com.capstone.ecommerce.store.controller;


import com.capstone.ecommerce.store.database.dao.OrderDAO;
import com.capstone.ecommerce.store.database.dao.OrderDetailDAO;
import com.capstone.ecommerce.store.database.dao.ProductDAO;
import com.capstone.ecommerce.store.database.entity.Order;
import com.capstone.ecommerce.store.database.entity.OrderDetail;
import com.capstone.ecommerce.store.database.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class OrderController {

        @Autowired
        private OrderDAO orderDao;

        @Autowired
        private OrderDetailDAO orderDetailDAO;

        @Autowired
        private ProductDAO productDao;

        @Autowired

        @GetMapping("/order/orderdetail")
        public ModelAndView orderDetail() {
            ModelAndView response = new ModelAndView("order/orderdetail");

            // get the logged in user
            User user = authenticatedUserUtilities.getCurrentUser();

            // now we need to get the order from the database where the status is 'CART'
            Order order = orderDao.findOrderInCartStatus(user.getId());

            // get the order details for the order
            List<Map<String,Object>> orderDetails = orderDao.getOrderDetails(order.getId());
            response.addObject("orderDetails", orderDetails);

            return response;
        }



        @GetMapping("/order/orderdetail")
        public ModelAndView orderDetail(@RequestParam Integer orderId) {
            ModelAndView response = new ModelAndView("order/orderdetail");
            List<Map<String,Object>> orderDetails = orderDao.getOrderDetails(orderId);
            response.addObject("orderDetails", orderDetails);
            return response;
        }

        OrderDetail orderDetail = orderDetailDao.isProductInCart(order.getId(), productId);
        if ( orderDetail == null ) {
            // this product is not part of this order so we can create a new orderdetails
            orderDetail = new OrderDetail();
            orderDetail.setOrder(order);
            orderDetail.setProduct(product);
            orderDetail.setQuantityOrdered(1);
            orderDetailDao.save(orderDetail);
        }

    @GetMapping("/order/checkout")
    public ModelAndView checkout() {
        ModelAndView response = new ModelAndView();

        // get the logged in user
        User user = authenticatedUserUtilities.getCurrentUser();

        // now we need to get the order from the database where the status is 'CART'
        Order order = orderDao.findOrderInCartStatus(user.getId());
        if ( order == null ) {
            log.error("There is no order with items in the cart to checktout");
        } else {
            // there was an order with items in the cart so we change the status to COMPLETE
            order.setStatus("COMPLETE");
            orderDao.save(order);
        }

        response.setViewName("redirect:/order/orderdetail");
        return response;
    }



