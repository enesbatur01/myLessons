package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethoddCreation01 {
    public static void main(String[] args) {


        int a = Carpma(15, 45);
        System.out.println(a);

        int reMultiplay= multiplay(1,3,5);
        System.out.println(reMultiplay);

         printMethod("selam");


    }

    //ornek 1 : 2 sayiyi carpma islemi yapan bir method olusturunuz
    public static int Carpma(int a, int b) {
        return a * b;
    }
    //Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
    public static int multiplay (int a , int b , int c){

        return a*b+c;

    }
    //Ornek 3: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.

    public static void printMethod(String a ){
         System.out.println(a);
    }
    //Eğer bir method yeni bir data üretmiyor ise return type void olur
    //Methodun return type ı void ise method body içinde return keyword yazılmaz
    //Note : Method olusturmada kullanilan variable lar parametreler "parameters" olarak adlandirilir
    //      Method call da kullanilan degerlere Argumanlar "Arguments" denir.
}
