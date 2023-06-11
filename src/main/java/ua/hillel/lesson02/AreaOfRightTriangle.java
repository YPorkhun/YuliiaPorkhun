package ua.hillel.lesson02;
import java.util.Scanner;

/*
Написати програму, яка обчислює площу прямокутного трикутника, початкові значення сторін можна задати довільно.
*/

public class AreaOfRightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть довжину першого катета: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть довжину другого катета: ");
        double b = scanner.nextDouble();
        double S = (a*b)/2;
        System.out.println("Площа прямокутного трикутника: " + S);
    }
}