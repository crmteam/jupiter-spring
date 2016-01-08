package com.apps.jupiter.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.jupiter.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
