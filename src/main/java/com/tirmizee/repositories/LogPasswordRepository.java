package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.LogPassword;

public interface LogPasswordRepository extends JpaRepository<LogPassword, Long> {

}
