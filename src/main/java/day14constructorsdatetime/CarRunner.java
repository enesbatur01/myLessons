package day14constructorsdatetime;

public class CarRunner {
    public static void main(String[] args) {

        Car c1 = new Car("BMW","M4",2023,false);
        System.out.println(c1.hybrid);
        System.out.println(c1.make);
        c1.hareket();

        Car c2= new Car("Şahin","Tofaşk",1994,false);

        System.out.println(c2);



    }
}
