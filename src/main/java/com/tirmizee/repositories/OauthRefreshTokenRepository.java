package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.OauthRefreshToken;

public interface OauthRefreshTokenRepository extends JpaRepository<OauthRefreshToken, String> {

}
