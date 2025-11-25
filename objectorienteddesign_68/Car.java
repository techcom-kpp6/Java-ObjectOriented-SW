/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectorienteddesign_68;

/**
 *
 * @author COM07
 */
public class Car {
    String brand;
    String color;
    float speed;
    Car(String brand, String color,float speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }
    
    public void showInfo(){
        System.out.println("Brand = "+brand);
        System.out.println("Color = "+color);
        System.out.println("Speed = "+speed);
    }
    
    public void accelerate(int value){
        this.speed = value;
    }
    public void breaks(){
        this.speed = 0;
    }
}
    