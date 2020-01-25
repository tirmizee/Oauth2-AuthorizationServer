package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.Bank;

public interface BankRepository extends JpaRepository<Bank, Long>{

}
