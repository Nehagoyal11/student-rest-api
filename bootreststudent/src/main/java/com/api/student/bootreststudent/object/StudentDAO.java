package com.api.student.bootreststudent.object;

import com.api.student.bootreststudent.entities.Student;
import com.api.student.bootreststudent.storage.Students;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO {
  
    private static Students list = new Students();

    static
    {
  
        list.getStudentList().add(new Student(1,10,"abc",32));
  
        list.getStudentList().add(new Student(2,12,"xyz",10));
  
        list.getStudentList().add(new Student(3,4,"lmn",88));
  
           
    }
  
    public Students getAllStudents()
    {
        return list;
    }
  
       
    public void addStudent(Student student)
    {
        list.getStudentList().add(student);
    
           
    }
}





