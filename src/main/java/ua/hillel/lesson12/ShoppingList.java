package ua.hillel.lesson12;
import java.util.HashMap;
import java.util.Map;

public class ShoppingList {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("молоко", 1);
        myMap.put("сир", 2);
        myMap.put("яйця", 10);
        myMap.put("сосиски", 5);
        myMap.put("яблука", 7);

        int result = 0;
        for (Integer i : myMap.values()) {
            result += i ;
        }
        System.out.println("Кількість доданих товарів: " + result);

    }
}
