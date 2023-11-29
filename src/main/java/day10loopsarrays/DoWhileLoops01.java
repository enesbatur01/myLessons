package day10loopsarrays;

import java.util.Scanner;

public class DoWhileLoops01 {

    public static void main(String[] args) {

/*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */

        Scanner input = new Scanner(System.in);


        int yanlisGiris = 0;

        do {

            System.out.println("Lütfen kullanıcı adınızı giriniz...");
            String uName = input.nextLine();
            System.out.println("Lütfen şifrenizi giriniz...");
            String uPwd = input.nextLine();

            if (uPwd.equals("pwd123") && uName.equals("admin")) {
                System.out.println("Giriş yaptınız...");
                break;
            } else if (yanlisGiris == 4) {
                System.out.println("Hesabınız bloke oldu....");
                break;

            } else {
                yanlisGiris++;
                System.out.println("yanlış şifre lütfen tekrar deneyiniz...");
            }
        } while (true || yanlisGiris == 4);


    }

}
