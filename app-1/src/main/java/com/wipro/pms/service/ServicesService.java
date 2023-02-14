package com.wipro.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.app1.model.ServicesModel;
import com.pms.app1.repos.ServiceRepos;

@Service
public class ServicesService {

	@Autowired
	ServiceRepos service_repos;

	public ServicesModel saveService(ServicesModel service) {
		return service_repos.save(service);
	}

}
