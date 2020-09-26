package com.rak.incidentservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "address_id", "address_line1", "city", "common_place_name", "cross_street1", "cross_street2",
		"first_due", "geohash", "latitude", "longitude", "name", "number", "postal_code", "prefix_direction",
		"response_zone", "state", "suffix_direction", "type" })
public class Address {

	@JsonProperty("address_id")
	private String addressId;
	@JsonProperty("address_line1")
	private String addressLine1;
	@JsonProperty("city")
	private String city;
	@JsonProperty("common_place_name")
	private String commonPlaceName;
	@JsonProperty("cross_street1")
	private String crossStreet1;
	@JsonProperty("cross_street2")
	private String crossStreet2;
	@JsonProperty("first_due")
	private String firstDue;
	@JsonProperty("geohash")
	private String geohash;
	@JsonProperty("latitude")
	private Double latitude;
	@JsonProperty("longitude")
	private Double longitude;
	@JsonProperty("name")
	private String name;
	@JsonProperty("number")
	private String number;
	@JsonProperty("postal_code")
	private String postalCode;
	@JsonProperty("prefix_direction")
	private String prefixDirection;
	@JsonProperty("response_zone")
	private String responseZone;
	@JsonProperty("state")
	private String state;
	@JsonProperty("suffix_direction")
	private String suffixDirection;
	@JsonProperty("type")
	private String type;

	@JsonProperty("address_id")
	public String getAddressId() {
		return addressId;
	}

	@JsonProperty("address_id")
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	@JsonProperty("address_line1")
	public String getAddressLine1() {
		return addressLine1;
	}

	@JsonProperty("address_line1")
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	@JsonProperty("city")
	public String getCity() {
		return city;
	}

	@JsonProperty("city")
	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty("common_place_name")
	public String getCommonPlaceName() {
		return commonPlaceName;
	}

	@JsonProperty("common_place_name")
	public void setCommonPlaceName(String commonPlaceName) {
		this.commonPlaceName = commonPlaceName;
	}

	@JsonProperty("cross_street1")
	public String getCrossStreet1() {
		return crossStreet1;
	}

	@JsonProperty("cross_street1")
	public void setCrossStreet1(String crossStreet1) {
		this.crossStreet1 = crossStreet1;
	}

	@JsonProperty("cross_street2")
	public String getCrossStreet2() {
		return crossStreet2;
	}

	@JsonProperty("cross_street2")
	public void setCrossStreet2(String crossStreet2) {
		this.crossStreet2 = crossStreet2;
	}

	@JsonProperty("first_due")
	public String getFirstDue() {
		return firstDue;
	}

	@JsonProperty("first_due")
	public void setFirstDue(String firstDue) {
		this.firstDue = firstDue;
	}

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

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("number")
	public String getNumber() {
		return number;
	}

	@JsonProperty("number")
	public void setNumber(String number) {
		this.number = number;
	}

	@JsonProperty("postal_code")
	public String getPostalCode() {
		return postalCode;
	}

	@JsonProperty("postal_code")
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@JsonProperty("prefix_direction")
	public String getPrefixDirection() {
		return prefixDirection;
	}

	@JsonProperty("prefix_direction")
	public void setPrefixDirection(String prefixDirection) {
		this.prefixDirection = prefixDirection;
	}

	@JsonProperty("response_zone")
	public String getResponseZone() {
		return responseZone;
	}

	@JsonProperty("response_zone")
	public void setResponseZone(String responseZone) {
		this.responseZone = responseZone;
	}

	@JsonProperty("state")
	public String getState() {
		return state;
	}

	@JsonProperty("state")
	public void setState(String state) {
		this.state = state;
	}

	@JsonProperty("suffix_direction")
	public String getSuffixDirection() {
		return suffixDirection;
	}

	@JsonProperty("suffix_direction")
	public void setSuffixDirection(String suffixDirection) {
		this.suffixDirection = suffixDirection;
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