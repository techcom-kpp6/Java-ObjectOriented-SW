/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author Banana
 */
public class Student2 {
    String id, fullname, major, feverlet;
    
    Student2(String id, String fullname, String major, String feverlet){
        this.id = id;
        this.fullname = fullname;
        this.major = major;
        this.feverlet = feverlet;
    }
    private void stInfo(){
        System.out.println("StudentID: "+id);
        System.out.println("FullName: "+fullname);
        System.out.println("Major: "+major);
        System.out.println("Feverlet: "+feverlet);
    }
         
    public static void main(String[] args) {
        Student2 St = new Student2("661320706","Watchara Boonlert","Technology Computer", "Code.");
        St.stInfo();
    }
}
