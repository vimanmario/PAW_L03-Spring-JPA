package com.example.paw_lab3_springjpa.repository;

import com.example.paw_lab3_springjpa.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
