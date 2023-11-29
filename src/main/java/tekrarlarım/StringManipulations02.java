package tekrarlarım;

import java.util.Arrays;

public class StringManipulations02 {

    public static void main(String[] args) {

        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s = "Java is easy. Learn Java earn money.";

        // boşluklardan böler ve her bir kelimeyi arraye atar.
        String words[] = s.split(" ");

        // kelimelerin arrayde nasıl gözüktüğünü yazar.
        System.out.println(Arrays.toString(words));

        //kaç array olduğunu yazar.
        System.out.println(words.length);

    }
}
