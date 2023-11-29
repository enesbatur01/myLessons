package day05ifelseswitch;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Example 2: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı girin : ");
        byte num = input.nextByte();

        if (num ==1)
        {
            System.out.println("Sunday");
        } else if (num ==2) {
            System.out.println("Monday");
        }
        else if (num ==3) {
            System.out.println("Tuesday");
        }
        else if (num ==4) {
            System.out.println("Wednesday");
        }
        else if (num ==5) {
            System.out.println("Thursday");
        }
        else if (num ==6) {
            System.out.println("Friday");
        }
        else if (num ==7) {
            System.out.println("Monday");
        }
        else {
            System.out.println("lütfen geçerli bir sayı giriniz.");
        }


    }
}
