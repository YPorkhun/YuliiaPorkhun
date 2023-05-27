package ua.hillel.lesson10;

import java.util.Scanner;

public class Poker {

    public static void main(String[] args) throws PokerException {
        Poker poker = new Poker();
        poker.choosingGame("Poker", 1);
        poker.createDeck();

    }

    public void choosingGame(String game, int players) throws PokerException {
        System.out.println("Ви обрали гру " + game + ". А ви вмієте грати?!");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("Так")) {
            System.out.println("Тоді давайте зіграємо!");
        } else {
            System.out.println("Думаю, ця гра не для вас...");
        }
        System.out.println("Скільки буде гравців?");
        Scanner scanner2 = new Scanner(System.in);
        int playersAmount = scanner2.nextInt();
        if (playersAmount <= 0) {
            throw new PokerException("Error: недопустима кількість гравців!");
        } else {
            System.out.println("Супер! Починаємо гру!");
        }
    }

    public void createDeck() {
        int NUMBER_OF_CARDS = 52;
        int NUM_OF_PLAYERS = 4;
        String[] deck = new String[NUMBER_OF_CARDS];
        String[] suites = {"Hearts", "Clubs", "Diamonds", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int index = 0;
        for (String suit : suites) {
            for (String value : values) {
                deck[index++] = value + " of " + suit;
            }
        }
    }
}
