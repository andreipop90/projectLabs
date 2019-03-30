package org.fasttrackit.lab5;

public class CarApplication {
    public static void main(String[] args){
        Car carMercedes = new Car();
        carMercedes.setName("Mercedes");
        carMercedes.setModel("G Class");

        Car carFord = new Car();
        carFord.setName("Ford");
        carFord.setModel("F150");

        Car carAudi = new Car();
        carAudi.setName("Audi");
        carAudi.setModel("A3");

        carAudi.run();
        carFord.run();
        carMercedes.run();
        System.out.println(Car.numberOfCars);

        Car carBmw = new Car("BMW", "x3");

        Autobuz myBus = new Autobuz();
        myBus.setModel("bus model");
        myBus.setName("bus name");
        myBus.composteazaBilet();

//        Camion myTruck = new Camion();
//        myTruck.setModel("MAN");
//        myTruck.setNume("Truckzilla");
//        myTruck.transportMarfa();

        //Car x = new Camion("numele Camionul", "modelul camionului");
    }
}
