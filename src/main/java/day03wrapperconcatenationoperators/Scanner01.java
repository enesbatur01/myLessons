package day03wrapperconcatenationoperators;


import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        //1. adim : Scanner Class'tan object olustur

        Scanner input = new Scanner(System.in);
        //not scanner classtaki methodları inputta kullanmayı sağlıyoruz.

        //2. adim : Kullaniciya ne istediginize dair mesaj veriniz

        System.out.println("yaşınızı giriniz");

        //3. admi : Uygun method'u kullanarak kullanicinin verdigi data yi memory e yerlestiriniz

       byte age = input.nextByte();


        System.out.println(age);


    }
}
