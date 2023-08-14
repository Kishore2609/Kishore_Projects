package com.KodNest.Project.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.KodNest.Project.Entity.Customer;
import com.KodNest.Project.Services.CustomerDAOService;

@RestController
@RequestMapping("/custapi")
public class CustomerController {

	CustomerDAOService cdaos;

	@Autowired
	public CustomerController(CustomerDAOService cdaos) {
		this.cdaos = cdaos;
	}

	@GetMapping("/getallcustomers")
	public List<Customer> getAllCustomers() {
		return cdaos.getAllCustomer();
	}

	@GetMapping("/getcustomerbyid/{custId}")
	public Customer getCustomerById(@PathVariable int custId) {
		return cdaos.getCustomerById(custId);
	}

	@PostMapping("/createcustomer")
	public Customer createCustomer(@RequestBody Customer cust) {
		return cdaos.createCustomer(cust);
	}

	@PutMapping("/updatecustomer")
	public Customer updateCustomer(@RequestBody Customer cust) {
		return cdaos.updateCustomer(cust);
	}

	@DeleteMapping("/deletecustomer/custId}")
	public String deleteCustomer(@PathVariable int custId) {
		cdaos.deleteCustomer(custId);
		return "Delete Success";
	}

}
