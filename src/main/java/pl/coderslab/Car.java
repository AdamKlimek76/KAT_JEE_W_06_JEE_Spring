package pl.coderslab;

import pl.coderslab.Driver;

public class Car {

    private String name;
    private int speed;
    private Driver driver;

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car(String name, int speed, Driver driver) {
        this.name = name;
        this.speed = speed;
        this.driver = driver;
    }

    public Car(){
        this.name="unknown";
    }

    public Car(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("jada " + this.name);
    }
}
