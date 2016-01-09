package com.apps.jupiter.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.jupiter.entities.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
