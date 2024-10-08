package com.capstone.ecommerce.store.database.dao;

import com.capstone.ecommerce.store.database.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product, Long> {

    // this is a magic query in that .... spring data JPA is able to use the method name to generate the query
    Product findById(Integer id);

    // this is a JPA query just like we did in the hibernate module
    @Query("select p from Product p where p.productName like concat('%', :name, '%') " )
    List<Product> findByName(String name);

}