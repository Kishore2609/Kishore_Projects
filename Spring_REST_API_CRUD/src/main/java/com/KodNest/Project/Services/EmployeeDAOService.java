package com.KodNest.Project.Services;

import java.util.List;

import com.KodNest.Project.Entity.Employee;

public interface EmployeeDAOService {

	public List<Employee> getEmployee();

	public Employee getEmployeeById(int id);

	public Employee createEmployee(Employee theEmployee);
	
	public Employee updateEmployee(Employee theEmployee);

	public void deleteEmployee(int id);
}
