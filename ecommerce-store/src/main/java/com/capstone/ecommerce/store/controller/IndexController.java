package com.capstone.ecommerce.store.controller;

import com.capstone.ecommerce.store.database.dao.ProductDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller

public class IndexController {

    @Autowired
    private ProductDAO productDAO;

    @GetMapping("/")
    public ModelAndView index(@RequestParam(required = false) Integer id) {
        ModelAndView response = new ModelAndView("index");
        return response;
    }

    @GetMapping("/product")
    public ModelAndView canBeAnyFunctionNameYouWant() {
        // this page is for another page of the website which is express as "/product"
        ModelAndView response = new ModelAndView("product");

        return response;
    }

}
