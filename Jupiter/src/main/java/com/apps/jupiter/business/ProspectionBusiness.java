package com.apps.jupiter.business;

import java.util.List;

import com.apps.jupiter.entities.Group;
import com.apps.jupiter.entities.Prospection;

public interface ProspectionBusiness {
	
	public Prospection saveUser(Prospection p);

	public List<Prospection> getAllProspections();

	public Prospection updateProspection(Long id);

	public Prospection findProspection(Long id);

	public void deleteProspection(Long id);

	public List<Group> getProspectionsByUser();

}
