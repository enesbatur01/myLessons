package day03wrapperconcatenationoperators;

public class WrapperClass {
    public static void main(String[] args) {
        //java, primitive data type lara bazi faydali methodlar ekleyerek yeni bir veri yapisi olusturmustur.
        //Bu yeni yapi "WrapperClass" olarak adlandirilir

        //  primitive   :    char    - boolean  - byte - short -  int        - long     - float - double
        //Wrapper Class : Character  - Boolean  - Byte - Short - Integer     - Long     - Float - Double

        int n = 12;
        Integer m = 12;

        //Ornek : Primitive int i wrapper Integer a ceviriniz.(Autoboxing)

        int num = 13;
        Integer wrapperNum = num;

        //Ornek :Wrapper Byte i primitive byte a ceviriniz (Unboxing)
        Byte k = 19;
        byte primitiveK = k;
    }
}
