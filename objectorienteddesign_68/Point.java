/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorienteddesign_68;

/**
 *
 * @author COM07
 */
public class Point {
    int x, y; //Field Ok if Not add values is Global Varliable
    
    Point(int x,int y){
        this.x = x;
        this.y = y;
       System.out.println("Hello " + x + y);
    }
    
    Point(){
       System.out.println("Hello Over");
    }
    
    Point(String Name){
       System.out.println("Hello Over2 " + Name);
    }
    
    public int sum(){
        return this.x + this.y;
    }
    
    public int sum(int x, int y){
        return x + y;
    }
}
