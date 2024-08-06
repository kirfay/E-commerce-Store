package com.capstone.ecommerce.store.database.dao;

import com.capstone.ecommerce.store.database.entity.*;
import org.springframework.data.jpa.repository.*;

public interface UserDAO extends JpaRepository<User, Long> {


    User findByEmailIgnoreCase(String email);

}