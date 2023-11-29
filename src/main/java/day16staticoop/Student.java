package day16staticoop;

public class Student {
     /*
    1) static variable veya static methodlar (class member) tüm object ler için ortak elemandır
    2) static class member lar üzerinde yapılan değişiklikler tüm objectleri etkiler
    3) static class member lar class'a, non-static class memberlar objectlere monte edilir
        Mesela bir classdan 100 tane object oluşturduğunuzda non-static olanlar 100 kere oluşturulur
        ama static olanlar object sayısından bağımsız olarak bir kere oluşturulur
    4) static class member lara ulaşmak için object oluşturmaya gerek duyulmaz, ama non-static
        class lara ulaşmak için object oluşturmak şarttır
    5) static variable ların diğer adı class variabledir, non-static variable ların
        diğer adı instance variable yada object variable dir

     */

    public static String stdName1 ="Alicanstatic";
    public  String stdName2 ="Alicanstatic dğeil";

    public static void staticMethod(){
        System.out.println("ben static methodum");
    }
    public void nonStaticMethod(){
        System.out.println("Ben non static methodum");
    }
}
