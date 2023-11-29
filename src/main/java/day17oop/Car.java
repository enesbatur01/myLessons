package day17oop;

public class Car extends Vehicle {
    public Car(){
        super(54000);
        System.out.println("Car 1");
    }
    public Car(String make){
        super (432);
        System.out.println("Car 2");

    }
    public String model ="Accord";
    public int km = 20000;
}
