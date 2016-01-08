package com.apps.jupiter.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.jupiter.entities.ProspectionStatus;

public interface ProspectionStatusRepository extends JpaRepository<ProspectionStatus, Long> {

}
