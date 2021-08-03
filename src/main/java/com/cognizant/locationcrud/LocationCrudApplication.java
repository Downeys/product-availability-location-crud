package com.cognizant.locationcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocationCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationCrudApplication.class, args);
	}
//   sh 'kubectl rollout restart deployment/bcpa-location-controller  --namespace=default'
}
