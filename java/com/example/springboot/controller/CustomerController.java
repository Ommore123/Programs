package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.series.springboot.model.Customer;
import com.series.springboot.service.CustomerService;
@RestController
public class CustomerController {
	@Autowired
	 private CustomerService service;
	 
	 @PostMapping(“/create_customer”)
	 public Customer createCustomer(@RequestBody Customer customer) {
	 return service.createCustomer(customer);
	 }
	 
	 @GetMapping(“get_customer/{cid}”)
	 public Customer getCustomer(@PathVariable int cid) {
	 return service.getCustomerById(cid);
	 }
	 
	 @DeleteMapping(“/delete_customer/{uid}”)
	 public String deleteCustomer(@PathVariable int cid) {
	 return service.deleteCustomerById(cid);
	 }
	 
	 @PutMapping(“/update_customer”)
	 public Customer updateCustomer(@RequestBody Student student) {
	 return service.updateStudent(student);
	 }
}
