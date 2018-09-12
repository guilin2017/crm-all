package org.crm.point;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CrmPointApplication {
	public static void main(String[] args) {
        SpringApplication.run(CrmPointApplication.class, args);
    }
}
