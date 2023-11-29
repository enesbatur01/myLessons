package day21maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Maps03 {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        String s = "I like you, like like!";

        //String imizi tüm noktalama işaretlerinden temizlememiz lazım
        s = s.replaceAll("[\\p{Punct}]", "");
        System.out.println(s);

        //Tek parça olan stringimizi kelimelere ayırmak için split(" ") kullanmalıyız
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> sMap = new HashMap<>();

        //words arrayindeki kelimeler birer birer mapde var mı yok mu kontrol edilecek
        //words arrayindeki kelimeler map te koysa map e value su 1 olarak yerleştirilecek
        //words arrayindeki kelimeler map te varsa map e varolan value 1 arttırılarak yerleştirilecek

        for (String w :words){

           Integer numOfsMap= sMap.get(w);

           if (numOfsMap==null){
               sMap.put(w,1);
           }else {
               sMap.replace(w,numOfsMap+1);
           }

        }
        System.out.println(sMap);

        //homework
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
//"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        /*
        HashMap ile HasTable arasındaki fark nedir?
        1) HashMap threadSafe ve synchronized değildir, HashTable threadSafe ve synchronized dır
        2) HashMap hızlıdır, HashTable HashMap e göre yavaştır
        3) HashMap lere bir tane null key ve istediğiniz kadar null value koyabilirsiniz
            fakat HashTable lara null key ve value koyulamaz

        Note = HashMap ve HashTable ikiside entry leri rastgele sıralar

        Ne zaman hasTablekullanmalıyız?
        1) threadSafe ve synchronized kullanmamız gerekirse
        2) key ve value larda null kullanmak yasak ise HashTable kullanmalıyız

         */

        // HashTable nasıl oluşturulur?

        Hashtable<String,Integer> ogrenciNotları = new Hashtable();

        ogrenciNotları.put("Ali", 77);
        ogrenciNotları.put("Veli", 38);
        ogrenciNotları.put("Tom", 76);
        ogrenciNotları.put("Brad", 58);
        ogrenciNotları.put("Can", 58);
        //HashTable larda key ler null olamaz
        //HashTable larda value lar null olamaz






        /*
        1) TreeMap entryleri keylerine göre natural order a göre sıraya koyar, bu yüzdeb çoooook yavaştır
        2) TreeMap threadSafe ve synchronized değildir
        3) TreeMap lerin keylerinde null kullanılamaz, ama value larında istediğimiz kadar null koyabiliriz
         */


        TreeMap<String,Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        //  countryPopulation.put(null, 18000000);
        countryPopulation.put("Italy", null);
        countryPopulation.put("France", null);

        System.out.println(countryPopulation);


    }


}
