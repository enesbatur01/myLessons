package day07stringmanipulattions;

import java.util.Scanner;

public class StringManipulation04 {

    public static void main(String[] args) {

           /*  Örnek : Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
           i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
           ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
           iii) Başında ve sonunda boşluk olmamalıdır.
       */

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir parola girin..");
        String password = input.nextLine();

        //i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
        //isEmpty() bir String eğer boş ise true verir, dolu ise false verir.

        boolean pwdEmpty = password.isEmpty();
        System.out.println("pwdEmpty = " + pwdEmpty);

        //ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
        //isBlank() methodu space ve hiçlik içeren değerlere true verir. eğer içinde space dışında bir değer varsa örnek abc false verir.

        boolean isBlank = password.isBlank();
        System.out.println("isBlank = " + isBlank);

        // iii) Başında ve sonunda boşluk olmamalıdır.

        boolean isTrim = password.trim().equals(password);
        System.out.println("isTrim = " + isTrim);


        if (pwdEmpty) {
            System.out.println("Parola boş olamaz! ");
        }
        if (isBlank) {
            System.out.println("Parolada boşluk haricinde görünür karakterlerde bulunmalıdır. ");
        }
        if (!isTrim){
            System.out.println("Parola başında yada sonunda boşluk olmamalıdır. ");
        }

        /*

        String lerin eşitliklerini kontrol ederken "==" yerine equals kullanırız.
        Çünkü == sembolü 2 string i karşılaştırırken hem adreslerine hem de değerlerine bakar.
        Eğer ikisi de aynı ise Stringler eşittir der.

        equals() methodu ise iki string i karşılaştırırken sadece değerlerine bakar, değerleri aynı ise bu iki string eşittir der.
        Değerler farklı ise bu iki string farklı der.

         */


    }

}
