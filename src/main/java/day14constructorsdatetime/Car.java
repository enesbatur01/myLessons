package day14constructorsdatetime;

public class Car {

    /*
    Constructor nedir ?
    class dan object üretmemize yarayan code blocklarıdır
    class oluşturulduğunda java bize otomatik olarak bir constructor verir
    Ama bu constructor gözle görülmez, gözle görülmeyen otomatik olarak java tarafından verilen
    bu constructor lara "default constructor" denir

    Siz kendi constructor oluşturduğunuzda java default constructor u siler

    Bir class da farklı parametreler kullanarak istediğimiz kadar constructor oluşturabiliriz
    farklı constructorlar sayesinde bir classtan farklı farklı objectler oluşturabiliriz

    Constructor nasıl oluşturulur ?
    Access modifier + Class ismi + () + {}
    interview sorusu :

    Methodlar ile constructorlar arasındaki fark nedir?

    1) Methodlar return type olur, Constructor larda olmaz
    2) Methodlar yaptıkları işe göre isimlendirilirler , Constructorlar ise her zaman class ismi ile isimlendirilirler
    3) Methodlar bir aksiyon oluşturmak için oluşturulurlar, Constructorlar ise object oluşturma içindir
    4) Method isimleri küçük harfle başlar, Constructor isimleri class ismi ile aynı olduğu için büyük harfle başlar


    default constructor ===> Car() {  }
     */


    //variable lar oluşturalım

    String make = "Honda";

    String model = "Accord";

    int year =2023;

    boolean hybrid=true;

    Car (String make , String model, int year , boolean hybird) {
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybird;
    }

    Car (String make , String model) {
        this.make=make;
        this.model=model;

    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }


//Method lar oluşturalım

    public void hareket () {
        System.out.println("Honda hizli hareket eder");
    }
    public void dur() {
        System.out.println("Honda güvenli bir şekilde durur");
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
