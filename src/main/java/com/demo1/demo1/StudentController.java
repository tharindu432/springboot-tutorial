package com.demo1.demo1;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    //@path variable
    //http:localhost:8080/student/tharindu/perera
    @GetMapping(path="/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);

    }

    //request param ---rest api to handle query parameters
    //http:localhost:8080/student?firstName=tharindu&lastName=perera

    @GetMapping("/student-test" )
    public Student getstudentQueryParam(@RequestParam(name="firstName") String firstName,@RequestParam(name="lastName") String lastName ){
        return new Student(firstName,lastName);
    }

}
