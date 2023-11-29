package day18oop;

public class Cat extends Animal {
    public void meow() {
        System.out.println("cats meow");
    }

    @Override //override annotation : override kurallarını java tarafından kontrol edilmesini sağlıyor
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink");
    }


    @Override
    public Animal create() {
        return new Cat();
    }


    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiplay(Integer a, Integer b) {
        return a*b;
    }

}
