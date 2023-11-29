package day11multidimensionalarrays;

public class Md03 {

    public static void main(String[] args) {


        //Example : Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 = 47

        int minimum = ages[0][0];
        int maximum = ages[0][0];

        for (int w[] : ages) {
            for (int k : w) {
                minimum = Math.min(minimum, k);
                maximum = Math.max(maximum, k);
            }

        }
        System.out.println("minimum = " + minimum);
        System.out.println("maximum = " + maximum);
        System.out.println(minimum + maximum);


    }

}
