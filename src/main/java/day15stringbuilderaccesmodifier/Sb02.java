package day15stringbuilderaccesmodifier;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);

        System.out.println(sb1.reverse());
        //Verilen indexteki characteri siler
        sb1.deleteCharAt(0);
        System.out.println(sb1);
        //Verilen index aralığındaki characterleri siler. başlangıç dahil bitiş hariç olmak üzere siler
        sb1.delete(0, 3);
        System.out.println(sb1);
        //replace(0,2,"xxx"); 0 dahil 2 hariç olmak üzere bu indexlere x koyar
        sb1.replace(0, 2, "xxx");
        System.out.println(sb1);
        //2.index e 777 ekle
        sb1.insert(2, 777);
        System.out.println(sb1);
 /*
        compareTo() iki StringBuilder i baştan başlayarak harf harf karşılaştırır
        ilk harf aynı ise ikincilere geçer, ikinciler aynı ise üçüncülere geçer
        ilk farklı olan harfe kadar gider
        farklı olan iki harfin ascii kodları arasındaki farkı verir

        eğer hiç farklı harf yoksa sonuç 0 verir
        sonuç 0 alfabetik olarak aynı sırada demektir
        sonuç -1 ise sb2 sb3 den alfabetik olarak önde demektir
        sonuç 1 ise sb2 sb3 den alfabetik olarak sonra demektir
         */

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");
        int result = sb2.compareTo(sb3);
        System.out.println(result);


        //StringBuilder nasıl string e çevrilir ?
        //toString() methodu StringBuilder i string e çevirir
        //String class da var olan ama StringBuilder class içinde var olmayan mesela split() methodu gibi
        //methodlara ihtiyaç duyduğumuzda bu method sayesinde string class içindeki methodları kullanabiliriz

        String str= sb2.toString().toUpperCase();

        //String nasıl StringBuilder a çevrilir ?
        StringBuilder newSb1 = new StringBuilder(str);

        /*
        1) StringBuffer Java da string üreten bir diğer classdır
            StringBuffer javanın string üretmek için oluşturduğu ilk classtır

        2) StringBuffer, StringBuilder a çok benzer, yani ikiside mutable string üretir
        3) StringBuffer "multi-thread" dir ama StringBuilder "multi-thread" değildir
        4) StringBuilder "multi-thread" olmadığı için StringBuffer dan daha hızlı çalışır
        5) multi-thread yapılırken yapılan işlemlerin sıralaması önem arz eder
            Yapılan işleri mantıklı bir sıraya koymak "synchronization" olarak adlandırılır
            StringBuffer multi-thread olduğu için aynı zamanda synchronized dir

                a) immutable string lazımsa : String
                b) mutable string lazımsa : StringBuilder veya StringBuffer
                        i) StringBuilder i multi-thread gerekmezse kullanırız
                        ii) StringBuffer ı multi-thread gerekirse kullanırız

         */

        // StringBuffer nasıl oluşturulur ?
        StringBuffer sbf = new StringBuffer();
        System.out.println(sbf);
    }
}
