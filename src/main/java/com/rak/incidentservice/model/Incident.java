package com.rak.incidentservice.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "address", "apparatus", "description", "fire_department", "version" })
public class Incident {

	@JsonProperty("address")
	private Address address;
	@JsonProperty("apparatus")
	private List<Apparatus> apparatus = null;
	@JsonProperty("description")
	private Description description;
	@JsonProperty("fire_department")
	private FireDepartment fireDepartment;
	@JsonProperty("version")
	private String version;

	@JsonProperty("address")
	public Address getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(Address address) {
		this.address = address;
	}

	@JsonProperty("apparatus")
	public List<Apparatus> getApparatus() {
		return apparatus;
	}

	@JsonProperty("apparatus")
	public void setApparatus(List<Apparatus> apparatus) {
		this.apparatus = apparatus;
	}

	@JsonProperty("description")
	public Description getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(Description description) {
		this.description = description;
	}

	@JsonProperty("fire_department")
	public FireDepartment getFireDepartment() {
		return fireDepartment;
	}

	@JsonProperty("fire_department")
	public void setFireDepartment(FireDepartment fireDepartment) {
		this.fireDepartment = fireDepartment;
	}

	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String version) {
		this.version = version;
	}

}