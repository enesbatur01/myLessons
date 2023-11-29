package day24enum_iterator_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        /*
        1) Lambda "Functional "(method) programming dir, diğeri "Structured Programming"
        2) Functional programming te ne yapılacak üzerine yoğunlaşılır
             "Structured Programming" te nasıl yapılacak üzerine yoğunlaşılır
        3) Functional programming Collection lar ve Arrayler ile kullanılır
        4) Lambda (Functional programming) java 8 ile birlikte kullanılmaya başlamıştır

         */

        List<Integer>nums= new ArrayList<>(Arrays.asList(12,9,131,14,9,10,4,12,15));
        printElements1(nums);
        printElements2(nums);


    }
    public static void printElements1(List<Integer>nums){
        for (Integer w :nums){
            System.out.print(w+" ");
        }

    }
    public static void printElements2(List<Integer>nums){
        nums.stream().forEach(t-> System.out.print(t+" "));
        }


}
