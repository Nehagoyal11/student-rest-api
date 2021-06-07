package com.api.student.bootreststudent.storage;

import java.util.ArrayList;
import java.util.List;

import com.api.student.bootreststudent.entities.Student;

public class Students{

    private List<Student> studentList;
      
    public List<Student> getStudentList()
    {
      
        if (studentList == null) {
      
            studentList = new ArrayList<>();
      
        }
      
        return studentList;
      
               
    }
      
    public void setStudentList(List<Student> studentList)
    {
        this.studentList = studentList;
    }
    
    
}
