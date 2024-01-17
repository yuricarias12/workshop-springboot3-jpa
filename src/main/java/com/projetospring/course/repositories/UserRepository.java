package com.projetospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
