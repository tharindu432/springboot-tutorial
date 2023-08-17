package com.demo1.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public Student getStudent() {
        return new Student("tharindu", "Ruwanpathirana");

    }

    @GetMapping("/students")

    public List<Student> getStudents() {
        List<Student> students= new ArrayList<>();
        students.add(new Student("tharindu", "Ruwanpathirana"));
        students.add(new Student("tharindu", "Ruwanpathirana"));
        students.add(new Student("tharindu", "Ruwanpathirana"));
        return students;


    }

}
