package com.apps.jupiter.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.apps.jupiter.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	/**@Query("select c from Customer c where c.owner=:x")
	public List<Customer> getCustmerByOwner(@Param("x")String ownerId);
	*/

}
