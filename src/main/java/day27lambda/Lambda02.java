package day27lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) throws IOException {


        //Example 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.

        Files.lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).forEach(System.out::println);


        Files.lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Example 3: Verilen text file icindeki text'lerde "map" kelimesinin olup olmadigini kontrol eden kodu yaziniz.
        boolean isMap=Files.lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt")).anyMatch(t-> t.contains("map"));

        System.out.println(isMap);

        //Example 4: Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.

        List<String> words=Files.lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt"))
                .map(t-> t.replaceAll("\\p{Punct}","").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        System.out.println(Files.lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt"))
                .map(t -> t.replaceAll("[^a-zA-Z]", "").split(""))
                .flatMap(Arrays::stream)
                .count());


        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri natural order da
        //bir listin icinde return eden kodu yaziniz.

        List<String> word=Files.lines(Paths.get("src\\main\\java\\day27lambda\\LambdaTextFile.txt"))
                .map(t -> t.replaceAll("[^a-zA-Z]", "").split(""))
                .flatMap(Arrays::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(word);

    }
}
