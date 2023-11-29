package day05ifelseswitch;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {

         /*
        Kullanicinin vermis oldugu gün isimlerine bakarak HaftaSonu veya Hafta ici olduguna karar veren kodu yaziniz
                   Monday ==> Week Day       Saturday ==> Weekend Day
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day name : ");
        String day = input.next();

        boolean isWeekendDay = day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday");
        boolean isWeekDay = day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday")
                || day.equalsIgnoreCase("Thursday") || day.equalsIgnoreCase("Friday");

        if (isWeekendDay){
            System.out.println("Weekend day");
        } else if (isWeekDay ) {
            System.out.println("Week day");
        } else {
            System.out.println("Invalid day name...");
        }

    }
}
