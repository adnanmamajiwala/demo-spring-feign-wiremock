package com.example.demospringfeignwiremock.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;

@Service
@FeignClient(value = "some-other-service", url = "${some-other-service.ribbon.listOfServers}")
public interface SomeOtherService {

    @PatchMapping("/hello")
    String checking();
}
