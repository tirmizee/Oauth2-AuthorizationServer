package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.OauthClientToken;

public interface OauthClientTokenRepository extends JpaRepository<OauthClientToken, String>{

}
