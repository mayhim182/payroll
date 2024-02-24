package com.mayank.app.payroll.repository;

import com.mayank.app.payroll.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Long> {
}
