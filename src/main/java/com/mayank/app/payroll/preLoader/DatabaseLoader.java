package com.mayank.app.payroll.preLoader;

import com.mayank.app.payroll.models.Employee;
import com.mayank.app.payroll.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

  private final EmployeeRepo employeeRepo;

  @Autowired
  public DatabaseLoader(EmployeeRepo repo){
    this.employeeRepo = repo;
  }

  @Override
  public void run(String... strings) throws Exception{
    this.employeeRepo.save(new Employee("Frodo", "Baggins", "ring bearer"));
  }
}
