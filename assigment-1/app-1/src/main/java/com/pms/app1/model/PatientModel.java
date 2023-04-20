package com.pms.app1.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class PatientModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//	@Size(min = 8, message = "Enter atleast 8 characters")
	private String firstname;
	private String lastname;
	@ManyToMany()
	private List<ServicesModel> services;

	public PatientModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PatientModel(String firstname, String lastname, List<ServicesModel> services) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.services = services;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public List<ServicesModel> getService() {
		return services;
	}

	public void setService(List<ServicesModel> service) {
		this.services = service;
	}

	@Override
	public String toString() {
		return "PatientModel [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", services="
				+ services + "]";
	}


}
