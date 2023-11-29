package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class IfStatements01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("sayı giriniz : ");

        int num1 = input.nextInt();

        if (num1 > 5) {

            System.out.println("sayı 5 ten büyüktür ");

        } else if (num1 == 5) {

            System.out.println("sayı 5 e eşittir ");


        }
        else {
            System.out.println("sayı 5 ten küçüktür");
        }



        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir!" yazdirin.

        int sayi=10;

        if (sayi >99 && sayi<1000){

            System.out.println("sayi 3 basamaklıdır");
        }





    }

}
