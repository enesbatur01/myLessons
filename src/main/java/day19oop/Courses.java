package day19oop;

public abstract class Courses {

    //Abstraction
    /*
    1) Eğer bir class tan object oluşturulmasını istemiyorsak ve bu class ı sadece child classların yapmak
        zorunda oldukları görevleri belirlemek için kullanıyorsak "Abstraction" yaparız

    2) Bazen parent class daki methodun bodysi hiçbir child class tarafından kullanılmaz. Bu durumda parent taki
        methoda body yazmak hiç kullanılmadığı için mantıklı değildir. Bizde o methoda body yazmayız.

    3) Methodun body sini yazmayınca java bize hata verir, bizde abstract keywordunu kullanarak java ya bu methodun
        bodysi olmayacak deriz.

    4) Abstract keywordunu kullanınca elde ettiğimiz abstract method normal classlara konulamaz, o yüzden classı da
        Abstract yapmalıyız

    5) Parent daki method abstract ise bütün concrete child classlar o methodu override etmek zorundadır
        Bu yüzden tüm childlar için mecburi olmasını istediğimiz methodları abstract yaparız

    6) Body si olan methodlar (concrete) abstract classların içine yazılabilir. Abstract methodlar concrete classların
        içerisine yazılamazlar. Concrete method lar child class lar tarafından override edilmek zorunda değildir

    7) Abstract keyword ile method body bir method ta aynı anda kullanılamaz

    8) final methodlar abstract olamazlar. Final methodlar override edilemezler, halbuki abstract methodlar override
        edilmek için oluşturulurlar. Bu çelişkidir dolayısıyla java abstract methodların final olmasına izin vermez

    9) abstract classlarin icinde abstract methodlar olur, abstract methodlar body si olmadigindan eksik methodlar gibi düsünülebilir
    Yani abstract class icinde eksik yapi barindirir. Bu nedenle java applicationu korumak icin
    abstract classlardan object olusturulmasina izin vermiyor

    10) Abstract class ların constructor ları vardır ama object oluşturamazlar

    11) Abstract class ın abstract childı veya concrete child ı olabilir. Eğer child abstract ise
         abstract methodları override etmek zorunda değildir. Eğer concrete ise override etmek zorundadır

    12) Abstract methodlar private olamazlar çünkü child classlar abstract methodları override etmek zorundadırlar
         private yapıınca kullanıma kapalı olur, Bu çelişkidir, dolayısıyla java abstract methodların private olmasına
         müsaade etmez

    13) Class lar final olduğunda child classa sahip olamazlar, Ama abstract classlar için child class olmalıdır
         çünkü child classlar abstract parent taki methodları kullanırlar. Bu yüzden java abstract classların
         final olmasına müsaade etmez



         */

    public abstract void math();

    //public abstract void science ();
    public void art() {

    }

}
