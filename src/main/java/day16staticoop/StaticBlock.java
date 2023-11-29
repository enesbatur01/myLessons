package day16staticoop;

import java.time.LocalDate;

public class StaticBlock {

    //Bir variable oluşturduğunuzda değer atamazsanız o variable ı initialize etmediniz demektir
    //Gereksinimlere göre bazen main method çalıştırılmadan önce variable ların hazır hale gelmesi gerekir
    //bu yüzden static block lar kullanılır
    //static variable lar static blocklar içinde initialize edilirse o classın içinde herşeyden önce
    //hazır hale getirilmiş olur

    static double pi;
    public static int price;
    static {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.getMonthValue()==8) {
            price=1000;
        } else price=2000;
    }



    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main");

    }
    static {
        pi = 3.14;
        System.out.println("static block");
    }
}
