package com.projetospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
