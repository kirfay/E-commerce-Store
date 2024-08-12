package com.capstone.ecommerce.store.controller;

import com.capstone.ecommerce.store.database.dao.ProductDAO;
import com.capstone.ecommerce.store.database.entity.Product;
import com.capstone.ecommerce.store.form.CreateProductFormBean;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductDAO productDAO;

    @GetMapping ("/product")
    public ModelAndView product() {
        ModelAndView response = new ModelAndView("admin/productlist");
        List<Product> products = productDAO.findAll();
        response.addObject("products", products);
        return response;
    }


    @GetMapping("/createSubmit")
    public ModelAndView createProductSubmit(@Valid CreateProductFormBean form, BindingResult bindingResult) {
        ModelAndView response = new ModelAndView("admin/createproduct");

        log.info(form.toString());

        if (bindingResult.hasErrors()) {
            response.addObject("bindingResult", bindingResult);
            response.addObject("form", form);
            return response;
        }

        Product product = new Product();
        product.setProductName(form.getProductName());
        product.setProductDescription(form.getProductDescription());
        product.setBuyPrice(form.getBuyPrice());
        product.setProductImageUrl(form.getImageUrl());

        // save the product to the database
        productDAO.save(product);

        return response;
    }




}
