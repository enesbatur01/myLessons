package day25lambda;

import java.util.*;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));

        printEvenElements1(nums);
        System.out.println();

        printEvenElements2(nums);
        System.out.println();

        printSquareOfOddElements(nums);
        System.out.println();

        printCubeOfDistinctOddElements(nums);
        System.out.println();

        printSumOfSquaresOfDistinctEvenElements(nums);
        System.out.println();

        printMultiplyOfSquaresOfDistinctEvenElements(nums);
        System.out.println();

        getMaxValue1(nums);
        System.out.println();

        getMaxValue2(nums);
        System.out.println();

        getMaxValue3(nums);
        System.out.println();

        getMaxValue4(nums);
        System.out.println();

        getMinValue(nums);
        System.out.println();

        getMinValue2(nums);
        System.out.println();

        getMinValue3(nums);
        System.out.println();

        getMinValue4(nums);
        System.out.println();

        getMinGreaterThanSevenEven(nums);
        System.out.println();


    }

    //1) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Structured)


    public static void printEvenElements1(List<Integer> arr) {

        for (Integer w : arr) {
            if (w % 2 == 0) {

                System.out.print(w + " ");
            }
        }

    }

    public static void printEvenElements2(List<Integer> arr) {

        arr.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));

    }
    //2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina
    // bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printSquareOfOddElements(List<Integer> arr) {

        arr.
                stream().
                //Odd ları alıyoruz odd tek sayı demektir
                        filter(t -> t % 2 == 1).
                //map() stream deki elemanları değiştirir
                        map(t -> t * t).
                forEach(t -> System.out.print(t + " "));

    }


    //3) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina
    // bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> arr) {

        //distinct() methodu tekrarsız elemanalrı alırız
        arr.
                stream().
                //distinct() methodu tekrarsız elemanalrı alırız
                        distinct().
                filter(t -> t % 2 == 1).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));


    }

    //4)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin" "toplamını"
    // hesaplayan method oluşturun

    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> arr) {
        int sum = arr.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                //reduce() methodu streamdeki dataları teke düşürür
                        reduce(0, (t, u) -> t + u);

        System.out.print(sum);
    }

    //5) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin" "çarpımını"
    // hesaplayan bir method oluşturun
    public static void printMultiplyOfSquaresOfDistinctEvenElements(List<Integer> arr) {

        int multiply = arr.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                //reduce() methodu streamdeki dataları teke düşürür
                        reduce(1, (t, u) -> t * u);
        System.out.print(multiply);

    }

    //6)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    //1. yol
    public static void getMaxValue1(List<Integer> arr) {
        int max = arr.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);

        System.out.print(max);

    }

    //2.yol
    public static void getMaxValue2(List<Integer> arr) {
        int max = arr.
                stream().
                distinct().
                reduce(arr.get(0), (t, u) -> t > u ? t : u);

        System.out.print(max);

    }

    //3.yol
    public static void getMaxValue3(List<Integer> arr) {
        int max = arr.
                stream().
                distinct().
                //sorted() method u sıralar
                        sorted().
                reduce((t, u) -> u).
                get();

        System.out.print(max);

    }

    //4.yol
    public static void getMaxValue4(List<Integer> arr) {
        int max = arr.
                stream().
                distinct().
                //sorted() method u sıralar
                        sorted().
                //Math::max maximum sayıyı aldırır  :: refere etmek demektir
                        reduce(Math::max).
                get();

        System.out.print(max);

    }

    public static void getMinValue(List<Integer> arr) {
        int min = arr.
                stream().
                distinct().
                //sorted() method u sıralar
                        sorted().
                //Math::max maximum sayıyı aldırır  :: refere etmek demektir
                        reduce(Math::min).
                get();

        System.out.print(min);
    }

    public static void getMinValue2(List<Integer> arr) {
        int min = arr.
                stream().
                distinct().
                //Comparator.reverseOrder() tersine sıralar
                //Comparator karşılaştırıcı demektir
                        sorted(Comparator.reverseOrder()).
                reduce((t, u) -> u).
                get();

        System.out.print(min);
    }

    //3.yol
    public static void getMinValue3(List<Integer> arr) {
        int min = arr.
                stream().
                distinct().
                sorted().
                reduce((t, u) -> t).
                get();

        System.out.print(min);
    }

    //4.yol
    public static void getMinValue4(List<Integer> arr) {
        int min = arr.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce((t, u) -> Math.min(t, u)).
                get();

        System.out.print(min);
    }

    //8)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
    // 12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

    public static void getMinGreaterThanSevenEven(List<Integer> arr) {

        //findFirst() stream de bulunan ilk sayıyı verir
        int min = arr.
                stream().
                filter(t -> t > 7 && t % 2 == 0).
                sorted().
                //findFirst() stream de bulunan ilk sayıyı verir
                        findFirst().
                get();

        System.out.print(min);


    }


}