package com.kidest.employeemanager.repo;

import com.kidest.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    //spring automatically creates query to delete employee where it has this id using the method name
    void deleteEmployeeById(Long id);

    //returns optional instead of employee incase id is invalid and you don't get employee
    Optional<Employee> findEmployeeById(Long id);
}
