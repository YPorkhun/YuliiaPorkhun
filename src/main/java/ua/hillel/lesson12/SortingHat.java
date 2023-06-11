package ua.hillel.lesson12;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Написати програму, яка замість попелюшки сортує числа з початкової колекції на 3 кошика:
в перший - числа, які діляться на 2, в другий - числа, які діляться на 3, в третій - всі інші.
Якщо число ділиться на 2 і на 3, то воно має попасти в обидва кошика.
Початкову колекцію з 100 елементів заповнити випадковими цілими числами.
*/

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


