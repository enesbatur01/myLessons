package day08loops;

import java.util.Scanner;

public class ForLoops03 {

    public static void main(String[] args) {

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number...");

        int num1 = input.nextInt();
        int newNum = 0;

        for (int i = num1; i >0 ; i=i/10) {

            newNum = newNum +i%10;

        }
        System.out.println(newNum);


        //Bir string teki tekrarsiz karakterleri veren kodu yaziniz
        //          mehmet ==> ht

        String name = "mehmet";
        String unique = "";


        for (int i =0; i <name.length(); i++) {

            char ch = name.charAt(i);
            if (name.indexOf(ch)==name.lastIndexOf(ch)){
                unique = unique+ch;
            }

        }
        System.out.println(unique);


        //Example 1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26
        int sum =0;

        for (int i =5; i <9; i++) {

            sum = sum+i;

        }

        System.out.println(sum);


        //Example : 7'den 9'a kadar tamsayilarin carpimini veren kodu yaziniz.
        //           7*8*9 ==> 504

        int sum1 =1;

        for (int i =7; i <10; i++) {

            sum1 = sum1*i;

        }

        System.out.println(sum1);


    }

}
