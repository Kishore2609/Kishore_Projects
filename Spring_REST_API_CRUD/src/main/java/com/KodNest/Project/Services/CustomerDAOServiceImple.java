package com.KodNest.Project.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.KodNest.Project.DAO.CustomerJpa;
import com.KodNest.Project.Entity.Customer;

public class CustomerDAOServiceImple implements CustomerDAOService {

	CustomerJpa ref;

	@Autowired
	public CustomerDAOServiceImple(CustomerJpa ref) {
		this.ref = ref;
	}

	@Override
	public List<Customer> getAllCustomer() {
		return ref.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		Optional<Customer> op = ref.findById(id);
		Customer c = op.get();
		return c;
	}

	@Override
	public Customer createCustomer(Customer theCustomer) {
		return ref.save(theCustomer);
	}

	@Override
	public Customer updateCustomer(Customer theCustomer) {
		return ref.save(theCustomer);
	}

	@Override
	public void deleteCustomer(int id) {
		ref.deleteById(id);
	}

}
