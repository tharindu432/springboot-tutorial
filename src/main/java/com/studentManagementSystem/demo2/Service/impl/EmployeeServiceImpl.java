package com.studentManagementSystem.demo2.Service.impl;

import com.studentManagementSystem.demo2.Service.EmployeeService;
import com.studentManagementSystem.demo2.model.Employee;
import com.studentManagementSystem.demo2.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        super();
        this.employeeRepository=employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);


    }

    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }


}
