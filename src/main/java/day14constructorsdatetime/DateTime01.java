package day14constructorsdatetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //icinde bulundugumuz zaman dilimindeki tarihi nasil alabiliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);//2023-08-28

        System.out.println(myCurrentDate.getMonthValue());//8
        System.out.println(myCurrentDate.getYear());//2023
        System.out.println(myCurrentDate.getDayOfMonth());//28
        System.out.println(myCurrentDate.getMonth());//AUGUST
        System.out.println(myCurrentDate.getDayOfWeek());//MONDAY

        //ileriki tarihe nasil gidilir?
        System.out.println(myCurrentDate.plusYears(1).plusMonths(1).plusDays(1));

        //Gecmis tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusMonths(1).minusDays(1).minusYears(1));

        //specific bir tarih objesi nasil olusturulur?
        LocalDate date1 = LocalDate.of(1980, 5, 5);
        LocalDate date2 = LocalDate.of(2000, 5, 5);

        boolean r1 = date1.isAfter(date2);
        System.out.println(r1);//false

        boolean r2 = date1.isBefore(date2);
        System.out.println(r2);

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a date");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())) {
            System.out.println("Invalid date");

        }else {
            System.out.println("Enter time for ticket");
        }


        //Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.

        System.out.println("Please enter birthday");
        int birthYear = input.nextInt();
        int birthMonth = input.nextInt();
        int birthDay = input.nextInt();

        LocalDate birthDayControl = LocalDate.of(birthYear,birthMonth,birthDay);

        System.out.println(birthDayControl.getDayOfWeek());


    }
}
