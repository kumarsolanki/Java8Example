package com.solanki.functionaInterface;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDriver {

	static List<Employee> employees = new ArrayList<Employee>();
	static {

		Employee employee = new Employee(101, "Ashish", "Bangalore");
		Employee employee1 = new Employee(102, "Aadarsh", "Chandigarh");
		Employee employee2 = new Employee(103, "Amrita", "Bangalore");
		Employee employee3 = new Employee(104, "Aarti", "Gaya");
		Employee employee4 = new Employee(105, "Aradhana", "Bangalore");
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
	}

	public static  Employee getEmployee(int eid) {
		Employee employee = new Employee(101, "Ashish", "Bangalore");
		return employee;

	}

	public static List<Employee> getAllEmployee(){
		return employees;
	}
	
}
