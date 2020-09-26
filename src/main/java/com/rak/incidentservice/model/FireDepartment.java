package com.rak.incidentservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "fd_id", "firecares_id", "name", "shift", "state", "timezone" })
public class FireDepartment {

	@JsonProperty("fd_id")
	private String fdId;
	@JsonProperty("firecares_id")
	private String firecaresId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("shift")
	private String shift;
	@JsonProperty("state")
	private String state;
	@JsonProperty("timezone")
	private String timezone;

	@JsonProperty("fd_id")
	public String getFdId() {
		return fdId;
	}

	@JsonProperty("fd_id")
	public void setFdId(String fdId) {
		this.fdId = fdId;
	}

	@JsonProperty("firecares_id")
	public String getFirecaresId() {
		return firecaresId;
	}

	@JsonProperty("firecares_id")
	public void setFirecaresId(String firecaresId) {
		this.firecaresId = firecaresId;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("shift")
	public String getShift() {
		return shift;
	}

	@JsonProperty("shift")
	public void setShift(String shift) {
		this.shift = shift;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("timezone")
	public String getTimezone() {
		return timezone;
	}

	@JsonProperty("timezone")
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

}