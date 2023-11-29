package day22map_exception;

public class E03 {
    public static void main(String[] args) {

        String s = "Java";

        getCharFromString(s, 2);
        getCharFromString(s, 4);

    }

    public static void getCharFromString(String s, int idx) {

        try {char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Index limit aşımı "+ e.getMessage());
            System.out.println(e.getCause()); //null
            e.printStackTrace(); /*
            java.lang.StringIndexOutOfBoundsException: String index out of range: 4
	            at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
	            at java.base/java.lang.String.charAt(String.java:693)
	            at day22map_exception.E03.getCharFromString(E03.java:15)
	            at day22map_exception.E03.main(E03.java:9) */


            System.out.println("catch block içi printstacktrace methodu sonrası");
        }
    }

}
