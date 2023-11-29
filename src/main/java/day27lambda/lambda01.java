package day27lambda;

import day26lambda.Course;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class lambda01 {
    public static void main(String[] args) {

        //s
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);


        List<Course> courseList = new ArrayList<>();
        courseList.add(courseTurkishDay);
        courseList.add(courseTurkishNight);
        courseList.add(courseEnglishDay);
        courseList.add(courseEnglishNight);

        //1)Average score'u en yuksek olan kursun ismini console yazdiran kodu yaziniz.asdsad

        String name1 = courseList
                .stream()
                .sorted(Comparator.comparing(Course::getAverageScore).reversed())
                .findFirst()
                .get()
                .getCourseName();
        System.out.println(name1);

        //2) Tum course object'lerini average score'a gore kucukten buyuge diziniz
        // ve ilk ikisi haric liste halinde console'a yazdiriniz.

        List<Course> myList = courseList
                .stream()
                .sorted(Comparator.comparing(Course::getAverageScore))
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(myList);

        //3)Tum course object'lerini average score'a gore kucukten buyuge diziniz
        // ve ilk ucunu liste halinde console'a yazdiriniz.
        List<Course> myList2 = courseList
                .stream()
                .sorted(Comparator.comparing(Course::getAverageScore))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(myList2);

        // 4) Kursta bulunan ogrenci sayilarina gore buyukten kucuge
        // sirali bir sekilde listin icinde  veren  kodu yaziniz.

        List<Course> myList3 = courseList
                .stream()
                .sorted(Comparator.comparing(Course::getNumberOfStudents).reversed())
                .collect(Collectors.toList());
        System.out.println(myList3);


        //5) kursta bulunan ingilizce bolumlerinin sayisini veren kodu yaziniz
        long ingilizceBölümSayısı = courseList
                .stream()
                .filter(t -> t.getCourseName().contains("English"))
                .count();
        System.out.println(ingilizceBölümSayısı);

        //6)Ogrenci sayisi 140 tan az olan kurslari bir liste halinde veren kodu yaziniz

        List<Course> myList4 = courseList
                .stream()
                .filter(t -> t.getNumberOfStudents() < 140)
                .collect(Collectors.toList());
        System.out.println(myList4);





    }
}
