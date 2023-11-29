package day14constructorsdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Anlık zamanı nasıl alırız ?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);



        /*
DateTime Class ta kullanilan tarih saat formatlari
    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a ==> 12'li saat sistemi AM, PM
    HH : mm : ss==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */


        DateTimeFormatter myTime = DateTimeFormatter.ofPattern("HH:mm");
        String formatedTime = myTime.format(myCurrentTime);
        System.out.println(formatedTime);

        //Date fromatı

        LocalDate myCurrentDate = LocalDate.now();
        DateTimeFormatter myDate = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String formatedDate = myDate.format(myCurrentDate);
        System.out.println(formatedDate);

        //Başka bir zaman dilimindeki tarih ve zamanı nasıl alırız?
        LocalDate tokyoDate= LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoDate);

        LocalDate amsDate= LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(amsDate);

        LocalTime tokyoTime= LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoTime);

        //Saat ve tarih aynı anda alınacaksa

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy -- HH : mm");
        String FormatedDtf = dtf1.format(ldt);

        System.out.println(FormatedDtf);

    }
}
