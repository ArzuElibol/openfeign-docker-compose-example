package com.siber.calculationservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {
    
    @GetMapping("/{price}/{productType}")
    public Double CalculateTotalPrice(@PathVariable double price, @PathVariable String productType){

        int tax=0;
        if (productType.equalsIgnoreCase("lux")){
            tax=25;
            }    else if (productType.equalsIgnoreCase("standart")){
                tax=18;
                 } else if (productType.equalsIgnoreCase("must")){
                    tax=8;
                 }
                 return price + (price * tax / 100);
    } 

    @GetMapping("/ratios")
    public String getRatios(){
        return "LUX=25, STANDART=18, MUST=8";
    }
}
