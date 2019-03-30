package org.fasttrackit.catel;

import java.util.Scanner;

public class MediaAritmetica {
    public static int mediaAritmetica(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primul numar este: ");
        int a = scanner.nextInt();
        System.out.println("Al doilea numar este: ");
        int b = scanner.nextInt();
        return (a + b)/2;
    }

    public static int mediatAritmeticaNNumere(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        boolean doneTheCount = false;
        while (!doneTheCount){
            int number = scanner.nextInt();
            System.out.println("Introdu primul numar. Daca doresti sa se calculeze media, introdu 0: ");
            if(number!=0) {
                sum = sum + scanner.nextInt();
                count++;
            }
            else {
                doneTheCount=true;
            }
        }
        if(count==0){
            return 0;
        }
        return sum / count;
    }

    public static void main(String[] args){
        //System.out.println(mediaAritmetica());
        System.out.println(mediatAritmeticaNNumere());
    }
}
