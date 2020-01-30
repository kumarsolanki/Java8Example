package com.solanki.stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.solanki.functionaInterface.*;
import com.solanki.functionaInterface.Employee;

public class StreamExample {
	
	static Function<Employee, String> function = new Function<Employee, String>() {
		
		@Override
		public String apply(Employee t) {
			// TODO Auto-generated method stub
			return t.getEname();
		}
	};
	public static void main(String[] args) {
		List<Employee> employees = EmployeeDriver.getAllEmployee();
		List<String> names = employees.stream().map(function).collect(Collectors.toList());
		names.forEach(s->{
			System.out.println(s);
		});
	}

}
