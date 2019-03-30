package org.fasttrackit.catel;

import java.util.Scanner;

public class CarsGame {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String car1 = "Ford";
        String car2 = "sMW";
        String car3 = "Mercedes";
        String[] myCars = new String[3];
        myCars[0] = car1;
        myCars[1] = car2;
        myCars[2] = car3;

        for(int i=0; i<myCars.length;i++){
            System.out.println("Masina " + myCars[i]);
        }

        for(String masina:myCars) {
            System.out.println(masina);
        }

        int i = 0;

        while(i<myCars.length && !myCars[i].startsWith("B") ){
            System.out.println(myCars[i]);
            i++;
        }

        int indexDo = 0;

        do{
            System.out.println("masina cu do: " + myCars[indexDo]);
            indexDo++;
        }
        while (indexDo<myCars.length);
    }
}
