package com.mayank.app.payroll.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity //JPA Annotation that denotes the whole class for storage in a relational table
public class Employee {
  private @Id
  @GeneratedValue Long id;
  //ID and GeneratedValue are JPA annotations to note the primary key and that it is generated automatically when
  //  needed
  private String firstName;
  private String lastName;
  private String description;

  private Employee(){}

  public Employee(String firstName, String lastName, String description){
    this.firstName = firstName;
    this.lastName = lastName;
    this.description = description;
  }

  @Override
  public boolean equals(Object o){
    if(this == o) return true;
    if(o==null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return Objects.equals(id,employee.id) && Objects.equals(firstName, employee.firstName)
           && Objects.equals(lastName, employee.lastName) && Objects.equals(description, employee.description);
  }

  @Override
  public int hashCode(){
    return Objects.hash(id,firstName,lastName,description);
  }

  public Long getId(){
    return id;
  }

  public void setId(Long id){
    this.id = id;
  }

  public String getFirstName(){
    return firstName;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getLastName(){
    return lastName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public String getDescription(){
    return description;
  }

  public void setDescription(){
    this.description = description;
  }

  @Override
  public String toString(){
    return "Employee{ id = "+id+", firstName = "+
      firstName+", lastName = "+lastName+" description = "+description+" }";
  }

}