package com.rak.incidentservice.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UnitStatus {

	Map<String, StatusInfo> unitStatusMap = new HashMap<String, StatusInfo>();

	public Map<String, StatusInfo> getUnitStatusMap() {
		return unitStatusMap;
	}

	public void setUnitStatusMap(Map<String, StatusInfo> unitStatusMap) {
		this.unitStatusMap = unitStatusMap;
	}
	
	public StatusInfo get(String key) {
		return unitStatusMap.get(key);
	}
	
	public void put(String key, StatusInfo value) {
		unitStatusMap.put(key, value);
	}
	
	public Set<String> getKeys() {
		return unitStatusMap.keySet();
	}
}