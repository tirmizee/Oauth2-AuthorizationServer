package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.OauthApproval;

public interface OauthApprovalRepository extends JpaRepository<OauthApproval, String> {

}
