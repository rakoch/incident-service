package com.rak.incidentservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "geohash", "latitude", "longitude", "timestamp" })
public class StatusInfo {

	@JsonProperty("geohash")
	private String geohash;
	@JsonProperty("latitude")
	private Double latitude;
	@JsonProperty("longitude")
	private Double longitude;
	@JsonProperty("timestamp")
	private String timestamp;

	@JsonProperty("geohash")
	public String getGeohash() {
		return geohash;
	}

	@JsonProperty("geohash")
	public void setGeohash(String geohash) {
		this.geohash = geohash;
	}

	@JsonProperty("latitude")
	public Double getLatitude() {
		return latitude;
	}

	@JsonProperty("latitude")
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@JsonProperty("longitude")
	public Double getLongitude() {
		return longitude;
	}

	@JsonProperty("longitude")
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	@JsonProperty("timestamp")
	public String getTimestamp() {
		return timestamp;
	}

	@JsonProperty("timestamp")
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}