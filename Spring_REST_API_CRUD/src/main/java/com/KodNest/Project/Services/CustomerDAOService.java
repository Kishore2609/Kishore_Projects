package com.KodNest.Project.Services;

import java.util.List;

import com.KodNest.Project.Entity.Customer;

public interface CustomerDAOService {

	public List<Customer> getAllCustomer();

	public Customer getCustomerById(int id);

	public Customer createCustomer(Customer theCustomer);

	public Customer updateCustomer(Customer theCustomer);

	public void deleteCustomer(int id);
}
