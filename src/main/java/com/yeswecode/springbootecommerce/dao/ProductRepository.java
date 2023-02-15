package com.yeswecode.springbootecommerce.dao;

import com.yeswecode.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product , Long> {


}


