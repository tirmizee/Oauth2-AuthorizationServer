package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.UserAttemp;

public interface UserAttempRepository extends JpaRepository<UserAttemp, String> {

}
