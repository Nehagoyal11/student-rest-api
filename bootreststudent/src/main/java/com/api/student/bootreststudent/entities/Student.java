package com.api.student.bootreststudent.entities;

public class Student {

    private int id;
    private int student_class;
    private String  name;
    private int roll_no;

    public Student(int id,int student_class, String name, int roll_no) {
        super();
        this.id=id;
        this.student_class = student_class;
        this.name = name;
        this.roll_no = roll_no;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudent_class() {
        return student_class;
    }

    public void setStudent_class(int student_class) {
        this.student_class = student_class;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", roll_no=" + roll_no + ", student_class=" + student_class
                + "]";
    }
     

     


    

    

    
}
