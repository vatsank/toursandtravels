package com.example.demo.cotrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Payment;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RefreshScope
public class PaymentController {

	@Value("${user.name}")
	private String name;
	
	@Autowired
	private Payment payment;
	
	
	@GetMapping(path = "/payment")
	public Payment getPayment() {
		log.info("=======Reading from git"+name);
		payment.setCustomerName(name);
		return payment;
	}
}
