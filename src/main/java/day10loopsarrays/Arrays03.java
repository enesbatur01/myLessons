package day10loopsarrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3

        int nums [] = {12, 3, -3, 5, 23};

        for (int w : nums) {

            if (w <5){
                System.out.print(w+" ");
            }

        }
        System.out.println();

        //Example : Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz

        String names [] = {"A","T","C","H"};

        //binarySearch() methodunu sort() methodunu kullanmadan kullanmayınız.
        //çünkü binarySearch() mantığı sıralı elemanlar için geçerlidir.
        //binarySearch() methodu var olan elemanlar için size o elemanın indexini verir.
        //binarySearch() methodu olmayan elemanlar için negatif - bir tam sayı verir.
        //"-" işaretinin anlamı o eleman yok demektir.
        //sayı ise o eleman arrayde olsaydı kaçıncı sırada olurdu bunu verir.

        Arrays.sort(names);
        System.out.println(Arrays.binarySearch(names,"C"));

        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s = "Java is easy. Learn Java earn money.";

        // boşluklardan böler ve her bir kelimeyi arraye atar.
        String words[] = s.split(" ");

        // kelimelerin arrayde nasıl gözüktüğünü yazar.
        System.out.println(Arrays.toString(words));

        //kaç array olduğunu yazar.
        System.out.println(words.length);


    }

}
