package day07stringmanipulattions;

public class StringManipulation03 {

    public static void main(String[] args) {

        //Example  Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht
        //lastIndexOf("m") ==> m nin string deki son gorunumunun indexini verir.

        String s = "enes" ;

        if (s.indexOf("e")==s.lastIndexOf("e")) {
            System.out.print("e");

        }
        if (s.indexOf("n")==s.lastIndexOf("n")) {
            System.out.print("n");

        }
        if (s.indexOf("s")==s.lastIndexOf("s")) {
            System.out.print("s");

        }
        System.out.println("");


        //Example  Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789


        String cardNum ="1234 6789 1234 6789";
        String first =cardNum.substring(0,15).replaceAll("[0-9]","*");
        String lastFour = cardNum.substring(15);

        //concat stringi birleştirir first+lastfour ile aynıdır.

        String result  = first.concat(lastFour);
        System.out.println("result = " + result);

    }

}
