package ua.hillel.lesson06;

public class Solitaire extends Deck {

    @Override
    public void choosingGame(String game) {
        System.out.println("Ви обрали гру " + game+ ". Давайте зіграємо!");
    }

    @Override
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

    public static void main(String[] args) {
        Solitaire solitaire = new Solitaire();
        solitaire.choosingGame("Solitaire");
        solitaire.createDeck();
    }
}
