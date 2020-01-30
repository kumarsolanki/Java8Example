package com.solanki.functionaInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerProducerExample {

	static Predicate<Employee> predicate = new Predicate<Employee>() {

		@Override
		public boolean test(Employee t) {
			return (t.ename.equalsIgnoreCase("Ashish"));
			// TODO Auto-generated method stub
		}
	};
	static Consumer<Employee> consumer = new Consumer<Employee>() {

		@Override
		public void accept(Employee t) {
			// TODO Auto-generated method stub
			if (t.ename.equalsIgnoreCase("aadarsh")) {
				System.out.println(t.eid + "  " + t.location);
			}

		}
	};

	static Consumer<Employee> consumerPredicate = new Consumer<Employee>() {

		@Override
		public void accept(Employee t) {
			// TODO Auto-generated method stub
			if (predicate.test(t)) {
				System.out.println(t.eid + "  " + t.location);
			}

		}
	};

	public static void main(String[] args) {
		List<Employee> employees = EmployeeDriver.getAllEmployee();
		employees.forEach(employee -> {
			System.out.println(employee.eid);
		});
		System.out.println("*****************************");
		employees.forEach(consumer);
		System.out.println("*****************************");
		employees.forEach(consumerPredicate);
		System.out.println("*****************************");
		employees.forEach((employee)->{
			if(predicate.test(employee)) {
				System.out.println(employee.eid);
			}
		});
	}

}
