package com.studentManagementSystem.demo2.Service;

import com.studentManagementSystem.demo2.model.Employee;

import java.util.List;

public interface EmployeeService {
  Employee saveEmployee(Employee employee);
  List<Employee> getAllEmployees();
}
