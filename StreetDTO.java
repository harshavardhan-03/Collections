package com.xworkz.dto;

import java.io.Serializable;

public class StreetDTO implements Serializable {
	private String name;
	private int pincode;
	private String landMark;
	private String city;

	StreetDTO() {
		System.out.println("default constructor");
	}

	public StreetDTO(String name, int pincode, String landMark, String city) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.landMark = landMark;
		this.city = city;
	}

	@Override
	public String toString() {
		return "StreetDTO [name=" + name + ", pincode=" + pincode + ", landMark=" + landMark + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
    
	
}