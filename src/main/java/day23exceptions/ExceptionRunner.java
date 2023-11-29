package day23exceptions;

public class ExceptionRunner {

    public static void main(String[] args) {
        /*
        Exception lar dışında bizim Error diye  adlandırdığımız ve handle edilemeyen bazı problemler vardır
         mesela application larda memory nin dolması bir errordur
           iki tür memory error vardır:
           a) Stack memory dolarsa "StackOverFlow Error" alırsınız
           b) Heap memory dolarsa "OutOfMemory Error" alırsınız

           finalize:
           Garbage collector memory i temiz tutmak için sürekli memory i tarar vesilinmesi gerekenleri siler
           Garbage collector silmeden önce sileceği dataları "finalize" yapar sonra siler
           yani Garbage collector sadece finalized yapılmış objectleri toplar ve yok eder

           final - finally - finalize()

         */

        getStudentGrade(-5);

        getNumberOfStudents(-5);
    }

    public static void getNumberOfStudents (int numOfStudents){

        if (numOfStudents<0){
            try {
                throw new InvalidNumberException("Student numbers cannot less than zero");
            } catch (InvalidNumberException e){
                System.out.println(e.getMessage());
            }

        }else {
            System.out.println(numOfStudents);
        }


    }
    public static void getStudentGrade(int grade){
        if (grade<0 || grade >100){
            try {
                throw new InvalidStudentGradeException("Students grades cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println(grade);
        }
    }
}
