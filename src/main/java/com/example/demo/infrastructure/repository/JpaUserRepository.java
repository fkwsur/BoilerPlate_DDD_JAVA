package com.example.demo.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.model.user.entity.User;

import java.util.List;

@Repository
public interface JpaUserRepository  extends JpaRepository<User, Long>{
        
}
