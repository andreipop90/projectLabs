package org.fasttrackit.lab5;

public class Car {
    public static int numberOfCars =0;
    private String name;
    private String model;
    private String power;
    private Roata roataSpateStanga;
    private Roata roataSpateDreapta;
    private Roata roataFataStanga;
    private Roata roataFataDreapta;
    private int nrOfWheels;
    private int nrOfChairs;

    public void transportPeople() {
        System.out.println("x");
    }

    public void run() {
        System.out.println("the car " + name + " is running");
    }

    public Car() {
        System.out.println(numberOfCars++);
        System.out.println("Constructor called");
    }

    public Car(String name, String model) {
        this();
        this.name = name;
        this.model = model;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
