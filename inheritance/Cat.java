/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author COM07
 */
public class Cat extends Animal{
    public String name = "Cat";
    public String type = "Mammal";
    int legs = 4;
    
    @Override
    public String sayName(){
        return name;
    }
    
    //Overloads
    public String sayName(String name){
        super.name = name;
        return super.name;
    }
    
    //Overloads
    public String sayName(String name, int legs){
        super.name = name;
        super.legs = legs;
        return super.name+" "+super.legs; 
    }
//    String name = "Cat";
//    int legs = 4;
//    
//    public String name(){
//        return super.name;
//    }
//    
//    public int legs(){
//        return super.legs;
//    }
//    
//    public String catSayName(){
//        return super.sayName();
//    }
}
