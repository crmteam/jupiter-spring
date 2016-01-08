package com.apps.jupiter.business;

import java.util.List;

import com.apps.jupiter.entities.Address;

public interface AddressBusiness {

	public Address saveUser(Address a);

	public List<Address> getAllAddress();

	public Address updateAddress(Long id);

	public Address findAddress(Long id);

	public void deleteAddress(Long id);

}
