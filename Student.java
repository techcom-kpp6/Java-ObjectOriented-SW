/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author Banana
 */
public class Student {
    String studentId, name, major;
    double gpa;
    
    Student(String StudentId, String name, String major, double gpa){
        this.studentId = StudentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
    public void showProfile(){
        System.out.println("------------------------------------");
        System.out.println("StudentID: "+studentId);
        System.out.println("Name: "+name);
        System.out.println("Major: "+major);
        System.out.println("GPA: "+gpa);
        System.out.println("------------------------------------");
    }
    public void updateGpa(double newGpa){
        System.out.println("------------------------------------");
        gpa =+ newGpa;
        System.out.println("GPA: "+gpa);
        System.out.println("------------------------------------");
    }
         
    public static void main(String[] args) {
        Student St = new Student("661320706", "Watchara Boonlert", "Technology Computer", 3.00);
        St.showProfile();
    }
}
