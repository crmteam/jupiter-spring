package com.apps.jupiter.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.jupiter.entities.Role;

public interface RoleRepository extends JpaRepository<Role, String> {

}
