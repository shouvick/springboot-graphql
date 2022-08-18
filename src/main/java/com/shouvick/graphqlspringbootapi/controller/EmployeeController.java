package com.shouvick.graphqlspringbootapi.controller;

import com.shouvick.graphqlspringbootapi.dto.EmployeeRequest;
import com.shouvick.graphqlspringbootapi.entity.Employee;
import com.shouvick.graphqlspringbootapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @MutationMapping("createEmployee")
    public Employee save( @Argument(name = "employee") EmployeeRequest employeeRequest) {
        return employeeService.save(employeeRequest);
    }

    @QueryMapping("getEmployees")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @QueryMapping("getEmployee")
    public Employee getById(@Argument int id) {
        return employeeService.getById(id);
    }



}


