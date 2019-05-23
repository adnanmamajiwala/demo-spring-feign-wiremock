package com.example.demospringfeignwiremock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@EnableFeignClients
@SpringBootApplication
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
public class DemoSpringFeignWiremockApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringFeignWiremockApplication.class, args);
    }

}
