package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2*Kisa Kenar + 2*Uzun Kenar

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz : ");

        float kenar1= input.nextFloat();

        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz : ");

        float kenar2= input.nextFloat();

        System.out.println("Alan = " +(kenar1*kenar2));

        System.out.println("Çevresi = " + (2*kenar1+2*kenar2));

    }
}
