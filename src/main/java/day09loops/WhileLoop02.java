package day09loops;

import java.util.Scanner;

public class WhileLoop02 {

    public static void main(String[] args) {

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number...");

        int num = input.nextInt();
        int çarp= 1;

        while (çarp<11) {

            System.out.println(num + "x" + çarp +"=" + (num*çarp));
            çarp++;
        }


        //Example 2: Belirli bir tamsayının palindrom olup olmadığını kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int k = 313;

        //int sayıyı rahatlıkla ters çevirmek için stringe çevirdik
        String m = String.valueOf(k);

        String reversed = "";

        int n = m.length()-1;

        while (n >=0) {

            reversed = reversed+m.charAt(n);

            n--;
        }

        //sayının tersi ile oluşan string ile eşit mi kontrolü

        if (m.equals(reversed)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome değil.");
        }

    }

}
