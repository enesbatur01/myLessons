package day16staticoop;

import java.time.LocalDate;

public class StdRunner {

    public static void main(String[] args) {

        //stdName1 static olduğu için ona ulaşmak için object oluşturmadık
        //sadece class ismini kullanmak yeterlidir bu yüzden, class variable dır
        System.out.println(Student.stdName1);

        //stdName2 non-static olduğundan ona ulaşmak için object oluşturmalıyız
        Student ali = new Student();
        System.out.println(ali.stdName2);

        Student.staticMethod();
        ali.nonStaticMethod();

        //class ismi ile kullanılabilen variable ve methodlar static
        //bir obje ile kullanılan method ve variable lar non-static tir
        //non static örnek String a ="Ali";  a.slpit  ______   Student ali = new Student();
    }

}
