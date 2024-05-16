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

    public Student() {
        this.name = "undefined";
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
