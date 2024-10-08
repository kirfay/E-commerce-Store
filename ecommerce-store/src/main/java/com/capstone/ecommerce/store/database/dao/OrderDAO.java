package com.capstone.ecommerce.store.database.dao;

import com.capstone.ecommerce.store.database.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface OrderDAO extends JpaRepository<Order, Long> {

    // @Query(value="select o.id as order_id, o.order_date, od.quantity_ordered, p.product_name, p.id as product_id, " +
            //"od.price_each, (od.quantity_ordered * od.price_each) as line_item_total " +
           // "from orderdetails od, products p, orders o " +
            //"where od.product_id = p.id and o.id = od.order_id and o.id = :orderId " +
           // "order by order_id;", nativeQuery = true)
    List<Map<String, Object>> getOrderDetails(Integer orderId);

    @Query(value = " select * from orders where user_id = :userId and status = 'CART'", nativeQuery = true)
    Order findOrderInCartStatus(Integer userId);
}

