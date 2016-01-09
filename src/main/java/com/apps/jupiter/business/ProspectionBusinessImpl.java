package com.apps.jupiter.business;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apps.jupiter.dao.ProspectionRepository;
import com.apps.jupiter.entities.Group;
import com.apps.jupiter.entities.Prospection;
import com.apps.jupiter.entities.User;

@Service
@Transactional
public class ProspectionBusinessImpl implements ProspectionBusiness {

	@Autowired
	private ProspectionRepository prospectionRepository;
	@Autowired
	private UserBusiness userBusiness;

	@Override
	public Prospection saveUser(Prospection p) {
		User owner = userBusiness.getCurrentUser();

		p.setOwner(owner);
		p.setCreated(new Date());
		return prospectionRepository.save(p);
	}

	@Override
	public List<Prospection> getAllProspections() {
		return prospectionRepository.findAll();
	}

	@Override
	public Prospection updateProspection(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Prospection findProspection(Long id) {
		return prospectionRepository.findOne(id);
	}

	@Override
	public void deleteProspection(Long id) {
		prospectionRepository.delete(id);
	}

	@Override
	public List<Group> getProspectionsByUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
