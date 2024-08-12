package com.capstone.ecommerce.store.database.dao;

import com.capstone.ecommerce.store.database.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public class OrderDetailDAO extends JpaRepository<OrderDetail, Integer> {

    @Query(value = "select * from orderdetails where order_id = :orderId and product_id = :productId", nativeQuery = true)
    OrderDetail isProductInCart(Integer orderId, Integer productId);

}
