package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.OauthCode;

public interface OauthCodeRepository extends JpaRepository<OauthCode, String>{

}
