package day20collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;


public class LinkedList01 {
    public static void main(String[] args) {
            /*
        1)Arraylistler eleman silme ve eleman eklemede basarisizdirlar
          O yüzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
        2)Linkedlistler index kullanmadiklarindan eleman ekleme ve silmede re-index yapilmasina gerek yoktur
        Buda linkdelistleri eleman ekleme ve silmede cok basarili hale getirir
        3) Arraylistlerde search islemi kolay yapilir, cunku indexler adres gibidir
        4) Linkedlistlerde search islemi zor yapilir cunku linkedlistler index kullanmazlar
        index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir buda cok fazla is demektir
         */

        LinkedList<String> list = new LinkedList<>();
        list.add("Mehmet");
        list.add("Ahmet");
        list.add("Onur");
        list.add("Kübra");
        list.add("Mehmet");
        list.add("Tuba");
        list.add("Duygu");
        System.out.println(list);//[Mehmet, Ahmet, Onur, Kübra, Tuba, Duygu]

        list.add(1,"Zafer");
        System.out.println(list);//[Mehmet, Zafer, Ahmet, Onur, Kübra, Tuba, Duygu]

        list.addFirst("Onur");
        System.out.println(list);

        list.addLast("ibrahim");
        System.out.println(list);//[Onur, Mehmet, Zafer, Ahmet, Onur, Kübra, Tuba, Duygu, ibrahim]

        // list.remove("Mehmet");

        //  list.removeFirstOccurrence("Mehmet");
        //   list.removeLastOccurrence("Mehmet");

    /*
    Retrieves, but does not remove, the head (first element) of this list.
    Returns:the head of this list, or null if this list is empty
     */

        System.out.println(list.peek());//ilk node u silmeden size verir (copy+paste)
        System.out.println(list);

    /*
    Retrieves and removes the head (first element) of this list.
    Returns:   the head of this list, or null if this list is empty
     */

        System.out.println(list.poll());//ilk node u size verir ama listten siler (cut+paste)
        System.out.println(list);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list
        Throws:NoSuchElementException – if this list is empty
         */
        /*
        Note: peek() ile element() ikiside ilk elemani silmeden size verir.
        peek() list bos oldugunda size null verir element() ise hata verir.
         */

        System.out.println(list.element());
        System.out.println(list);

        /**
         * Pops an element from the stack represented by this list.  In other
         * words, removes and returns the first element of this list.
         *
         * <p>This method is equivalent to {@link #removeFirst()}.
         *
         * @return the element at the front of this list (which is the top
         *         of the stack represented by this list)
         * @throws NoSuchElementException if this list is empty

         */

         /*
        Note: poll() ile pop() ikiside ilk elemani siler ve size verir
        ama poll() list bos oldugunda size null verir, pop() ise hata verir
         */

        System.out.println(list.pop());
        System.out.println(list);
    }
}
