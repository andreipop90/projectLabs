package org.fasttrackit.temaLab5;

import java.util.ArrayList;
import java.util.List;

public class ScoalaApp {

    public static void main(String[] args) {
        Student first = new Student("Pop", "Andrei", 29, 9.54f);
        Student second = new Student("Demsa", "Ionel", 30, 8.47f);
        Student third = new Student("Doe", "John", 45, 9.7f);
        Student fourth = new Student("Bucur", "Feri", 25, 9.3f);

        List<Student> listInitiala = new ArrayList<>();
        listInitiala.add(first);
        listInitiala.add(second);
        listInitiala.add(third);
        listInitiala.add(fourth);

        Clasa x = new Clasa();
        x.laBursaSauCuPlata(listInitiala);
        x.printNoOfBursieri();
        x.printNoOfCuTaxa();
    }
}