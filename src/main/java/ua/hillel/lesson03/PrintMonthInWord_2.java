package ua.hillel.lesson03;
import java.util.Scanner;

/*
Написати програму "PrintMonthInWord" яка друкує "JAN", "FEB" ... "DEC" якщо значення int змінної дорівнює 1, 2, 3 ... 12.
Або повинна вивести "Not a valid month". Розв'язати завдaння 2 способами:
- за допомогою операторів if-else
- за допомогою оператора switch
*/
public class PrintMonthInWord_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть місяць: ");
        int month = scanner.nextInt();

        switch (month){
            case 1: System.out.println("JAN");break;
            case 2: System.out.println("FEB");break;
            case 3: System.out.println("MAR");break;
            case 4: System.out.println("APR");break;
            case 5: System.out.println("MAY");break;
            case 6: System.out.println("JUN");break;
            case 7: System.out.println("JUL");break;
            case 8: System.out.println("AUG");break;
            case 9: System.out.println("SEP");break;
            case 10: System.out.println("OCT");break;
            case 11: System.out.println("NOW");break;
            case 12: System.out.println("DEC");break;
            default:
                System.out.println("Not a valid month!");
        }
    }
}