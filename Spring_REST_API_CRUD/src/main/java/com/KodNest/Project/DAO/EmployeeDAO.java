package com.KodNest.Project.DAO;

import java.util.List;
import com.KodNest.Project.Entity.Employee;

public interface EmployeeDAO {

	public List<Employee> getEmployees();

	public Employee getEmployeeById(int id);

	public Employee createEmployee(Employee theEmployee);

	public void deleteEmployee(int id);
}
