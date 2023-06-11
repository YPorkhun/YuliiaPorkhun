package ua.hillel.lesson04;

/*
Написати програму, яка друкує таблицю значень sin(x), де х - кожні 10 градусів від 0 до 360
*/
public class TableSinX {
    public static void main(String[] args) {
        int arrayTable [] = new int [360];
        for (int i = 0; i<= arrayTable.length; i++){
            System.out.println(Math.sin(i));
            i = i+9;
        }
    }
}