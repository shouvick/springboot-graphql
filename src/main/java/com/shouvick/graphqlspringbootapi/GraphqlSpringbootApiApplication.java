package com.shouvick.graphqlspringbootapi;

import com.shouvick.graphqlspringbootapi.dto.EmployeeRequest;
import com.shouvick.graphqlspringbootapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlSpringbootApiApplication implements CommandLineRunner {
	@Autowired
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlSpringbootApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		EmployeeRequest employee1 = new EmployeeRequest();
		employee1.setFirstName("Test1");
		employee1.setLastName("Test2");
		employee1.setDesignation("Test3");
		employee1.setDepartment("Test4");
		employee1.setSalary(1000.00);
		employeeService.save(employee1);

		EmployeeRequest employee2 = new EmployeeRequest();
		employee2.setFirstName("Test5");
		employee2.setLastName("Test6");
		employee2.setDesignation("Test7");
		employee2.setDepartment("Test8");
		employee2.setSalary(2000.00);
		employeeService.save(employee2);

	}
}
