package com.shopnpay.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ShopNPayAdminWebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopNPayAdminWebservicesApplication.class, args);
	}

}
