package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.OauthAccessToken;

public interface OauthAccessTokenRepository extends JpaRepository<OauthAccessToken, String> {

}
