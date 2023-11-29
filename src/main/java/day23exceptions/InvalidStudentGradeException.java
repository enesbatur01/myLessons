package day23exceptions;

public class InvalidStudentGradeException extends Exception {
    public InvalidStudentGradeException(String message) {
        super(message);
    }
    /*
    1) Custom Exception Class oluşturmak için Exception Class a extends etmeliyiz
        Exception class a extend ederek oluşturduğumuz custom Exception Class Compile Time Exception olur
        Eğer RunTime Exception oluşturmak istersek RunTimeException Class a extend etmeliyiz

    2) Custom Exception Class oluştururken constructor oluşturarak mesaj verebiliriz

    3) Custom Exception Class oluşturduğumuzda ismin sonuna Exception kelimesini kullanmalısınız
     */
}
