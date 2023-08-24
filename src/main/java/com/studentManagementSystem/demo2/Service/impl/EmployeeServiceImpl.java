package com.studentManagementSystem.demo2.Service.impl;

import com.studentManagementSystem.demo2.Service.EmployeeService;
import com.studentManagementSystem.demo2.exception.ResouceNotFoundException;
import com.studentManagementSystem.demo2.model.Employee;
import com.studentManagementSystem.demo2.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Employee getEmployeeById(long id){
        Optional<Employee> employee=employeeRepository.findById(id);
        if(employee.isPresent()){
            return employee.get();
        }
        else{
            throw new ResouceNotFoundException("Employee","id",id);
        }
    }

    @Override
    public Employee updateEmployee(Employee employee,long id){
        Employee exisitingEmployee = employeeRepository.findById(id).orElseThrow(
                ()-> new ResouceNotFoundException("Employee","Id",id));// lambda function ---instead of using if else statement we can use lambda function
        exisitingEmployee.setFirstName(employee.getFirstName());
        exisitingEmployee.setLastName(employee.getLastName());
        exisitingEmployee.setEmail(employee.getEmail());
        //save existing employee to the DB
        employeeRepository.save(exisitingEmployee) ;
        return exisitingEmployee;






    }
    @Override
    public void deleteEmployee(long id){
      employeeRepository.findById(id).orElseThrow(()-> new ResouceNotFoundException("Employee","Id",id));
      employeeRepository.deleteById(id);
    }


}
