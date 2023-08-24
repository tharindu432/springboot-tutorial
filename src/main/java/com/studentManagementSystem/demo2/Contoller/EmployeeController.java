package com.studentManagementSystem.demo2.Contoller;

import com.studentManagementSystem.demo2.Service.EmployeeService;
import com.studentManagementSystem.demo2.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        super();
        this.employeeService=employeeService;
    }

    //build create employee REST API

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody  Employee employee){
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);

    }

    //build get all employee REST API

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();

    }



}
