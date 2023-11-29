package day22map_exception;

public class E07 {
    public static void main(String[] args) {

        /*
        Throw keyword bir methodun body si içinde istediğimiz yerde, istediğimiz koşullar için istediğimiz kadar kadar Exception atmamızı sağlar
        throw yazıldıktan sonra bir exception class object i oluştururlur
        Exception class constructor ının içine istediğimiz exception mesajını yazabiliriz
         */


        printAge(63);
        printAge(313);
        printAge(-5);


    }

    //Kendi exception ımızı oluşturmak
    public static void printAge (int age){
        if (age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        } else System.out.println(age);


    }

}
