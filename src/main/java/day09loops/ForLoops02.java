package day09loops;

public class ForLoops02 {

    public static void main(String[] args) {


        //Example : verilen sayıda ondalık kısımdaki rakamların toplamını bulun
        //            28.587 ==> 5+8+7=20

        double num = 28.587;

        //ondalıklı kısmı alabilmek için stringe çevirmeliyiz.

        String sNum = String.valueOf(num);

        // "." işaretinden itibaren split ile keseriz ve ondalık kısmı alabiliriz.

        String newNum = sNum.split("[.]")[1];

        // Stringi integer a çevirdik not: Integer yazmamızın sebebi method kullanabilmesi.

       Integer intNum= Integer.valueOf(newNum);



        int sum=0;

        for (int i =intNum; i>0; i=i/10) {
            sum=sum +i%10;
        }

        System.out.println(sum);



    }

}
