package com.example.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemanagement.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
    User findByUsername(String username);
}
