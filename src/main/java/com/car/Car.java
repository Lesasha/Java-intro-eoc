package com.car;

public class Car {
 private String color;
 private int year;
 private int speed;
 private int maxSpeed; 
 private boolean isElastic;

public Car(String color, int year, int maxSpeed) {
    this.color = color;
    this.isElastic = true; 

    year = new int[];
    maxSpeed = new int[];


}

public String getColor(){
    return color;
}
public int getYear(){
    return year;
}

    // Create a class constructor for the Main class
    public Car(String color, int year, int maxSpeed) {
      this.color = color;
      this.year = year;
      this.maxspeed = maxSpeed;
    }
}

