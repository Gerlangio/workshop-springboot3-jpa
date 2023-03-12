package com.api.tads.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.tads.dev.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
