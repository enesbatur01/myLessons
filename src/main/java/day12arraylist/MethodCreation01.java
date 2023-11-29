package day12arraylist;

public class MethodCreation01 {
    public static void main(String[] args) {
        /*
        Java da method nasıl oluşturulur.
        ==> main methodun dışında classın içinde oluşturulur
        1) Acces Modifier + return type + Method ismi + () + {}
        2) Method oluşturmak methodu çalıştırmak için yeterli değildir
        */
        // Method call : main method içinde bir method kullanılmasına method call denir.


        System.out.println( toplamaYap(2,6));

    }//main method kapanış

    //ornek 1 :toplama islemi yapan bir method olusturunuz
//acces modifier ,      static ,    return type ,      method ismi
    public              static         int              toplamaYap     (int a , int b) {
       return a+b;

    }

}//class kapanış.
