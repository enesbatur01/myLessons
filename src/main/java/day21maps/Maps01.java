package day21maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    public static void main(String[] args) {

        /*
        1) Map lerde sözlüklerdeki gibi kelime ve manası şeklinde bir kullanım vardır
        2) Key kısmı tekrarsız, value kısmı tekrarlı olabilir
        3) Map ler deki her bir elemana entry denir, tamamına ise EntrSet denir
        4) Entry ler tekrarsız olduğu için entry set denilir
        5) Key ve valuelar ayrı ayrı data type larında olabilirler
        6) Map ler collection değildir, farklı bir yapıdır
        7) HashMap ler entry leri rastgele sıralar, bu yüzden en hızlı map dir
         */

        //Map nasıl oluşturulur?
        HashMap<String,Integer>countryPopulation=new HashMap<>();

        //Map e entry nasıl eklenir?
        countryPopulation.put("Turkiye",15466421);
        countryPopulation.put("Italy",400000);
        countryPopulation.put("Germany",654465);
        countryPopulation.put("America",400000000);
        countryPopulation.put("Netherland",15466421);
        System.out.println(countryPopulation);

        //get() methodu key ile çalışır ve value kısmını verir
        Integer trPopulation=countryPopulation.get("Turkiye");
        System.out.println(trPopulation);

        //Bütün key leri nasıl alabilirim?
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);

        //Bütün value ları nasıl alabilirim?
        Collection<Integer>values=countryPopulation.values();
        System.out.println(values);

        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamsi nedir?
        int sum = 0;

        for (int w:values){
            sum +=w;
        }
        System.out.println(sum/values.size());

        //entrySet() methodu mapteki entry leri kalip halinde alip Set in icine koyarak verir
        //loop lar map ler ile kullanilamaz, bunun icin entryset methodunu kullanarak mapin key value olan entry lerini bir setin icine koyariz
        Set<Map.Entry<String,Integer>> entries = countryPopulation.entrySet();
        System.out.println(entries);//[Turkiye=83000000, Netherland=18000000, USA=400000000, Italy=40000000, Germany=83000000]

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.

        int sumResult = 0;

        for (Map.Entry<String,Integer> w: entries){
            sumResult+=w.getKey().length()+w.getValue();

        }
        System.out.println(sumResult);
    }
}
