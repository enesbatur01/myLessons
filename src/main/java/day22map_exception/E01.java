package day22map_exception;

public class E01 {
    public static void main(String[] args) {

        /*
        Exception beklenmedik problem demektir. Java çözemediği bir sorunla karşılaştığında exception class ı devreye girer
        Exception bize karşılaşılan sorunun cinsini ve bu sorunun nereden kaynaklandığını ve sebebini bildirir
        Java exception fırlattığında kodun çalışmasını durdurur, ve bizden bir karar vermemizi ister.
        Kodumuzun çalışmaya devam etmesini istiyorsak try catch ile exception oluşturması muhtemel code larımızı try catch bloğu içerisine yazmalıyız

        Exception ı handle edebilmek için iki temel yol vardır
            a) Exception için gereksinimlere göre (FRD) uygun çözümler üretebilirsiniz. Buna Exception handling denir
                bunu try catch kullanarak yapabiliriz
                try block da yapılması gereken işlemi javadan isteriz, java işlemi problemsiz bir şekilde yaparsa catch block aktive olmaz
                try block da java yapılması istenen şeyi yaparken exception ile karşılaşırsa catch block devreye girer ve catch block içinde ki code lar çalışır
                try block da işlem yapılırken exception oluşursa try block içindeki exception dan sonraki code lar çalıştırılamaz
            b) Exception oluştuğunda bunu ilan eder ve geri çekilirsiniz. Buna da Throw Exception denir


        => Yazdığınız kod çalışmadığı zaman problemi çözmek için log lara bakarız
         */


        divide2(10,4);
        divide2(10,0);


    }

    //ArithmeticException yazdığınız code da matematiksel bir işlem kullanıyorsanız alınabilecek bir exception dır

    public static void divide2(int a,int b){

        try {
            System.out.println(a/b);
            System.out.println("Try içi görev tamamlandı");
        }catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");

        }
        System.out.println("try catch sonrası görev tamamlandı");
    }



    //Kesinlikle tavsiye edilmez !!!
    public static void divide(int a, int b){
        if (a==0||b==0){
            System.out.println("Do not divide by zero");
        }else  System.out.println(a/b);

    }



}
