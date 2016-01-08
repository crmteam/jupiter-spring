package com.apps.jupiter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apps.jupiter.business.ProspectionBusiness;
import com.apps.jupiter.entities.Group;
import com.apps.jupiter.entities.Prospection;

@RestController
public class ProspectionRestService {

	@Autowired
	private ProspectionBusiness prospectionBusiness;

	@RequestMapping(value="/prospections", method=RequestMethod.POST)
	public Prospection saveUser(@RequestBody Prospection p) {
		return prospectionBusiness.saveUser(p);
	}

	@RequestMapping(value="/prospections", method=RequestMethod.GET)
	public List<Prospection> getAllProspections() {
		return prospectionBusiness.getAllProspections();
	}

	@RequestMapping(value="/prospections/{id}", method=RequestMethod.PUT)
	public Prospection updateProspection(@PathVariable Long id) {
		return prospectionBusiness.updateProspection(id);
	}

	@RequestMapping(value="/prospections/{id}", method=RequestMethod.GET)
	public Prospection findProspection(@PathVariable Long id) {
		return prospectionBusiness.findProspection(id);
	}

	@RequestMapping(value="/prospections/{id}", method=RequestMethod.DELETE)
	public void deleteProspection(@PathVariable Long id) {
		prospectionBusiness.deleteProspection(id);
	}

	@RequestMapping(value="/prospectionsByUser", method=RequestMethod.GET)
	public List<Group> getProspectionsByUser() {
		return prospectionBusiness.getProspectionsByUser();
	}
	
	
}
