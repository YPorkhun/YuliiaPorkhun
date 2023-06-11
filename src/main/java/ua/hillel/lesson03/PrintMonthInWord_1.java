package ua.hillel.lesson03;
import java.util.Scanner;

/*
Написати програму "PrintMonthInWord" яка друкує "JAN", "FEB" ... "DEC" якщо значення int змінної дорівнює 1, 2, 3 ... 12.
Або повинна вивести "Not a valid month". Розв'язати завдaння 2 способами:
- за допомогою операторів if-else
- за допомогою оператора switch
*/

public class PrintMonthInWord_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть місяць: ");
        int month = scanner.nextInt();

        if (month == 1) System.out.println("JAN");
        else if (month == 2) System.out.println("FEB");
        else if (month == 3) System.out.println("MAR");
        else if (month == 4) System.out.println("APR");
        else if (month == 5) System.out.println("MAY");
        else if (month == 6) System.out.println("JUN");
        else if (month == 7) System.out.println("JUL");
        else if (month == 8) System.out.println("AUG");
        else if (month == 9) System.out.println("SEP");
        else if (month == 10) System.out.println("OCT");
        else if (month == 11) System.out.println("NOW");
        else if (month == 12) System.out.println("DEC");
        else System.out.println("Not a valid month!");
    }
}