package com.rak.incidentservice.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rak.incidentservice.model.Incident;

@SpringBootTest
class IncidentServiceTest {

	@Autowired
	private IncidentService incidentService;
	
	@Test
	void testGetAll() {
		
		List<Incident> incidentList = incidentService.getAll();
		assert incidentList != null && incidentList.size() > 0;
	    
	    
	}

}
