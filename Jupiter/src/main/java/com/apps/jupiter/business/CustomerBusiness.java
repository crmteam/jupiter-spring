package com.apps.jupiter.business;

import java.util.List;

import com.apps.jupiter.entities.Customer;

public interface CustomerBusiness {

	public Customer saveCustomer(Customer c);

	public List<Customer> getAllCustomers();

	public Customer updateCustomer(Long id);

	public Customer findCustomer(Long id);

	public void deleteCustomer(Long id);

}
