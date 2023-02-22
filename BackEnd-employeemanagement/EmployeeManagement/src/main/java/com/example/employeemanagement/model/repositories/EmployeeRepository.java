package com.example.employeemanagement.model.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagement.model.entities.Employee;

@RestController
@Repository
@CrossOrigin
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	

  Optional<Employee> findEmployeeById(Long id);

	void deleteEmployeeById(Long id);

}
