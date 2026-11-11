package com.CodeCoreAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.CodeCoreAPI.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
