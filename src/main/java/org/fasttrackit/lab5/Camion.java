package org.fasttrackit.lab5;

public class Camion extends Car {
    private String bena;
    private int tonaj;
    public void transportMarfa(){
        System.out.println("Sunt camion: Transport marfa ");
    }

    public Camion(String name, String model) {
        super(name, model);
    }
}
