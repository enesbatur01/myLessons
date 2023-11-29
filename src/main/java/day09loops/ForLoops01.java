package day09loops;

import java.util.Scanner;

public class ForLoops01 {

    public static void main(String[] args) {

            /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....
    */

        for (int i = 1; i < 5; i++) {

            System.out.println("Week : " + i);
            for (int ii = 1; ii < 8; ii++) {
                System.out.println("Day : " + ii);
            }

        }

           /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */


        Scanner input = new Scanner(System.in);
        System.out.println("Kaç X yazılsın? ");
        int xNum = input.nextInt();
        System.out.println("Satır sayısını giriniz.");
        int satir = input.nextInt();


        for (int j = 0; j < satir; j++) {
            System.out.print("X ");
            for (int jj = 0; jj < xNum; jj++) {
                System.out.print("X ");
            }
            System.out.println();
        }

    }

}
