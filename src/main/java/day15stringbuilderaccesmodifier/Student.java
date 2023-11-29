package day15stringbuilderaccesmodifier;

public class Student {

    /*
    public > protected > default > private
    public      ==> her classdan kullanılabilir
    protected   ==> başka package lardan kullanılamaz
                        ancak başka package larda child class içinden kullanabilir
    default     ==> başka package lardan kullanılamaz
    private     ==> sadece oluşturuldukları class içinde kullanılabilirler
     */

    //public her class dan kullanılabilirler
    public String stdName ="Ali Can";

    //protected olanlar başka package lardan sadece child class lardan görülebilirler

    protected String address ="Denizli";

    //default acces modifierlarda default keyword yazılmaz
    //default olanlar başka package lardan kullanılamazlar

    String email ="enay10171@gmail.com";

    //private olanlar sadece oluşturuldukları class içinde kullanılabilirler
    private String ssnId ="1213456789";

}
