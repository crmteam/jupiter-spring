package com.apps.jupiter.business;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apps.jupiter.dao.CustomerRepository;
import com.apps.jupiter.entities.Customer;

/**
 * @author Boubacar KOITA alias Tocka Customer: business implementation class
 */

@Service
@Transactional
public class CustomerBusinessImpl implements CustomerBusiness {

	@Autowired
	private CustomerRepository customerRepository;


	HttpServletRequest httpServletRequest;

	@Override
	public Customer saveCustomer(Customer c) {

		customerRepository.save(c);
		return c;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer updateCustomer(Long id) {

		Customer c = customerRepository.findOne(id);
		if (null != c) {
			return customerRepository.save(c);
		}

		return c;
	}

	@Override
	public Customer findCustomer(Long id) {
		return customerRepository.findOne(id);
	}

	@Override
	public void deleteCustomer(Long id) {
		customerRepository.delete(id);
	}

}