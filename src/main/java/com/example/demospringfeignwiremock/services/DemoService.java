package com.example.demospringfeignwiremock.services;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "demo-service", url = "${demo-service.ribbon.listOfServers}")
public interface DemoService {

    @GetMapping("demo")
    String getValue();
}
