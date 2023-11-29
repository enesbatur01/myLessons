package day18oop;

public class Student {
    /*
    Encapsulation ==> Kapsülleme
    Encapsulation Nedir?    Data hiding(veri saklama)
    Data nasıl saklanır?
    Access Modifierlarını private yaparak data yı diğer classlardan görünmez hale getirerek saklarım

    Encapsulation yaptığımız datayı istersek diğer class lardan okuyabiliriz
    Nasıl okuyabiliriz?
    get methodlar oluşturarak encapsulate edilmiş data nın değerini okuyabiliriz

    1) get methodlar public olur
    2) get methodun return type ı okuduğu variable in return type ı ile aynı olur
    3) get method bir boolean variable için oluşturulduysa ismi is ile başlar

    Encapsulation yaptığımız data yı istersek diğer classlardan değiştirebiliriz
    Nasıl değiştirebiliriz?

    1) set methodları hep public olur
    2) set methodları return type ı hep void olur
    3) set methodun parametre kullanır, parametre data type ı variable ile aynı olur

    set method kullanarak varolan object üzerinde değişiklikler yapara ko objecti sanki yeni bir object miş
    gibi kullanabiliriz

    //getter ve setter lara "Java Beans" denir

     */
    public String stdName ="Ali Can";
    public int stdAge=14;

    private String stdId="AC12320804";
    private  double notOrt=3.13;
    private boolean succesful=false;


    public String getStdId (){
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }


    public boolean isSuccesful() {
        return succesful;
    }
    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
