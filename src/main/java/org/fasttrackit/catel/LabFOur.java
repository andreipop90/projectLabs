package org.fasttrackit.catel;

import java.util.Scanner;

public class LabFOur {
    public static int mediaIarasi(){
        int count = 0;
        int sum = 0;
        for (int i = 0; i< 3; i++){
            Scanner scan = new Scanner(System.in);
            sum = sum + scan.nextInt();
        }
        return sum / 3;
    }

    public static void main (String[] args){
        System.out.println(mediaIarasi());
    }
}
