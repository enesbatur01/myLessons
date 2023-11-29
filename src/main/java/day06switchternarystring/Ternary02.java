package day06switchternarystring;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {

        //Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");

        int num = input.nextInt();

        int num2 = num;

        num = Math.abs(num);

        String result = num > 99 && num < 1000 ? "Sayı 3 basamaklıdır .." : "Sayı 3 basamaklı değildir ..";

        System.out.println(result);

        //interview question
        /*    Example : Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                       1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
                       2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */



        String leapResult = num2 %100 ==0 ? num2 %400 == 0 ?  "leap year " : "Not leap year" : num2 %4 == 0 ? "Leap Year" : "Not leap ";

        System.out.println(leapResult);


    }

}
