package com.examples.springboot.service;


import java.util.List;

import com.example.customerservice.model.Customers;

public interface CustomerServicee {
	public String insertCustomer(Customers customer);
    public List<Customers> displayAllCustomers();
    public String deleteCustomer(int cid);
    public List<Customers> searchCustomersByCustomerId(String customer);
	public List<Customers> searchCustomersByOrderId(int oid);
		
}
