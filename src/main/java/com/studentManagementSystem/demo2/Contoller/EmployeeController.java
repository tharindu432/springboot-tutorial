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

    //build get all employee BY id REST API
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
        return  new ResponseEntity<>(employeeService.getEmployeeById(employeeId),HttpStatus.OK);


        }

        //update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long employeeId, @RequestBody Employee employee){
        return  new ResponseEntity<>(employeeService.updateEmployee(employee,employeeId),HttpStatus.OK);
    }

    @DeleteMapping("{id}")

    public ResponseEntity<String>  deleteEmployee(@PathVariable("id")long employeeId){
        employeeService.deleteEmployee(employeeId);
        return  new ResponseEntity<>("Employee delted succesfully",HttpStatus.OK);

    }
    }



