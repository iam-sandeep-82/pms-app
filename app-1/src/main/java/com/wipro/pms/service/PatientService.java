package com.wipro.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pms.app1.model.PatientModel;
import com.pms.app1.repos.PatientRepos;

public class PatientService {
	@Autowired
	PatientRepos patient_repos;

	public PatientModel savePatient(PatientModel patient) {
		return patient_repos.save(patient);
	}

	public List<PatientModel> findAll() {
		return patient_repos.findAll();
	}

	public PatientModel findById(int id) {
		return patient_repos.findById(id).get();
	}

}

