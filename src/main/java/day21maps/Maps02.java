package day21maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 77);
        stdAges.put("Veli", 38);
        stdAges.put("Tom", 76);
        stdAges.put("Brad", 58);
        stdAges.put("Can", 58);

        //key hatalı kullandığımızda hata vermez, en son verilen entry nin değerini kabul eder
        stdAges.put("Can", 18);
        System.out.println(stdAges);

        //replace() method u value ları keyleri kullanarak update etmeye yarar
        stdAges.replace("Can",10);
        System.out.println(stdAges);

        //replace("Can",10,13); methodu map içinde key olarak Can var ise ve value 10 ise 13 e dönüştürür yoksa dönüştürmez
        stdAges.replace("Can",10,13);
        System.out.println(stdAges);

        //putIfAbsent("Enes",23) method u map te Enes keyword ü yoksa ekler var ise eklemez
        stdAges.putIfAbsent("Enes",23);
        System.out.println(stdAges);

        //get("Enes") method u aranan key var ise value verir, yok ise null verir
        System.out.println(stdAges.get("Enes"));//23
        System.out.println(stdAges.get("Eness"));//null

        //getOrDefault("Enes",0)); method u aranan key eğer map te var ise value verir yok ise istenen default değeri verir
        System.out.println(stdAges.getOrDefault("Enes",0));
        System.out.println(stdAges.getOrDefault("Eness",0));

        //containsKey("Enes")); methodu map te o key varmı bakar, boolean değer döndürür
        System.out.println(stdAges.containsKey("Enes"));
        System.out.println(stdAges.containsKey("Eness"));

        //containsValue(23)); method u map te value içinde aranan value var mı bakar, boolean değer döndürür
        System.out.println(stdAges.containsValue(23));
        System.out.println(stdAges.containsValue(31));

        //remove() method u key kullanarak entry silmeye yarar
        stdAges.remove("Enes");
        System.out.println(stdAges);

        //remove("Tom",31); method u hem key hemde value kontrol eder eşleşirse siler, eşleşmez ise silmez
        stdAges.remove("Tom",31);
        System.out.println(stdAges);
    }
}
