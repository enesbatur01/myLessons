package day18oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1=new Student();

        //getter ile encapsulate yapılan private veriyi okumak
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());

        //setter ile encapsulate yapılan private veriyi değiştirdik
        s1.setStdId("Selam");
        s1.setNotOrt(12);
        s1.setSuccesful(false);
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());
    }
}
