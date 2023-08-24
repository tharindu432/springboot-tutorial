package com.studentManagementSystem.demo2.Service;

import com.studentManagementSystem.demo2.model.Employee;

import java.util.List;

public interface EmployeeService {
  Employee saveEmployee(Employee employee);
  List<Employee> getAllEmployees();

  Employee getEmployeeById(long id);
  Employee updateEmployee(Employee employee,long id);

  void deleteEmployee(long id);



}
