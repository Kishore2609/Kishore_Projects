package com.KodNest.Project.DAO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.KodNest.Project.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

	EntityManager em;

	@Autowired
	public EmployeeDAOImplementation(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Employee> getEmployees() {
		TypedQuery query = em.createQuery("from Employee", Employee.class);
		List<Employee> emplist = query.getResultList();
		return emplist;
	}

	@Override
	public Employee getEmployeeById(int id) {
		return em.find(Employee.class, id);
		
	}

	@Override
	public Employee createEmployee(Employee theEmployee) {
		Employee ref = em.merge(theEmployee);
		return ref;
	}

	@Override
	public void deleteEmployee(int id) {
		Employee ref = em.find(Employee.class, id);
		em.remove(ref);
	}

}
