package com.apps.jupiter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apps.jupiter.business.CustomerBusiness;
import com.apps.jupiter.entities.Customer;

@RestController
public class CustomerRestService {

	@Autowired
	private CustomerBusiness customerBusiness;

	@RequestMapping(value="/customers", method=RequestMethod.POST)
	public Customer saveCustomer(@RequestBody Customer c) {
		return customerBusiness.saveCustomer(c);
	}
	
	@RequestMapping(value="/customers", method=RequestMethod.GET)
	public List<Customer> getAllCustomers() {
		return customerBusiness.getAllCustomers();
	}

	@RequestMapping(value="/customers/{id}", method=RequestMethod.PUT)
	public Customer updateCustomer(@PathVariable Long id) {
		return customerBusiness.updateCustomer(id);
	}

	@RequestMapping(value="/customers/{id}", method=RequestMethod.GET)
	public Customer findCustomer(@PathVariable Long id) {
		return customerBusiness.findCustomer(id);
	}

	@RequestMapping(value="/customers/{id}", method=RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable Long id) {
		customerBusiness.deleteCustomer(id);
	}
	
	
}
