package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bes basamakli bir sayi giriniz..");
        int num = input.nextInt();

        //bir tamsayiyi 1000 e bolersek son uc basamagi silmis oluruz
        int firstTwo = num / 1000;

        //  %  ==> modulus operator solunda bulunan sayinin saginda bulunan
        // sayiya bolumunden kalani verir
        // dolayisiyle %10 her zaman bize birler basamaginda bulunan sayiyi verir

        int lastTwo =num%100;
        System.out.println(firstTwo + lastTwo);


    }

}
