package org.fasttrackit.catel;

public class TamagotciGame {

    public static void main(String[] args) {
        Catel catel = new Catel("Stalin", 2, 5);
        catel.setName("Iisus");
        System.out.println(catel.getName());
        Catel dog2 = new Catel();
        dog2.setName("Rex");
        System.out.println(dog2.getName());

        for(int zi = 0; zi<15;zi++){
        dog2.mananca();
        }

        System.out.println("Catelul " + dog2.getName() + " are varsta: " +dog2.getVarsta());
    }
}
