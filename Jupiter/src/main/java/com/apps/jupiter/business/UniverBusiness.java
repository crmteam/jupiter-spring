package com.apps.jupiter.business;

import java.util.List;

import com.apps.jupiter.entities.Univer;

public interface UniverBusiness {
	
	public Univer saveUniver(Univer u);

	public List<Univer> getAllUnivers();

	public Univer updateUniver(Long id);

	public Univer findUniver(Long id);

	public void deleteUniver(Long id);

	public List<Univer> getUniverByRole();

	public List<Univer> getActivedUnivers();

}
