package com.example.section18accounts.service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.section18accounts.model.Customer;
import com.example.section18accounts.model.Loans;

@FeignClient("loans")
public interface LoansFeignClient {
	
	@RequestMapping(method = RequestMethod.POST, value = "myLoans", consumes = "application/json")
	List<Loans> getLoanDetails(@RequestHeader("eazybank-correlation-id") String correlationid, @RequestBody Customer customer);

}
