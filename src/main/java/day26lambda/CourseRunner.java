package day26lambda;

import java.util.ArrayList;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer","Turkish Day",97,128);
        Course courseTurkishNight = new Course("Winter","Turkish Night",98,154);
        Course courseEnglishDay = new Course("Spring","English Day",93,132);
        Course courseEnglishhDay = new Course("Winter","English Night",90,144);

        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishhDay);

        //System.out.println(courseList);

        //1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol kodu yaziniz

        boolean result1=courseList
                .stream()
                .allMatch(t-> t.getAverageScore()>91);
        System.out.println(result1);
        //AllMatch method u parantez içinde verilen sarta streamdeki tüm elemanalrın bu sarta uyması durumunda true verir


        //2)Tum kurslardaki ögrenci sayilarinin larin 100 den buyuk olup olmadigini kontrol kodu yaziniz

        boolean result2=courseList
                .stream()
                .allMatch(t-> t.getNumberOfStudents()>100);
        System.out.println(result2);


        //3)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz.

        boolean result3=courseList
                .stream()
                .anyMatch(t-> t.getCourseName().contains("Turkish"));
        System.out.println(result3);

        //4)dönem isimlerinden en az birinin "Summer" kelimesini icerip icermedigini kontrol eden kodu yaziniz.

        boolean result4= courseList.stream().anyMatch(t-> t.getSeason().contains("Summer"));
        System.out.println(result4);



        boolean result5 = courseList
                .stream()
                .noneMatch(t-> t.getSeason().contains("Fall"));

        System.out.println(result5);


        boolean result6 = courseList.stream().noneMatch(t-> t.getCourseName().contains("German"));
        System.out.println(result6);


    }






}
