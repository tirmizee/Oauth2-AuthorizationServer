package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.Postcode;

public interface PostcodeRepository extends JpaRepository<Postcode, Long> {

}
