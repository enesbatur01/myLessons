package day23exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class E01 {
    /*
       1) Run button una bastıktan sonra console da alınan exception lara RunTime exception exception denir
           ArithmeticException, NumberFormatException vs.....
           RunTime Exception lara Unchecked Exception da denir
       2) Code yazarken altı kırmızı çizgi şeklinde alınan exceptionlara Compile Time Exception denir
           FileNotFoundException, IOException vs.....
           Compile Time Exception lara Checked Exception da denir

       interview sorusu
       throw ile throws keywordleri arasındaki fark nedir?
       1) throw, method bodysi içerisinde , throws ise method parantezinden hemen sonra kullanılır
       2) throw method body içerisinde istediğimiz kadar kullanabiliriz
          throws method parantezindne hemen sonra ve sadece 1 kere kullanılabilir
       3) throw dan sonra new keyword ve constructor kullanarak object oluşturulur
          throws dan sonra sadece Exception class ismi yazılır
       4) throw belli şartlar için exception fırlatmada kullanılır
          throws ise bir method un belli bir exception u firlatabilecegini belirtmek için kullanılır
        */
    public static void main(String[] args) throws IOException {

        FileInputStream fis =new FileInputStream("src\\main\\java\\day23exceptions\\file.txt");

        int k=0;
        while((k= fis.read())!=-1){
            System.out.print((char) k);
        }
    }
}
