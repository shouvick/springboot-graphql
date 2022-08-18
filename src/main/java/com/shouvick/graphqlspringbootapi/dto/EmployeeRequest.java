package com.shouvick.graphqlspringbootapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeRequest {
    private String firstName;
    private String lastName;
    private String designation;
    private Double salary;
    private String department;
}
