package com.wslprojects.springjpa.repositories;

import com.wslprojects.springjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}