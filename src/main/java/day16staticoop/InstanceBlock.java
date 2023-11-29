package day16staticoop;

public class InstanceBlock {

    //instance block tüm constructor larda bir kod çalıştırmamız gerektiğinde kullanılır
    //instance block tekrarı önler

    public int year ;

    public InstanceBlock() {
    }

    public InstanceBlock(int year) {
        this.year = year;
    }
    {
        System.out.println("Hello world");
    }
}
