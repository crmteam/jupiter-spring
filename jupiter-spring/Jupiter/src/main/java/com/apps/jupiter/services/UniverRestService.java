package com.apps.jupiter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apps.jupiter.business.UniverBusiness;
import com.apps.jupiter.entities.Univer;

@RestController
public class UniverRestService {

	@Autowired
	private UniverBusiness univerBusiness;

	@RequestMapping(value="/univers", method=RequestMethod.POST)
	public Univer saveUniver(@RequestBody Univer u) {
		return univerBusiness.saveUniver(u);
	}

	@RequestMapping(value="/univers", method=RequestMethod.GET)
	public List<Univer> getAllUnivers() {
		return univerBusiness.getAllUnivers();
	}

	@RequestMapping(value="/univers/{id}", method=RequestMethod.PUT)
	public Univer updateUniver(@PathVariable Long id) {
		return univerBusiness.updateUniver(id);
	}

	@RequestMapping(value="/univers/{id}", method=RequestMethod.GET)
	public Univer findUniver(@PathVariable Long id) {
		return univerBusiness.findUniver(id);
	}

	@RequestMapping(value="/univers/{id}", method=RequestMethod.DELETE)
	public void deleteUniver(@PathVariable Long id) {
		univerBusiness.deleteUniver(id);
	}

	public List<Univer> getUniverByRole() {
		return univerBusiness.getUniverByRole();
	}

	public List<Univer> getActivedUnivers() {
		return univerBusiness.getActivedUnivers();
	}
}
