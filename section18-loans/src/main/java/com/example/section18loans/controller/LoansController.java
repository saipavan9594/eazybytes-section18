package com.example.section18loans.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.section18loans.config.LoansServiceConfig;
import com.example.section18loans.model.Customer;
import com.example.section18loans.model.Loans;
import com.example.section18loans.model.Properties;
import com.example.section18loans.repository.LoansRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@RestController
public class LoansController {
	
	private static final Logger log=LoggerFactory.getLogger(LoansController.class);

	@Autowired
	private LoansRepository loansRepository;
	
	@Autowired
	LoansServiceConfig loansConfig;

	@PostMapping("/myLoans")
	public List<Loans> getLoansDetails(@RequestHeader("eazybank-correlation-id") String correlationid, @RequestBody Customer customer) {
		//System.out.println("Invoking loans service::");
		log.info("Inside getLoansDetails() method");
		List<Loans> loans = loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId());
		log.info("End of getLoansDetails() method");
		if (loans != null) {
			return loans;
		} else {
			return null;
		}
		
		

	}
	
	//@GetMapping("/loans/properties")
	@GetMapping(path = "/loans/properties", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getPropertyDetails() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		Properties properties = new Properties(loansConfig.getMsg(), loansConfig.getBuildVersion(),
				loansConfig.getMailDetails(), loansConfig.getActiveBranches());
		String jsonStr = ow.writeValueAsString(properties);
		return jsonStr;
	}

}