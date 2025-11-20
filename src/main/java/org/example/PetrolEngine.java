package org.example;

public class PetrolEngine implements Engine{
    public PetrolEngine(){
        System.out.println("Petrol constructor");
    }
    public int start(){

        System.out.println("Trying to start the petrol engine...");
        return 1;
    }
}
