package com.capstone.ecommerce.store.controller;

import com.capstone.ecommerce.store.database.dao.ProductDAO;
import com.capstone.ecommerce.store.database.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductDAO productDAO;


    @GetMapping("/")
    public ModelAndView product() {
        ModelAndView response = new ModelAndView("product/detail");
        List<Product> products = productDAO.findAll();
        return response;
    }







}












