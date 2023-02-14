package com.pms.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pms.app1.model.PatientModel;
import com.pms.app1.model.ServicesModel;
import com.pms.app1.repos.PatientRepos;
import com.pms.app1.repos.ServiceRepos;
import com.wipro.pms.service.PatientService;
import com.wipro.pms.service.ServicesService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	PatientRepos patient_repos;
	@Autowired
	PatientService patient_service;
	@Autowired
	ServiceRepos service_repos;
	@Autowired
	ServicesService services_service;


	@GetMapping("/")
	public String __(ModelMap model) {
		model.put("message", "nice to see you again");
		return "index";
	}

	@GetMapping("/home")
	public String home(ModelMap model) {
		model.put("message", "nice to see you again");
		return "index";
	}



	@GetMapping("/reg-service")
	public String regService(ModelMap model) {
		List<ServicesModel> list_services = service_repos.findAll();
		model.put("list_services", list_services);
		return "regService";
	}

	@PostMapping("/save-service")
	public String saveService(ModelMap model, @ModelAttribute("name") String name, @ModelAttribute("price") int price) {
		ServicesModel new_service = new ServicesModel(name, price);

		ServicesModel save_service = services_service.saveService(new_service);
		if (save_service != null) {
			model.put("patient_name", save_service.getName());
			model.put("key", "value");
			return "regSuccess";
		}
		return "regFailed";
	}

	@GetMapping("/show-service")
	public String showService(ModelMap model) {
		List<ServicesModel> list_services = service_repos.findAll();
		model.put("list_services", list_services);
		return "showServices";
	}

	@GetMapping("/showserv/{objectId}")
	public String showPatientById(ModelMap model, @PathVariable int id) {
		PatientModel patient = patient_service.findById(id);
		List<ServicesModel> list_services = patient.getService();
		model.put("list_services", list_services);
		model.put("patient", patient);
		return "showPatientServices";
	}

	@GetMapping("/show-patient")
	public String showPatient(ModelMap model) {
		List<PatientModel> list_patients = patient_service.findAll();
		model.put("list_patients", list_patients);
		return "showPatient";
	}

}
