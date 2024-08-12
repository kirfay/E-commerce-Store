package com.capstone.ecommerce.store.service;

import com.capstone.ecommerce.store.database.dao.ProductDAO;
import com.capstone.ecommerce.store.database.dao.*;
import com.capstone.ecommerce.store.database.entity.*;
import com.capstone.ecommerce.store.form.*;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Slf4j
@Component
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public Product createProduct(CreateProductFormBean form) {
        Product product = productDAO.findById(form.getProductId());
        if (product == null) {
            product = new Product();
        }

        product.setProductName(form.getProductName());
        product.setProductDescription(form.getProductDescription());
        product.setBuyPrice(form.getBuyPrice());
        product = productDAO.save(product);

        return product;
    }
}



