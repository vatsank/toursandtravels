package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PaymentClientController {

	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path = "/client")
	public String fetchPayments() {
		
		// The following code would have been used with Service Registry and Discovery
		
	//String resp2 = template.getForObject("http://localhost:2020/payment", String.class)
		
		// Since SRD is available we use a logical name
	  String resp = template.getForObject("http://PAYMENT-SERVICE/payment", String.class);
	
	  String guides = template.getForObject("http://TOURIST-GUIDE-SERVICE/api/v1/guides", String.class);

	   return resp + guides;
	}
}
