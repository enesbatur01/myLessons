package day16staticoop;

public class Animal {

    /*
    OOP conceptin 4 adet prensibi vardır
    1) Inheritance
    2) Polymorphism
    3) Encapsulation
    4) Abstraction

        1) Inheritance
            özellikleri bir class tan diğer classlara alan bir kavramdır, bunun java daki karşılığı şudur :
            siz bir class oluşturacaksınız ama daha önce oluşturulmuş bir class sizin istediğiniz özelliklerin bir çoğunu kapsıyor
            o zaman yeni oluşturduğunuz class a child class yapmalısınız
        1) Inheritance in faydaları
            a) Code tekrarlarından kurtuluruz
            b) Code tamiri(maintenance) kolay olur
            c) Child class ları daha atomic yapmış oluruz
        2) Bir classı başka bir class in child class ı yapmak için extends keyword kullanılır
        3) Child class objectleri Parent class dan method ve variable ları kullanabilirler
        4) Parent class objectleri child class dan method ve variable ları kullanamazlar
        5) Java da bir class ın sadece tek bir parent ı olabilir. Java çoklu parent ı desteklemez
            (==>Multiple inheritance) desteklemez. Java tekli parent ı (==> single Inheritance) destekler
        6) Apartman şeklinde ki inheritance yapısına Multilevel inheritence denir, java Multilevel inheritance ı destekler
        7) Object class her class ın parentıdır, javada object class hariç her class ın parentı vardır
        8) Java da parent tan child a olan  ilişkiler a HAS-A Relationship denir
            Java da child tan parent a olan  ilişkiler a IS-A Relationship denir
        9) Java da her class ın bir tane default constructor ı vardır bu default constructor class içinde gözükmez
            çünkü default constructor object class içindedir
           */

    public void eat (){
        System.out.println("animals eat");
    }
    public void drink (){
        System.out.println("animals drink");
    }
}
