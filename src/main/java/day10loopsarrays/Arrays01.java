package day10loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {


        // Array nasıl oluşturulur ?

        String stdNames [] = new String[5];


        System.out.println(Arrays.toString(stdNames));

        //toString () methodu kullanmadan sadece array ismini yazdırırsanız java size o Array in adresini verir.

        //Array e eleman ekleme nasıl yapılır ?

        stdNames [2] ="Ali";
        stdNames [1] ="Enes";
        stdNames [3] ="Azize";
        stdNames [4] ="Zafer";
        stdNames [0] ="Fatma";
        // stdNames [5] ="Bilgin";

        System.out.println(Arrays.toString(stdNames));//[Fatma, Enes, Ali, Azize, Zafer]

        //Array den specific bir eleman nasil alinir?
        System.out.println(stdNames[1]);//Enes

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        String cities [] = new String[5];

        cities [0] = "Denizli";
        cities [1] = "Elazığ";
        cities [2] = "Bursa";
        cities [3] = "Muğla";
        cities [4] = "Ankara";

        //1.yol
        int totalChar = 0;

        for (int i = 0; i<cities.length; i++) {
            totalChar = totalChar+cities[i].length();
        }
        System.out.println(totalChar);

        //2.yol : for - each loop (enhanced loop)
        int sum=0;
        for (String w:cities){
            sum = sum+w.length();
        }

        System.out.println("sum = " + sum);


    }

}
