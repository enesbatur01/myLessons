package day22map_exception;

public class E05 {
    public static void main(String[] args) {

        /*
        try kisminda birden fazla exception olusturma ihtimali olan kod varsa coklu catch kullanabilirisiniz
    Coklu catch kullandiginizda Execption classlar arasinda parent - child iliskisi yoksa catchlerin sirasi önemli degildir
     Ama kod daki siralamaya uymak daha readable dir

     Coklu catch kullandiginizda Entxecption classlar arasinda pare - child iliskisi varsa catchlerin sirasi önemli olur
     child class ustte olmak zorundadir


         */

        int a = 12;
        int b = 1;
        String s = "AliCan";
        getCharFromString(s, a, b);

    }

    public static void getCharFromString(String s, int a, int b) {

        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            System.out.println(e.getCause());
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }


}
