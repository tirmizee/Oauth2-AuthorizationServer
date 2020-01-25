package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.OauthClientDetail;

public interface OauthClientDetailRepository extends JpaRepository<OauthClientDetail, String> {

}
