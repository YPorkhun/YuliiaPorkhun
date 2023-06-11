package ua.hillel.lesson12;
import java.util.*;

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

