package ua.hillel.lesson12;
import java.util.*;

/*Написати програму яка видаляє з колекції цілих чисел всі дублікати, якщо вони є.
Початкову колекцію з 100 елементів потрібно заповнити випадковими числами (ліміт 50).
На екран потрібно вивести обидві колекції та кількість видалених дублікатів.
*/

public class WithoutDuplicateCollection {
        public static void main(String[] args) {
            List<Integer> mylist = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i <100 ; i++) {
                mylist.add(random.nextInt(50));
            }

            Set<Integer> mySet = new HashSet<>(mylist);
            System.out.println(mylist);
            System.out.println(mySet);

            int amountOfDuplicate = mylist.size() - mySet.size();

            System.out.println("Кількість видалених дублікатів: " + amountOfDuplicate );


    }
}

