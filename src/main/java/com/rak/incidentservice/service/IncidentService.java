package com.rak.incidentservice.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rak.incidentservice.model.Incident;

@Service
public class IncidentService {

	@Value("${json.data.folder}")
	String jsonDataFolder;
	
	List<Incident> incidentList = new ArrayList<Incident>();

	@PostConstruct
	public void init() throws IOException {
		ObjectMapper jsonMapper = new ObjectMapper();
		System.out.println("jsonDataFolder = " + jsonDataFolder);
		for (File jsonFile : getFilesInFolder(jsonDataFolder)) {
			// deserialize contents of each file into an object of type
			Incident incident = jsonMapper.readValue(jsonFile, new TypeReference<Incident>() {
			});
			incidentList.add(incident);
		}
	}

	public List<Incident> getAll() {
		return incidentList;
	}

	private File[] getFilesInFolder(String path) {
		// TODO better defensive programming
		File folder = new File(path);
		return folder.listFiles();
	}
}
