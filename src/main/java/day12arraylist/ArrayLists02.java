package day12arraylist;

import java.util.ArrayList;

public class ArrayLists02 {

    public static void main(String[] args) {

        //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]

        ArrayList<Character> list = new ArrayList<>();
        list.add('J');
        list.add('a');
        list.add('v');
        list.add('a');
        list.add('v');
        System.out.println(list);
        ArrayList<Character> newList = new ArrayList<>();

        for (char w:list) {
            if (!newList.contains(w)){
                newList.add(w);
            }

        }
        System.out.println(newList);

        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.
        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r);

        for (int i =0; i< r.size() ; i++) {
            if (r.get(i).contains("a")){
                r.remove(i);
                i--;
            }
        }
        System.out.println(r);



    }

}
