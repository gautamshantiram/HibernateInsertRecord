package com.srg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class VehicleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="vin")
	private String vin;
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;
	
	
	@Column(name="year")
	private int year;
	
	@Column(name="type")
	private String type;

//=============================================
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getVin() {
		return vin;
	}


	public void setVin(String vin) {
		this.vin = vin;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	
}