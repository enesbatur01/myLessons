package day15stringbuilderaccesmodifier;

public class Sb01 {
    public static void main(String[] args) {
           /*
        1) "StringBuilder" classi da String ureten bir classtir.
        2) String class kullanarak String üretiriz, java nicin StringBuilder classi da olusturdu?
            String class "immutable" (degistirilemez) string uretir, StringBuilder Class "mutable"(degistirilebilir) string üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
         */

        //Immutable

        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        /*
        String i değiştirdikten sonra aynı string e assign ederseniz, java yeni bir container oluşturur
        değişmiş değeri bu container ın içine koyar ve eski container ı gösteren pointer artık yeni container a yölendirilir
        Dolayısıla eski container adressiz kalır ve "Garbage collector" ile adressiz olan conteinerları siler
         */
        String a ="Money";
        a =a +" more ";

        //Mutable
        //StringBuilder kullanarak string üretmenin 1. yolu

        StringBuilder sb1 = new StringBuilder("Python");
        sb1.append("!");
        System.out.println(sb1);

        //StringBuilder kullanarak string üretmenin 2. yolu

        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        sb2.append("12345678912345688");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        //capacitiy ve lenght arasındaki fark nedir?
        /*
        capacity javanın size verdiği data depolama yer sayısıdır
        Lenght ise size verilen data depolama yerinin kullanılan kısmıdır

        Java başlangıç olarak size capacity i 16 olarak verir, siz verilen capacity i aşarsanız
        java yeni capacity i varolanın 2 katının 2 fazlası olacak şekilde değiştirir
        16 ==> 16*2+2 -- 34 ==> 34*2+2
         */

        //StringBuilder kullanarak string üretmenin 3. yolu
        //Default capacity i nasıl değiştirebiliriz ?
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append("Ali");
        System.out.println(sb3.capacity());


    }
}
