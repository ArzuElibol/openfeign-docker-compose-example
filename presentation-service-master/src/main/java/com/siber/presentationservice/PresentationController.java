package com.siber.presentationservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PresentationController {

    private final CalculationService calculationService;
   // private RestTemplate restTemplate = new RestTemplate();
  
   public PresentationController(CalculationService calculationService) {
    this.calculationService = calculationService;
}

//     @GetMapping("/{price}/{productType}")
// public String showTotalPrice(@PathVariable double price,@PathVariable String productType){
//    String resourceUrl="http://localhost:8081/"+price+"/"+ productType;  
//    ResponseEntity<Double> response = restTemplate.getForEntity(resourceUrl, Double.class);
//    return "Product Price: " + price + "   ---   Product Type: " + productType + "   ---   Total Price: " + productType
//            + "   ---   Total Price: " + response.getBody();
// }


@GetMapping("/{price}/{productType}")
public String showTotalPrice(@PathVariable double price, @PathVariable String productType) {
    Double totalPrice = calculationService.showTotalPrice(price, productType);
    return "Product Price: " + price + "   ---   Product Type: " + productType + "   ---   Total Price: " + productType
            + "   ---   Total Price: " + totalPrice;
}
}
