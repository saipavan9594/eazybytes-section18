package com.example.section18cards.model;


import jakarta.persistence.Id;

import lombok.Data;

@Data
public class Customer {
	
	@Id
	private int customerId;

}
