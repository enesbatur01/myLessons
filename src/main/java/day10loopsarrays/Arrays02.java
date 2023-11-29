package day10loopsarrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example: int array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]

        //Note : sort() methodu sayisal data tiplerinde kücükten buyuge siralar (ascending order)
        // sort() methodu String lerde alfabetik olarak siralar (alphabetical order)
        // Natural order ==> ascending order + alphabetical order
        // sort() methodu array elemanlarini "Natural Orden" a gore siralar

//        Arrays.sort(ages);
//        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]
//        System.out.println(ages[0] + ages[ages.length - 1]);


        //2. yol
        int minimum = ages[0];
        int maximum = ages[0];


        //[20, 23, 19, 44, 15, 32]
        for (int w : ages) {
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }
        System.out.println(minimum);
        System.out.println(maximum);
        System.out.println(maximum + minimum);

    }

}
