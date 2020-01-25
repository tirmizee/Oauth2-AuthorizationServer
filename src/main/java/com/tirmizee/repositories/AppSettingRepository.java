package com.tirmizee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.entities.AppSetting;

public interface AppSettingRepository extends JpaRepository<AppSetting, String> {

}
