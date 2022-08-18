package com.shouvick.graphqlspringbootapi.repository;

import com.shouvick.graphqlspringbootapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
