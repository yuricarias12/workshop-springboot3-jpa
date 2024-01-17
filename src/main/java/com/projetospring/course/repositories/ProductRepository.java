package com.projetospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
