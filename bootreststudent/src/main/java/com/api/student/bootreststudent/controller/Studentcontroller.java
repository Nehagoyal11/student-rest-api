package com.api.student.bootreststudent.controller;

import java.net.URI;

import com.api.student.bootreststudent.entities.Student;
import com.api.student.bootreststudent.object.StudentDAO;
import com.api.student.bootreststudent.storage.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.webservices.WebServicesProperties.Servlet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(path = "/students")

public class Studentcontroller {
  
   @Autowired
   private StudentDAO studentDao;
   @GetMapping(path = "/",produces = "application/json")
   public Students getEmployees()
    {
        return studentDao.getAllStudents();
    }
    @PostMapping(path = "/",consumes = "application/json", produces = "application/json")
  
    public ResponseEntity<Object>addStudent(@RequestBody Student student)
    {
        
        int id = studentDao.getAllStudents().getStudentList().size() + 1;

       student.setId(id);

       studentDao.addStudent(student);
       URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(student.getId()).toUri();

        return ResponseEntity.created(location).build();
     
  
        
    }
}