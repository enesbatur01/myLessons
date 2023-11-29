package day07stringmanipulattions;

import java.util.Scanner;

public class StringManipulation01 {


    public static void main(String[] args) {
       /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz...");
        String password = input.nextLine();

        //i)En az 8 character olsun

        boolean lenghtControl = password.length()>7;
        System.out.println("lenghtControl = " + lenghtControl);

        //ii)Space characteri password'de olmasin

        boolean spaceControl= !password.contains(" ");
        System.out.println("spaceControl = " + spaceControl);

        //iii)En az bir tane buyuk harf olsun

        boolean upperCaseControl = password.replaceAll("[^A-Z]","" ).length()>0;
        System.out.println("upperCaseControl = " + upperCaseControl);

        //iv)En az bir tane kucuk harf olsun

        boolean lowerCaseControl = password.replaceAll("[^a-z]","" ).length()>0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        //v)En az bir tane rakam olsun

        boolean numberControl = password.replaceAll("[^0-9]","" ).length()>0;
        System.out.println("numberControl = " + numberControl);

        String result = lenghtControl == true && spaceControl == true && upperCaseControl == true && lowerCaseControl == true && numberControl==true ? "Şifre oluşturuldu" : "Şifrenizi kontrol ediniz.";
        System.out.println(result);
    }


}
