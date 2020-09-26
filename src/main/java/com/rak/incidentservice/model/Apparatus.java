package com.rak.incidentservice.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "car_id", "extended_data", "geohash", "personnel", "shift", "station", "unit_id", "unit_status",
		"unit_type" })
public class Apparatus {

	@JsonProperty("car_id")
	private String carId;
	@JsonProperty("distance")
	public Double distance;
	@JsonProperty("extended_data")
	private ExtendedData extendedData;
	@JsonProperty("geohash")
	private String geohash;
	@JsonProperty("personnel")
	private List<Object> personnel = null;
	@JsonProperty("shift")
	private String shift;
	@JsonProperty("station")
	private String station;
	@JsonProperty("unit_id")
	private String unitId;
	@JsonProperty("unit_status")
	private UnitStatus unitStatus;
	@JsonProperty("unit_type")
	private String unitType;

	@JsonProperty("car_id")
	public String getCarId() {
		return carId;
	}

	@JsonProperty("car_id")
	public void setCarId(String carId) {
		this.carId = carId;
	}

	@JsonProperty("distance")
	public Double getDistance() {
		return distance;
	}

	@JsonProperty("distance")
	public void setDistance(Double distance) {
		this.distance = distance;
	}

	@JsonProperty("extended_data")
	private void unpackExtendedDatas(Map<String, Object> jsonExtendedDataMap) {
		this.extendedData = new ExtendedData();

		Set<String> keySet = jsonExtendedDataMap.keySet();
		for (String key : keySet) {
			this.extendedData.put(key, (Integer) jsonExtendedDataMap.get(key));
		}

	}

	// @JsonProperty("extended_data")
	public ExtendedData getExtendedData() {
		return extendedData;
	}

	// @JsonProperty("extended_data")
	public void setExtendedData(ExtendedData extendedData) {
		this.extendedData = extendedData;
	}

	@JsonProperty("geohash")
	public String getGeohash() {
		return geohash;
	}

	@JsonProperty("geohash")
	public void setGeohash(String geohash) {
		this.geohash = geohash;
	}

	@JsonProperty("personnel")
	public List<Object> getPersonnel() {
		return personnel;
	}

	@JsonProperty("personnel")
	public void setPersonnel(List<Object> personnel) {
		this.personnel = personnel;
	}

	@JsonProperty("shift")
	public String getShift() {
		return shift;
	}

	@JsonProperty("shift")
	public void setShift(String shift) {
		this.shift = shift;
	}

	@JsonProperty("station")
	public String getStation() {
		return station;
	}

	@JsonProperty("station")
	public void setStation(String station) {
		this.station = station;
	}

	@JsonProperty("unit_id")
	public String getUnitId() {
		return unitId;
	}

	@JsonProperty("unit_id")
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	@JsonProperty("unit_status")
	private void unpackUnitStatus(Map<String, Map<String, Object>> jsonUnitStatusMap) {
		this.unitStatus = new UnitStatus();

		Set<String> keySet = jsonUnitStatusMap.keySet();
		for (String key : keySet) {
			StatusInfo si = new StatusInfo();
			si.setGeohash((String) jsonUnitStatusMap.get(key).get("geohash"));
			si.setLatitude((Double) jsonUnitStatusMap.get(key).get("latitude"));
			si.setLongitude((Double) jsonUnitStatusMap.get(key).get("longitude"));
			si.setTimestamp((String) jsonUnitStatusMap.get(key).get("timestamp"));
			this.unitStatus.put(key, si);
		}

	}

	// @JsonProperty("unit_status")
	public UnitStatus getUnitStatus() {
		return unitStatus;
	}

	// @JsonProperty("unit_status")
	public void setUnitStatus(UnitStatus unitStatus) {
		this.unitStatus = unitStatus;
	}

	@JsonProperty("unit_type")
	public String getUnitType() {
		return unitType;
	}

	@JsonProperty("unit_type")
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

}