package org.crm.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@SpringBootApplication
//@EnableEurekaClient
//@EnableDiscoveryClient
//@EnableSwagger2
//@EnableWebMvc
//@EnableFeignClients(basePackages ="org.crm.core.api.feign")
//@EnableCaching
//@ComponentScan("org.crm")
//@EnableCircuitBreaker//开启断路器功能

@SpringBootApplication
@ServletComponentScan
@EnableCircuitBreaker
@EnableEurekaClient
@EnableDiscoveryClient
@EnableSwagger2
@EnableWebMvc
@EnableCaching
@ComponentScan("org.crm")
@EnableFeignClients(basePackages ="org.crm.core.api.feign")
public class CrmMemberApplication {
	public static void main(String[] args) {
        SpringApplication.run(CrmMemberApplication.class, args);
    }
}
