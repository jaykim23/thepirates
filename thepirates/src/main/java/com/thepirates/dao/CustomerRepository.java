package com.thepirates.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thepirates.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	//CRUD로 상속 받은 것이 아닌 이름을 가지고 하는 메소드를 만든것임
	List<Customer> findByName(String name);
}
