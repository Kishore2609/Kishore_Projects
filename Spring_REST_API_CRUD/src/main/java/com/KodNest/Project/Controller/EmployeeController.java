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
import com.KodNest.Project.Entity.Employee;
import com.KodNest.Project.Services.EmployeeDAOService;

@RestController
@RequestMapping("/empapi")
public class EmployeeController {

	EmployeeDAOService edaos;

	@Autowired
	public EmployeeController(EmployeeDAOService edaos) {
		this.edaos = edaos;
	}

	@GetMapping("/getallemployees")
	public List<Employee> getAllEmployees() {
		return edaos.getEmployee();
	}

	@GetMapping("/getemployeebyid/{empId}")
	public Employee getEmployeeById(@PathVariable int empId) {
		return edaos.getEmployeeById(empId);
	}

	@PostMapping("/createemployee")
	public Employee createEmployee(@RequestBody Employee emp) {
		return edaos.createEmployee(emp);
	}

	@PutMapping("/updateemployee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return edaos.updateEmployee(emp);
	}

	@DeleteMapping("/deleteemployee/{empId}")
	public String deleteEmployee(@PathVariable int empId) {
		edaos.deleteEmployee(empId);
		return "Delete Success";
	}
}
