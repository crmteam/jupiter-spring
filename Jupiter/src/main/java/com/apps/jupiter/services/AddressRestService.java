package com.apps.jupiter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apps.jupiter.business.AddressBusiness;
import com.apps.jupiter.entities.Address;

@RestController
public class AddressRestService {

	@Autowired
	private AddressBusiness addressBusiness;

	@RequestMapping(value="/address", method=RequestMethod.POST)
	public Address saveUser(@RequestBody Address a) {
		return addressBusiness.saveUser(a);
	}

	@RequestMapping(value="/address", method=RequestMethod.GET)
	public List<Address> getAllAddress() {
		return addressBusiness.getAllAddress();
	}

	@RequestMapping(value="/address/{id}", method=RequestMethod.PUT)
	public Address updateAddress(@PathVariable Long id) {
		return addressBusiness.updateAddress(id);
	}

	@RequestMapping(value="/address/{id}", method=RequestMethod.GET)
	public Address findAddress(@PathVariable Long id) {
		return addressBusiness.findAddress(id);
	}

	@RequestMapping(value="/address/{id}", method=RequestMethod.DELETE)
	public void deleteAddress(@PathVariable Long id) {
		addressBusiness.deleteAddress(id);
	}
}
