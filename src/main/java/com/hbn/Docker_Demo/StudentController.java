package com.hbn.Docker_Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @RequestMapping("/getStudents")
    public List<Students> studentsList(){
//        return List.of(
//                new Students(1, "Hari", 22),
//                new Students(2, "Balan", 23),
//                new Students(3, "Siva", 55)
//        );
        return studentRepo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudents(){
        Students s = new Students();
        s.setName("Sugesh");
        s.setAge(32);

        studentRepo.save(s);


    }

}