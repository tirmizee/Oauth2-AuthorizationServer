package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long>{

}
