package ua.hillel.lesson02;
import java.util.Scanner;

/*
Написати програму, яка конвертує градуси Цельсія у Фаренгейти и Кельвіни
Вивід має бути приблизно таким: X C: Y F; Z K, де X - початкове значення в градусах Цельсія,
Y и Z - обчислені значення в Фаренгейтах и Кельвінах відповідно.
*/

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