package day09loops;

public class WhileLoop01 {
    public static void main(String[] args) {



    /*
        //for loop
        for (baslangic degeri ; loop calisma kurali ; artirma / azaltma) {
            calisacak kodlar
        }

        //while loop

        baslangic degeri

        while(loop calisma kurali){
            calisacak kodlar
            artirma / azaltma
        }
        */

        //Example 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz
        //1 yol for loop
        for (int i = 3; i < 7; i++) {
            System.out.println(i);
        }


        //2. yol while loop

        int i = 3;

        while (i < 7) {

            System.out.println(i);

            i++;
        }

        //Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz

        int num = 23 ;

        while (num >11) {

            if (num%2==0) {
                System.out.println(num);
            }


            num--;

        }


    }
}
