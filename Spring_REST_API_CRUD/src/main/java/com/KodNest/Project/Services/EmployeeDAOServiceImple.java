package com.KodNest.Project.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.KodNest.Project.DAO.EmployeeDAO;
import com.KodNest.Project.Entity.Employee;

@Service
public class EmployeeDAOServiceImple implements EmployeeDAOService {

	EmployeeDAO edao;

	@Autowired
	public EmployeeDAOServiceImple(EmployeeDAO edao) {
		this.edao = edao;
	}

	@Override
	@Transactional
	public List<Employee> getEmployee() {
		return edao.getEmployees();
	}

	@Override
	@Transactional
	public Employee getEmployeeById(int id) {
		return edao.getEmployeeById(id);
	}

	@Override
	@Transactional
	public Employee createEmployee(Employee theEmployee) {
		return edao.createEmployee(theEmployee);
	}

	@Override
	@Transactional
	public Employee updateEmployee(Employee theEmployee) {
		return edao.createEmployee(theEmployee);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		edao.deleteEmployee(id);
	}

}
