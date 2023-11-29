package tekrarlarım;

public class StringManipulations01 {
    public static void main(String[] args) {

        String kelime = "Enes";
        String kelime2 = "Burak";

        //harfleri büyütme

        kelime.toUpperCase();                       // string teki bütün herşeyi büyük harf yapar.

        //harfleri küçültme

        kelime.toLowerCase(); //stringteki herşeyi küçük harf yapar.

        //string birleştirme

        kelime.concat(kelime2);// 2 stringi birleştirir. bir string değeri içine atarız.

        //başta ve sonda boşlukları silmek

        kelime.trim();//başında ve sonunda boşluk varsa siler.

        //eşitmi kontrolü

        kelime.equals(kelime2);//iki string eşitmi diye bakar eşitse true değilse false verir. boolean kabına koyarız

        //değer bulma

        kelime.indexOf("e"); // e harfini soldan sağa arar ve ilk bulduğu e harfinin index numarasını alır. int kabına koyarız.

        //sondan değer bulma

        kelime.lastIndexOf("e");// e harfini sağdan sola arar ve ilk bulduğu e harfinin index numarasını alır. int kabına koyarız.

        // uzunluk alma

        int wordNum = kelime.length(); // String uzunluğunu belirler Enes için 4 alır ve bir int değeridir. bir int kabına atmamız gerekir.

        //harf alma

        kelime.charAt(0); //kelimenin o indexteki değerini alır indexler 0 dan başlar örnek 0. indexte "E" 1. indexte "n" harfi vardır. bir String kabına atmamız gerekir.

        //sondaki değeri alırız

        kelime.charAt(wordNum - 1); // kelimenin indexini alırız wordnum-1 bize uzunluğunu verir enes için 4 fakat index numarası 3 e kadardır bu yüzden -1 yapıp bunu indexe çeviririz. sondaki değeri almamızı sağlar

        //belirlenen değerler arasındaki veriyi alma

        kelime.substring(0, 4); //Enes // substring ile belirlenen indexler arasında ki harfleri veya veriyi alırız. Fakat alınacak son index dahil değildir. substring(0, 3) yaparsak ene alınır 0,4 ile 3. indexe kadar alırız.

        //içerisinde var mı yokmu kontrol etme

        boolean kontrol = kelime.contains("Enes"); // kelime stringi içerisinde "Enes" kelimesi varmı kontrol eder.Boolen değerdir boolean içerisine true false atar.

        //bununla başlıyor mu kontrolü

        kelime.startsWith("En"); // ne ile başladığını kontrol, true false dur bir boolean içine atarız.

        //bununla bitiyor mu diye kontrol

        kelime.endsWith("es"); // bununla bitiyor mu diye kontrol ederiz. true false döndürür ve boolean içine atarız.

        //kelimelerin yerine başka kelime yazma

        kelime.replace("Enes", "Burak"); //ilk belirlenen değeri ikinci belirlenen değerle değiştirir.

        //içerisinden silme

        kelime.replace("Enes", ""); //ikinci değere bir veri girmezseniz  belirlenen değeri siler.

        // bütün stringi regex ile düzenleyebilirsiniz.

        kelime.replaceAll("[0-9]", ""); // bütün sayıları sildirir veya değiştirebilirsiniz. ^ işareti atarak sayılar dışında herşeyi sildirip değiştirebilirsiniz.

        kelime.replaceAll("[a-z]", ""); //bütün küçük harfleri sildirip değiştirebilirsiniz. ^ işareti atarak küçük harfler dışındaki bütün verileri sildirip düzenleyebilirsiniz.

        kelime.replaceAll("[A-Z]", ""); //bütün büyük harfleri sildirip değiştirebilirsiniz. ^ işareti atarak büyük harfler dışındaki bütün verileri sildirip düzenleyebilirsiniz.

        kelime.replaceAll("\\p{Punct}", ""); // bütün sembolleri sildiri pdeğiştirebilirsiniz. ^ işareti atarak semboller dışında herşeyi silip değiştirebilirsiniz.

            /*
                            Meshur Regex'ler

        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEIOU]
           x, q, w harfleri ==> [xqw]

        8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
        9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

        Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
        Sadece space karakteri : \\s
        Space karakteri haric  : \\S
        Sadece rakamlar        : \\d  (digit ten geliyor)
        Rakamlar haric         : \\D
        */

        //stringi int yapma

        Integer.valueOf(kelime); // String değerini integer yapar. bir integer kavanozuna atmalıyız.

        //inti string yapma

        String.valueOf(kelime); // int değerini string yapar.

        //stringi bölmek

        kelime.split("");//Stringi istediğimiz yerden böler ve indexe ayırır. örnek enes burak stringini "boşluk" tan bölersek enes ve burak olarak 2 ye ayırır  ve enese 0. index burağa 1. index numarasını verir.

        //boşluk kontrolü

        kelime.isEmpty(); // stringin boş ve hiçlik olup olmadığını kontrol eder. string boş ise true doluysa false verir. space false boolean kabına koyarızç

        //hiçlik ve boşluk kontrolü

        kelime.isBlank(); //stringin "space hiçlik ve boş" olduğunu kontrol eder. varsa true yoksa false verir. space true. boolean kabına koyarız.



    }
}
