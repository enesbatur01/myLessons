package day24enum_iterator_lambda;


import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Iterators {
    public static void main(String[] args) {

        /*
        1) Iterator lar loop ların yaptığı aynı işi yapar
        2) Iterator larda sonsuz loop oluşma ihtimali yoktur
        3) Iterator lar ile looplar arasında performans farkı yoktur
        4) Iterator lar bir collection dan eleman silme ve bir collection daki elemanı değiştirme konusunda daha başarılıdır
        5) iki tip iterator vardır

            a) Iterator :
                Bu sadece eleman silmede kullanılır, eleman eklemek veya elemanı değiştirmek mümkün değildir

            b) ListIterator :
                Bu eleman silebilir, ekleyebilir ve değiştirebilir
            Note ==>
                Iterator sadece soldan sağa ( ilk elemandan son elemana ) çalışır
                ListIterator iki yönlü çalışabilir
         */

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Enes");
        myList.add("Burak");
        myList.add("Büşra");
        System.out.println(myList);

        //specific bir elemanı iterator ile nasıl silebiliriz
        Iterator<String> myItr = myList.iterator();

        //hasNext() pointer a senden sonra eleman var mı diye sorar, eleman varsa true yoksa false return eder
        while (myItr.hasNext()) {

            //next() pointer ı bir sonraki elemanın önüne taşır ve üstünden atladığı elemanı return eder
            String eleman = myItr.next();
            if (eleman.equals("Tom")) {
                //remove() method u next() methodunun return ettiği elemanı siler
                myItr.remove();

            }


        }
        System.out.println(myList);

        List<String> yourList = new ArrayList<>();
        yourList.add("Ali");
        yourList.add("Can");
        yourList.add("Aliye");

        ListIterator<String> yourListIterator = yourList.listIterator();

        while (yourListIterator.hasNext()) {
            String el=yourListIterator.next();
            yourListIterator.set(el+"*");
        }
        System.out.println(yourList);

        //ListIterator ler

        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);//[Ali, Can, Aliye]

        ListIterator<String> listItr2= list3.listIterator();

        //bu loop pointer ı en sağa almak için yazıldı
        while (listItr2.hasNext()){
            listItr2.next();
        }

        //elemanları sondan başa doğru yazdırın
        while (listItr2.hasPrevious()){
           String el= listItr2.previous();
            System.out.println(el);

        }

    }
}
