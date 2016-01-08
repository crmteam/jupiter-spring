package com.apps.jupiter.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.jupiter.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
