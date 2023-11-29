package day24enum_iterator_lambda;

import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        //Enum daki bir sabite nasıl ulaşabiliriz?
        Cities elazığ = Cities.ELAZIĞ;
        System.out.println(elazığ);

        //Denizli sabitinin ismine ulaşalım
        String denizli = Cities.DENİZLİ.getCityName();
        System.out.println(denizli);

        //Ankara nın posta koduna ulaşalım
        String ankaraPostal = Cities.ANKARA.getPostalCode();
        System.out.println(ankaraPostal);

        //Istanbul plaka koduna ulaşalım
        int istanbulPlate = Cities.İSTANBUL.getPlateCode();
        System.out.println(istanbulPlate);

        //Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen plaka kodu giriniz...");
        int plate= input.nextInt();

        Cities cities [] = Cities.values();

       for (Cities w:cities){
           if (w.getPlateCode()==plate){
               System.out.println(w);
               break;
           }
       }


    }
}
