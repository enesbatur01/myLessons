package day11multidimensionalarrays;

import java.util.Arrays;

public class Md02 {

    public static void main(String[] args) {

        //Example : Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

        //1. Step : 2 boyutlu bir arrayde kaç eleman olduğunu bulan kodu yazmalıyız


        int toplamElemanSayisi=0;

        for (int w[]:numbers){
            toplamElemanSayisi = toplamElemanSayisi+ w.length;
        }

        //2. Step : Tek boyutlu arrayi iki boyutlu arrayin eleman sayısını kullanarak oluşturmalıyız.

        int num []  = new int[toplamElemanSayisi];
        int counter = 0;

        //3. Step : 2 boyutlu array deki elemanları tek boyutlu arraye transfer etmeliyiz
        for (int w[]:numbers){
            for (int k:w){
               num[counter]=  k;
               counter++;
            }

        }
        System.out.println(Arrays.toString(num));
    }

}
