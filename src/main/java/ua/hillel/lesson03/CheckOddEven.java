package ua.hillel.lesson03;
import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0 ) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("BYE!!!");
    }
}