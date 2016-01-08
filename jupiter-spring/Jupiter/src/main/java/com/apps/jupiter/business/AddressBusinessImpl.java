package com.apps.jupiter.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apps.jupiter.dao.AddressRepository;
import com.apps.jupiter.entities.Address;

@Service
@Transactional
public class AddressBusinessImpl implements AddressBusiness {

	@Autowired
	private AddressRepository addressRepository;
	@Override
	public Address saveUser(Address a) {
		return addressRepository.save(a);
	}

	@Override
	public List<Address> getAllAddress() {
		return addressRepository.findAll();
	}

	@Override
	public Address updateAddress(Long id) {
		Address a = findAddress(id);
		return addressRepository.save(a);
	}

	@Override
	public Address findAddress(Long id) {
		return addressRepository.findOne(id);
	}

	@Override
	public void deleteAddress(Long id) {
		addressRepository.delete(id);

	}

}
