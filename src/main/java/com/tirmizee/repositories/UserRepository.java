package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
