package day20collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {


        Queue<String>depo=new LinkedList<>();
        depo.add("süt");
        depo.add("yumurta");
        depo.add("peynir");
        depo.add("sucuk");
        depo.add("et");
        System.out.println(depo);

        depo.remove();
        System.out.println(depo);

        System.out.println(depo.peek());

        depo.clear();
        System.out.println(depo);

        System.out.println(depo.poll());

        System.out.println(depo.peek());


        Queue<String> wareHouse = new PriorityQueue<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        wareHouse.add("Orange");

        System.out.println(wareHouse);

        Deque<String> d = new LinkedList<>();


    }
}
