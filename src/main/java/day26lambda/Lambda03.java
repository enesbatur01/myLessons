package day26lambda;

import java.util.stream.IntStream;

public class Lambda03 {
    public static void main(String[] args) {

        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getMultiplyFromThreeToNine());
        System.out.println(getFactorial(12));
        System.out.println(getSumOfEvensBetweenTwoInteger(34, 28));


    }

    //4)7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy(){
        return IntStream.
                rangeClosed(7,70).
                reduce(Math::addExact).
                getAsInt();
    }
    //5)3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //1.yol
    public static int getMultiplyFromThreeToNine(){

        return IntStream
                .rangeClosed(3,9)
                .reduce(Math::multiplyExact)
                .getAsInt();
    }
    //2.yol
    public static int getMultiplyFromThreeToNine2(){

        return IntStream
                //range son kısmı kapsamıyor
                .range(3,10)
                .reduce(Math::multiplyExact)
                .getAsInt();
    }

    //6)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.
    public static int getFactorial(int x){
        if(x==0){
            return 1;
        } else if (x<0) {
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        } else {
            return IntStream.
                    rangeClosed(1,x).
                    reduce(Math::multiplyExact).
                    getAsInt();
        }
    }

    //7)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.

    public static int getSumOfEvensBetweenTwoInteger(int a , int b){

        if (a>b){
            int c =a;
            a=b;
            b=c;

        }

        return IntStream
                .range(a+1,b)
                .filter(Utils::isNumberEven)
                .reduce(Math::addExact)
                .getAsInt();

    }

}
