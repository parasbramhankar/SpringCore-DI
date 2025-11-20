package org.example;

public class DieselEngine implements Engine {

    public DieselEngine() {
        System.out.println("Diesel Engine...");
    }

    public int start(){
        System.out.println("Trying to start the Diesel engine");
        return 1;
    }

}
