package com.capstone.ecommerce.store.controller;

import com.capstone.ecommerce.store.database.dao.ProductDAO;
import com.capstone.ecommerce.store.database.entity.Product;
import com.capstone.ecommerce.store.form.CreateProductFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductDAO productDAO;

    @GetMapping ({"", "/"})
    public String showProductList(Model model) {
        List<Product> products = productDAO.findAll(Sort.by(Sort.Direction.DESC,"id"));
        model.addAttribute("products", products);
        return "products/index";
    }

    @GetMapping("/create")
    public String showCreatePage(Model model) {
        CreateProductFormBean productFormBean = new CreateProductFormBean();
        model.addAttribute("productFormBean", productFormBean);
        return "products/createProduct";
    }
}
