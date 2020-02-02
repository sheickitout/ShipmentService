package com.shipment.uspsshipmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UspsShipmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UspsShipmentServiceApplication.class, args);
	}

}
