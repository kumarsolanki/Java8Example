package com.solanki.functionaInterface;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class OptionalExample {
	static Predicate<Employee> predicate = new Predicate<Employee>() {

		@Override
		public boolean test(Employee t) {
			// TODO Auto-generated method stub
			return t.location.equalsIgnoreCase("Bangalore");
		}
	};
	static Consumer<Employee> consumer = new Consumer<Employee>() {

		@Override
		public void accept(Employee t) {
			// TODO Auto-generated method stub
			if (predicate.test(t))
				System.out.println(t.eid);

		}
	};

	static Optional<Employee> getOptionalEmployee() {
//		Optional<Employee> optional = Optional.of(null);
		Optional<Employee> optional = Optional.of(EmployeeDriver.getEmployee(101));
		return optional;
	}

	static Optional<List<Employee>> getOptionalAllEmployee() {
		Optional<List<Employee>> optional = Optional.of(EmployeeDriver.getAllEmployee());
		return optional;
	}

	static Optional<Employee> getOptionalOfNullableEmployee() {
		Optional<Employee> optional = Optional.ofNullable(EmployeeDriver.getEmployee(101));
		return optional;
	}

	static Supplier<String> supplier = new Supplier<String>() {

		@Override
		public String get() {
			// TODO Auto-generated method stub
			return "No ELement Found";
		}
	};

	static Supplier<Exception> supplierException = new Supplier<Exception>() {

		@Override
		public Exception get() {
			// TODO Auto-generated method stub
			return new RuntimeException("No ELement Found");
		}
	};

	public static void main(String[] args) throws Exception {
		System.out.println("****************************");
		if (getOptionalAllEmployee().isPresent()) {
			System.out.println(getOptionalAllEmployee().get().get(0).eid);
		}
		System.out.println(getOptionalEmployee());
		System.out.println(getOptionalAllEmployee());
		System.out.println(getOptionalAllEmployee().get());
		System.out.println("**************using consumer**************");
		getOptionalEmployee().ifPresent(consumer);
		getOptionalAllEmployee().get().forEach(consumer);
		System.out.println("****************************");
		String s = "Hello";
		Optional<String> optionalString = Optional.ofNullable(null);
		System.out.println(optionalString.map(String::toUpperCase).orElse("Default"));
		System.out.println(optionalString.map(String::toUpperCase).orElseGet(supplier));
//		System.out.println(optionalString.map(String::toUpperCase).orElseThrow(supplierException));
//		System.out.println(optionalString.get());
		getOptionalEmployee().ifPresent(consumer);
		getOptionalAllEmployee().get().stream().forEach(consumer);
	}
}
