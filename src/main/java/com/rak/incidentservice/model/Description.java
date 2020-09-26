package com.rak.incidentservice.model;

import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "comments", "day_of_week", "event_closed", "event_id", "event_opened", "extended_data",
		"first_unit_arrived", "first_unit_dispatched", "first_unit_enroute", "hour_of_day", "incident_number",
		"loi_search_complete", "subtype", "type" })
public class Description {

	@JsonProperty("comments")
	private String comments;
	@JsonProperty("day_of_week")
	private String dayOfWeek;
	@JsonProperty("event_closed")
	private String eventClosed;
	@JsonProperty("event_id")
	private String eventId;
	@JsonProperty("event_opened")
	private String eventOpened;
	@JsonProperty("extended_data")
	private ExtendedData extendedData;
	@JsonProperty("first_unit_arrived")
	private String firstUnitArrived;
	@JsonProperty("first_unit_dispatched")
	private String firstUnitDispatched;
	@JsonProperty("first_unit_enroute")
	private String firstUnitEnroute;
	@JsonProperty("hour_of_day")
	private Integer hourOfDay;
	@JsonProperty("incident_number")
	private String incidentNumber;
	@JsonProperty("loi_search_complete")
	private String loiSearchComplete;
	@JsonProperty("subtype")
	private String subtype;
	@JsonProperty("type")
	private String type;

	@JsonProperty("comments")
	public String getComments() {
		return comments;
	}

	@JsonProperty("comments")
	public void setComments(String comments) {
		this.comments = comments;
	}

	@JsonProperty("day_of_week")
	public String getDayOfWeek() {
		return dayOfWeek;
	}

	@JsonProperty("day_of_week")
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@JsonProperty("event_closed")
	public String getEventClosed() {
		return eventClosed;
	}

	@JsonProperty("event_closed")
	public void setEventClosed(String eventClosed) {
		this.eventClosed = eventClosed;
	}

	@JsonProperty("event_id")
	public String getEventId() {
		return eventId;
	}

	@JsonProperty("event_id")
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	@JsonProperty("event_opened")
	public String getEventOpened() {
		return eventOpened;
	}

	@JsonProperty("event_opened")
	public void setEventOpened(String eventOpened) {
		this.eventOpened = eventOpened;
	}

	@JsonProperty("extended_data")
	private void unpackNested(Map<String,Object> jsonExtendedDataMap) {
    	this.extendedData = new ExtendedData();
    	
    	Set<String> keySet = jsonExtendedDataMap.keySet();
    	for(String key : keySet) {
    		this.extendedData.put(key, (Integer)jsonExtendedDataMap.get(key));
    	}

	}
    
	//@JsonProperty("extended_data")
	public ExtendedData getExtendedData() {
		return extendedData;
	}

	//@JsonProperty("extended_data")
	public void setExtendedData(ExtendedData extendedData) {
		this.extendedData = extendedData;
	}

	@JsonProperty("first_unit_arrived")
	public String getFirstUnitArrived() {
		return firstUnitArrived;
	}

	@JsonProperty("first_unit_arrived")
	public void setFirstUnitArrived(String firstUnitArrived) {
		this.firstUnitArrived = firstUnitArrived;
	}

	@JsonProperty("first_unit_dispatched")
	public String getFirstUnitDispatched() {
		return firstUnitDispatched;
	}

	@JsonProperty("first_unit_dispatched")
	public void setFirstUnitDispatched(String firstUnitDispatched) {
		this.firstUnitDispatched = firstUnitDispatched;
	}

	@JsonProperty("first_unit_enroute")
	public String getFirstUnitEnroute() {
		return firstUnitEnroute;
	}

	@JsonProperty("first_unit_enroute")
	public void setFirstUnitEnroute(String firstUnitEnroute) {
		this.firstUnitEnroute = firstUnitEnroute;
	}

	@JsonProperty("hour_of_day")
	public Integer getHourOfDay() {
		return hourOfDay;
	}

	@JsonProperty("hour_of_day")
	public void setHourOfDay(Integer hourOfDay) {
		this.hourOfDay = hourOfDay;
	}

	@JsonProperty("incident_number")
	public String getIncidentNumber() {
		return incidentNumber;
	}

	@JsonProperty("incident_number")
	public void setIncidentNumber(String incidentNumber) {
		this.incidentNumber = incidentNumber;
	}

	@JsonProperty("loi_search_complete")
	public String getLoiSearchComplete() {
		return loiSearchComplete;
	}

	@JsonProperty("loi_search_complete")
	public void setLoiSearchComplete(String loiSearchComplete) {
		this.loiSearchComplete = loiSearchComplete;
	}

	@JsonProperty("subtype")
	public String getSubtype() {
		return subtype;
	}

	@JsonProperty("subtype")
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

}