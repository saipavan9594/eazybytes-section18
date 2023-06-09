package com.example.section18accounts.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Accounts {
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "account_number")
	@Id
	private long accountNumber;
	@Column(name = "account_type")
	private String accountType;
	@Column(name = "branch_address")
	private String branch;
	@Column(name = "create_dt")
	private LocalDate createdDate;

}
