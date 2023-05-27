package ua.hillel.lesson12;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortingHat {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                list.add(random.nextInt(100));
            }
            System.out.println("Початкова колекція: " + list);

        List<Integer> firstBasket = new ArrayList<>();
        List<Integer> secondBasket = new ArrayList<>();
        List<Integer> thirdBasket = new ArrayList<>();

        for (Integer i : list) {
                if (i % 2 == 0) firstBasket.add(i);
                if (i % 3 == 0) secondBasket.add(i);
                if ( (i % 3 != 0) && (i % 2 != 0) ) thirdBasket.add(i);
        }
        System.out.println("Перший кошик : " + firstBasket);
        System.out.println("Другий кошик : " + secondBasket);
        System.out.println("Третій кошик : " + thirdBasket);
    }
}


