package com.shouvick.graphqlspringbootapi.service;

import com.shouvick.graphqlspringbootapi.dto.EmployeeRequest;
import com.shouvick.graphqlspringbootapi.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    Employee save(EmployeeRequest employeeRequest);

    List<Employee> getAll();

    Employee getById(int bookId);

}
