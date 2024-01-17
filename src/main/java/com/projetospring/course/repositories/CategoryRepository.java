package com.projetospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
