package com.apps.jupiter.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apps.jupiter.dao.CompanyRepository;
import com.apps.jupiter.entities.Company;

/**
 * @author tocka
 *
 */

@Service
@Transactional
public class CompanyBusinessImpl implements CompanyBusiness {

	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public Company saveUser(Company c) {
		return companyRepository.save(c);
	}

	@Override
	public List<Company> getAllCompany() {
		return companyRepository.findAll();
	}

	@Override
	public Company updateCompany(Long id) {
		Company c = findCompany(id);
		return companyRepository.save(c);
	}

	@Override
	public Company findCompany(Long id) {
		return companyRepository.findOne(id);
	}

	@Override
	public void deleteCompany(Long id) {
		companyRepository.delete(id);
	}

}
