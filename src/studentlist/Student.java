/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author helip
 */
public class Student {
    
    String name;
    String studentId;
    String address;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student() {
        this.name = "undefined";
        this.studentId = "undefined";
        this.address = "undefined";
    }

    public Student(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setName(Student s, String n) {
        s.name = n;
    }
}
