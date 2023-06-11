
package ua.hillel.lesson03;
import java.util.Scanner;

/*
Написати програму, яка визначає, чи є трикотник рівнобедреним. Значення сторін трикутника задавати самостійно
*/

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть сторону 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Введіть сторону 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Введіть сторону 3: ");
        int side3 = scanner.nextInt();

        if ((side1 == side2) && side3 != side1 || (side2== side3) && side1 != side2|| (side3 == side1) && side2 != side1) {
            System.out.println("Трикутник є рівнобедреним");
        } else {
            System.out.println("Трикутник не рівнобедрений");
        }
    }
}