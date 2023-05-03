package com.example.section18accounts.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.section18accounts.model.Accounts;

public interface AccountsRepository extends CrudRepository<Accounts, Long> {
	
	Accounts findByCustomerId(int customerId);

}
