package com.rak.incidentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rak.incidentservice.model.Incident;
import com.rak.incidentservice.service.IncidentService;

@RestController
public class IncidentServiceController {

	@Autowired
	private IncidentService incidentService;

	@GetMapping("/indidentservice/incidents")
	public List<Incident> retrieveIncidents() {
		return incidentService.getAll();
	}
	

}