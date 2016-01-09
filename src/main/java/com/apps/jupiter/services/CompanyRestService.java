package com.apps.jupiter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apps.jupiter.business.CompanyBusiness;
import com.apps.jupiter.entities.Company;

@RestController
public class CompanyRestService {
	
	@Autowired
	private CompanyBusiness companyBusiness;

	@RequestMapping(value="/companies", method=RequestMethod.POST)
	public Company saveUser(@RequestBody Company c) {
		return companyBusiness.saveUser(c);
	}

	@RequestMapping(value="/companies", method=RequestMethod.GET)
	public List<Company> getAllCompany() {
		return companyBusiness.getAllCompany();
	}

	@RequestMapping(value="/companies/{id}", method=RequestMethod.PUT)
	public Company updateCompany(@PathVariable Long id) {
		return companyBusiness.updateCompany(id);
	}

	@RequestMapping(value="/companies/{id}", method=RequestMethod.GET)
	public Company findCompany(@PathVariable Long id) {
		return companyBusiness.findCompany(id);
	}

	@RequestMapping(value="/companies", method=RequestMethod.DELETE)
	public void deleteCompany(@PathVariable Long id) {
		companyBusiness.deleteCompany(id);
	}

}
