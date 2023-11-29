package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class Varargs {
    public static void main(String[] args) {
        System.out.println(toplamaYap(1, 435, 3456, 678, 68, 345, 543, 876, 567, 564, 7988));

    }
    //Toplama işlemi yapan bir method oluşturun
    public static int toplamaYap(int... a) {
        int sum = 0;
        for (int w : a ) {
            sum=sum+w;
        }
        return sum;
    }

    //1) Bir method parantezinde birden fazla varargs kullanilmaz
    //2) Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir


    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya Varargs diyoruz
    //Varargs arka planda Array yapisini kullanir

    //toplama islemi yapan bir method olusturun
//    public static int toplamaYap(int a, int b) {
//        return a + b;
//    }
//
//    public static int toplamaYap(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int toplamaYap(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }



}
