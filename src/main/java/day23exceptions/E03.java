package day23exceptions;

public class E03 {

    public static void main(String[] args) {

        /*
        1) Exception olsa da olmasa da çalıştırmamız gereken kodları finally block içine yazarız
        2) Database ile bağlantıyı kesme işini yapan code lar gibi code lar her halukarda çalıştırılmalıdır
        dolayısıyla bu tarz code ları finally block içine yazarız
         */

        int a=12;
        int b=0;
        int c [] = {1,2,3,4,5};

        getNumberFromIntArray(c,a,b);

    }

    public static void getNumberFromIntArray(int [] c,int a , int b){
   /*
       1)try tek basina kullanilamaz,  try + 1 catch olur - try + cok catch olur
         try catch block olmadan sadece finally ile de kullanilabilir
         try ile coklu catch ve finally block kullanilablir
       2) Coklu finally block kullanilamaz
        */

        try {
            int idx = a/b;
            int element =c[idx];
            System.err.println(idx);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("cut the connection with the database");
        }

    }


}
