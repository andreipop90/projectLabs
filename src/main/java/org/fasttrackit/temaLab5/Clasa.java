package org.fasttrackit.temaLab5;

import java.util.ArrayList;
import java.util.List;

public class Clasa {
    public List<Student> getBursieri() {
        return bursieri;
    }

    public List<Student> getCuPlata() {
        return cuPlata;
    }

    private List<Student> bursieri = new ArrayList<>();
    private List<Student> cuPlata = new ArrayList<>();

    public void laBursaSauCuPlata(List<Student> listaStudenti) {
        for(Student s : listaStudenti){
            if(s.getMedie()>=9.5){
                bursieri.add(s);
            }
            else {
                cuPlata.add(s);
            }
        }
        listaStudenti.clear();
    }

    public void printNoOfBursieri(){
        for(Student s : bursieri){
            System.out.println(s.getNume() +" " + s.getPrenume() +"  varsta: "+ s.getAge() + "  medie: "+s.getMedie());
        }
    }

    public void printNoOfCuTaxa(){
        for(Student s : cuPlata){
            System.out.println(s.getNume() +" " + s.getPrenume() +"  varsta: "+ s.getAge() + "  medie: "+s.getMedie());
        }
    }
}
