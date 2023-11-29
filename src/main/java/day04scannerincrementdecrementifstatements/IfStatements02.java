package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz");

        int sayi = input.nextInt();


        if (sayi%2 == 0) {

            System.out.println("sayı çifttir");

        }

        if (sayi%2 !=0) {

            System.out.println("sayı tektir");


        }

    }

}
