/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author helip
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] sArray = {
            new Student("Bobby"),
            new Student("Cassandra"),
            new Student("Braden"),
            new Student("John"),
            new Student("Billy"),
            new Student("Gillian")
        };

        int c = 1;
        for (Student x : sArray) {
            System.out.println("Student " + c + ": " + x.getName());
            c++;
        }
    }
}
    
    

