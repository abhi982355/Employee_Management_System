package com.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.Enitity.Classes.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
