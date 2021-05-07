package com.thepirates;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thepirates.dao.CustomerRepository;
import com.thepirates.entity.Customer;

@RestController
public class CustomerController {
	
	private CustomerRepository repository;

	public CustomerController(CustomerRepository repository) {
		super();
		this.repository = repository;
	}
	
	@PutMapping("/customer")
	public Customer putCustomer(Customer customer) {
		return repository.save(customer);
	}
	@PostMapping("/customer")
	public Customer postCustomer(Customer customer) {
		return repository.save(customer);
	}
	@DeleteMapping("/customer")
	public void deleteCustomer(int id) {
		repository.deleteById(id);
	}
	
	@GetMapping("/customer")
	public Customer getCustomer(int id) {
		return repository.findById(id).orElseThrow();
	}
	
	
	@GetMapping("/customer/name") public List<Customer> getCustomer(String name){
		return repository.findByName(name); 
	}
	 
	
	@GetMapping("/customer/list")
	public List<Customer>getcustomerlist(){
		return(List<Customer>) repository.findAll();
	}
	
	
}
