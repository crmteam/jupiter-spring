package com.apps.jupiter.business;

import java.util.List;

import com.apps.jupiter.entities.Company;

public interface CompanyBusiness {


	public Company saveUser(Company c);

	public List<Company> getAllCompany();

	public Company updateCompany(Long id);

	public Company findCompany(Long id);

	public void deleteCompany(Long id);
}
