package com.bsoft.learningspringproject.repository;

import com.bsoft.learningspringproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAll();
}
