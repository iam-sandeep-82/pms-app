package com.pms.app1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ServicesModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ids;
	private String name;
	private float price;


	public ServicesModel(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	public ServicesModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ServicesModel [name=" + name + ", price=" + price + "]";
	}


	public int getId() {
		return ids;
	}


	public void setId(int id) {
		this.ids = id;
	}

	public int getIds() {
		return ids;
	}

	public void setIds(int ids) {
		this.ids = ids;
	}

	//	public PatientModel getPatient() {
	//		return patient;
	//	}

	//	public void setPatient(PatientModel patient) {
	//		this.patient = patient;
	//	}
}
