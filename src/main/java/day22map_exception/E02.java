package day22map_exception;

public class E02 {
    public static void main(String[] args) {

    String s = "1234";
    convertStringToInt(s);



    }
    //Icinde rakamlar dışında character olan bir string i sayıya çevirmek isterseniz java NumberFormatException atar

    public static void convertStringToInt(String s){
      try {
          int intS = Integer.valueOf(s);
          System.out.println(intS+1);
      }catch (NumberFormatException e){
          System.out.println("Bir String sayıya çevrilebilmesi için rakam dışı character içermemesi gerekir");
          System.out.println(e.getMessage());
      }



    }



}
