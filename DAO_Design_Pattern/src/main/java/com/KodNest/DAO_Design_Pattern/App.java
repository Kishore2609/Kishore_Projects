package com.KodNest.DAO_Design_Pattern;

import java.util.List;

public class App {

	public static void main(String[] args) {

		EmployeeDAO ref = new EmployeeDAOImplementation();

/*
		// Get the List of Employees
		List<Employee> emplist = ref.getEmployees();
		for (Employee employee : emplist) {
			System.out.println(employee);
		}
		
		System.out.println("===============================================");
*/
		
		// Get Employee By Id
		Employee employee = ref.getEmployeeById(1);
		System.out.println(employee);

		System.out.println("===============================================");
		
/*
		// Create New Employee Details
		Employee emp = new Employee("Swaroop", "Sales");
		String result = ref.persistEmployee(emp);
		System.out.println(result);

		System.out.println("===============================================");
*/
		
	
 		// Update Employee Details
		Employee e2 = ref.getEmployeeById(4);
		e2.setDepartment("Accounts");
		String status = ref.updateEmployee(e2);
		System.out.println(status);
		
		System.out.println("===============================================");
	
		
/*
 		// Delete the Employee Details

		Employee empobj = ref.getEmployeeById(3);
		String status = ref.deletetEmployee(empobj);
		System.out.println(status);
		
		System.out.println("===============================================");
 */
		
	}
}
