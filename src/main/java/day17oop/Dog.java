package day17oop;

public class Dog extends Animal{
    public void bark(){
        System.out.println("dogs bark");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat");
    }

    @Override
    public void drink() {
        System.out.println("Dogs drink");
    }
}
