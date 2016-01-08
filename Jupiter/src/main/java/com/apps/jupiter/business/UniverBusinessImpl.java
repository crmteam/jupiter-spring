package com.apps.jupiter.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apps.jupiter.dao.UniverRepository;
import com.apps.jupiter.entities.Univer;

@Service
@Transactional
public class UniverBusinessImpl implements UniverBusiness {

	@Autowired
	private UniverRepository univerRepository;
	
	@Override
	public Univer saveUniver(Univer u) {
		return univerRepository.save(u);
	}

	@Override
	public List<Univer> getAllUnivers() {
		return univerRepository.findAll();
	}

	@Override
	public Univer updateUniver(Long id) {
		Univer u = findUniver(id);
		return univerRepository.save(u);
	}

	@Override
	public Univer findUniver(Long id) {
		return univerRepository.findOne(id);
	}

	@Override
	public void deleteUniver(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Univer> getUniverByRole() {
		return null;
	}

	@Override
	public List<Univer> getActivedUnivers() {
		// TODO Auto-generated method stub
		return null;
	}

}
