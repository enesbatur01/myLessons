package day18oop;

public class Animal {
    /*
    1) Parent class daki methodu child class içinde özelleştirerek kullanmaya overriding yapmak denir.

    2) Overriding de methodun parentezine, methodun ismine dokunulmaz, yani methodun signature ı değiştirilmez
        methodun body si değiştirilir

    3) Child class taki override eden eat() methoduna Overriding Methpd denir
        Parent class taki override edilmiş eat() methoduna overriden denir

    4) private methodlar override edilemezler

    5) Child class daki methodun access modifieri parent class daki override edilmiş (overriden) methodun
        access modifier ından dar olamaz. Aynısı olabilir, yada daha geniş olabilir

        Overriden Method ==> protected -- Overriding Method ==> protected + public
        Overriden Method ==> default -- Overriding Method ==> default + protected + public
        Overriden Method ==> protected -- Overriding Method ==> protected + public
        Overriden Method ==> private -- Overriding Method ==> override olmaz ki access modifier olsun
        (bakınız 4.kural)

    6) Child class da override edilen methodun return type ı ile Parent class taki methodun return type ı arasında
        IS-A ilişkisi varsa return type değiştirilebilir

    7) Methodun return type ı primitive ise Overriding yaparken return type değiştirilemez. Çünkü return type ya aynı olur
        veya parent tan seçilir ama primitive ler arasında parent - child ilişkisi olmadığından parenttan seçmek söz konusu olamaz
        ve geriye tek seçenek kalır oda aynı olmak

    8) Child da override edilen methodun return type ı  ile parent taki methodun return type ı arasında IS-A ilişkisi
        yoksa return type değiştirilemez, java bir wrapper class ı diğerinin child ı yapmadığından wrapper classlarda return type
        değiştirilemez

    9) Methodun return type ı void ise Overriding yaparken type değiştirilemez
        yani void ise yine void olarak kalmak zorundadır

    10) static methodlar override edilemezler, Çünkü static methodlar tüm childlar için ortak method olur
        Bir child bir ortak methodu değiştirdiğinde diğer child lar bundan olumsuz etkilenebilir, bu nedenle
        java static methodların override edilmesine müsade etmez

    11) final methodlar override edilemezler, final methodların body si değiştirilemez ama override ederken
         Method body i değiştiririz, bu bir çelişki olduğundan java final methodların override edilmesine müsade etmez
                a) final keywordünü variable lar ile kullanabilirsiniz
                    i) final variable larda mutlaka değer atanmalıdır
                    ii) ilk atanan değer değiştirilemez

                b) final keywordünü method lar ile kullanabilirsiniz
                    i) method final ise methodun body si değiştirilemez
                    ii) method body si değiştirilemeyince override yapmak mümkün olmaz

                c) final keywordünü class lar ile kullanabilirsiniz
                    i) class final ise o class kısırdır child ı olamaz
    12) Polymorphism = Method Overriding + Method Overloading

     */
    public void eat (){
        System.out.println("Animals eat");
    }
    public void drink (){
        System.out.println("Animals drink");
    }

    public Animal create (){
        return  new Animal();
    }

    public int add(int a , int b){
        return a+b;
    }
    public Integer multiplay(Integer a, Integer b){
        return a*b;

    }
    public final double circleArea(double r){
        return 3.14*r*r;
    }

}
