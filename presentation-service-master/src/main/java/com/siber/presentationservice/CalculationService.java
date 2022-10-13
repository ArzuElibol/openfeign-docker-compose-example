package com.siber.presentationservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "calculation-service", url = "http://calculationservicemaster:8081/")
public interface CalculationService{
        
@GetMapping("/{price}/{productType}")
Double showTotalPrice(@PathVariable double price,@PathVariable String productType);
}
