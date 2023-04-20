package ua.hillel.lesson02;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення в градусах Цельсія: ");
        double с = scanner.nextDouble();
        double F = (с*1.8)+32;
        double K = с + 273.16;
        System.out.println("У Фаренгейтах: " + F);
        System.out.println("У Кельвінах: " + K);


    }

}