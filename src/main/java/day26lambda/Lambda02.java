package day26lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

       // removeIfLenghtGreaterThanFive(myList);
       // removeIfElementsStartWithZorEndWithF(myList);
        removeIfElementsContainsX(myList);

    }

    //1) Character sayisi 5'ten fazla olan elemanları silen bir method oluştur
    public static void removeIfLenghtGreaterThanFive (List<String> myList){
        myList
                .removeIf(t-> t.length()>5);
        System.out.println(myList);

    }
    //2 ) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.
    public static void removeIfElementsStartWithZorEndWithF(List<String>myList){

        myList.removeIf(t-> t.startsWith("Z")||t.endsWith("f"));
        System.out.println(myList);
    }
    //3 ) "X" karakteri iceren elemanları silen bir method oluşturun.
    public static void removeIfElementsContainsX(List<String>myList){

        myList.removeIf(t-> t.contains("X"));
        System.out.println(myList);
    }


}
