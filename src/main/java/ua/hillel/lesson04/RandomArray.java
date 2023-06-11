package ua.hillel.lesson04;
import java.util.Random;

/*
Написати програму, яка в масиві з випадкових цілих чисел замінює всі парні числа на 0 і виводить отриманий масив на екран.
Для генерації випадкових чисел можна користуватись Random
*/

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
            if (arr[i] % 2 == 0) {
                arr[i]=0;
            }
            System.out.println(arr[i]);
        }
    }
}