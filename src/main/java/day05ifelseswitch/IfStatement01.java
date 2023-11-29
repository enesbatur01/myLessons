package day05ifelseswitch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Example 1: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input = new  Scanner(System.in);

        System.out.println("sayı giriniz : ");

        double sayi = input.nextDouble();

        if (sayi>0) {
            System.out.println("sayı pozitiftir");
        } else if (sayi==0) {

            System.out.println("sayı  nötr");

        }

        else {
            System.out.println("sayı negatiftir");
        }

    }
}
