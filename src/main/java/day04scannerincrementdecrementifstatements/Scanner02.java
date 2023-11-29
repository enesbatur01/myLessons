package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen iki sayı giriniz  : ");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();

        System.out.println("Toplam = "+ (sayi1+sayi2));
        System.out.println("Çıkartma = "+ (sayi1-sayi2));
        System.out.println("Bölme = "+ (sayi1/sayi2));
        System.out.println("Çarpma = "+ (sayi1*sayi2));
    }
}
