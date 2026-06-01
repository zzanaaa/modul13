package com.example.modul12new.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.modul12new.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}


