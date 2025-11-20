package org.example;

public class Car {

    Engine engine;

    public Car() {
        System.out.println("Car constructor...");
    }

    public void setEngine(Engine engine) {
        System.out.println("Calling setter method");
        this.engine = engine;
    }

    void drive(){
        int start = engine.start();

        if(start>0){
            System.out.println("Car started....");
        }else{
            System.out.println("Car not started...");
        }
    }
}