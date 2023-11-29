package day19oop;

public interface Ac {

    /*
    1) Bir interface i bir classin parent i yapmak icin implements keywordunu kullaniriz
    2) Javae parentlar class oldugunda multiple parent a musaade etmez ama biz bazen multiple parenta ihtiyac duyabilirz
    Bu ihtiyaci gidermek icin java interface isimli bir yeni yapi olusturdu ve bu yapi sayesinde
    bir classin coklu interface parenti olabiliyor
    3) interfacelerin icine concrete method konulamaz, cunku concrete methodlarda body vardir
    ve body o methodun isi nasil yapacağını belirtir. Isini nasil yapilacağı bir cok detay icerir
    ve bu child classlarda kafa karisikligina sebep olur
    Halbuki sadece yapilmasi gereken isi söyleyip nasil yapilacağıni childa birakirsaniz child classin kafa karisikligini
    engellemis olursunuz
    4) interfacelerdeki tum methodlar otomatik olarak public dir, abstract tir static degildir
    5) interfaceler concrete method icermezler, dolayisiyla interfacein icindeki abstract methodlar child classlar
    tarafindan kullanilmasi mecuburidir. Bu yüzden interfacelere "to do list " de denir
    6) Coklu interface parentlarin herbirinin icine ayni isimli methodlar koyabiliriz
    Mesela AC nin Engine in ve Security nin iclerine run() methodu koymakk gibi
    Child class herhangi birini override ettiginde hepsini override etmis gibi olur sonrada body yi chlic classda
    yazarak uygulamasini yapmis olur
    7) interfacelerdeki tum variable lar otomatik olarak (default) olarak final dir, bu yüzden interface icindeki variable i
    olusturdugumuzda mutlaka deger atamasi yapmalisiiniz
    8) interfacelerdeki tum variable lar otomatik olarak (default) olarak final, public ve static dir,
    interfacelerde variable cagirirken interface adini kullanarak cagiririz bu hem static olmanin geregidir
    hemde okunurlugu artirir
    9) Normalde interface icine concrete method konulamaz ama bazi özel durumlarda conceret method koymak gerekirse
       a) default keywordunu kullanarak bunu yapabiliriz
       b) static keywordunu kullanarak bunu yapabiliriz

     ==>  static keywordunu kullanarak olusturdugumz concrete methodlara ulasmak icin
       object olusturmaya gerek yoktur. Interface ismi yeterlidir

     ==>  default keywordunu kullanarak olusturdugumuz concrete methodlara intrefacein child clasindan
     object olusturarak ulasilabilir

     10) interface lerden object olusturulamaz. interfacelerin constructor i yoktur

        child               parent
        class               class       ==>  extends
        interface           interface   ==>  extends
        class               interface   ==> implemenets
        interface           class       ==> olamaz

     11) Abstract Class ile interface arasindaki farklar nelerdir?
     a) Abstract classlar hem abstract method hemde concrete methodlar icerebilir
     fakat interfaceler abstract method icerir
        Ama interfacelerde istersek default ve static keywordllerini kullanarak conceret method olusturabiliriz

     b)Abstract classlar multiple inheritance i desteklemez
     ama interface ler destekler

     c)   Abstract classlar icinde her turlu variable olusturulabilir interfaceler icindeki variabllar
     public static ve final olmak zorundadir

     d) interface concrete classin childi olamaz ama absstract class classin childi olabilir

     e) abstract classlarda constructor vardir ama object uretemez, intrefaclerde constroctur yoktur
     bu yuzden object uretilemez
     */
    int price = 2000;
    public void coolest();
    public default void cool() {
        System.out.println("Make it cool");
    }

}
