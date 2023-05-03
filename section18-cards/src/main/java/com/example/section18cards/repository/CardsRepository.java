package com.example.section18cards.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.section18cards.model.Cards;

@Repository
public interface CardsRepository extends CrudRepository<Cards, Long>{
	
	List<Cards> findByCustomerId(int customerId);

}
