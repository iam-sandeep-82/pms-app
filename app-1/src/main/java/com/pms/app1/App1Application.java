package com.pms.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wipro.pms.service.PatientService;
import com.wipro.pms.service.ServicesService;

@Configuration
@SpringBootApplication
public class App1Application {

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
		System.out.println();
		System.out.println("PMS - APPLICATION RUNNING :)");
	}

	@Bean
	public PatientService patientService() {
		return new PatientService();
	}

	@Bean
	public ServicesService serviceService() {
		return new ServicesService();
	}

}
