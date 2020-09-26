package com.rak.incidentservice.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({ "event_duration", "response_duration", "travel_duration", "turnout_duration" })
//@JsonPropertyOrder({
//"dispatch_duration",
//"event_duration",
//"response_time"
//})
public class ExtendedData {

	Map<String, Integer> propertyMap = new HashMap<String,Integer>();

	public Map<String, Integer> getPropertyMap() {
		return propertyMap;
	}

	public void setPropertyMap(Map<String, Integer> propertyMap) {
		this.propertyMap = propertyMap;
	}

	public void put(String key, Integer value) {
		propertyMap.put(key, value);
	}
	
	public Integer get(String key) {
		return propertyMap.get(key);
	}
	
	public Set<String> getKeys() {
		return propertyMap.keySet();
	}
	
}