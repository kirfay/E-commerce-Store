package com.capstone.ecommerce.store.database.entity;

import jakarta.persistence.*;
import lombok.*;


    @Setter
    @Getter
    @ToString
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "users")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @Column(name = "email")
        private String email;

        @Column(name = "password")
        private String password;

}
