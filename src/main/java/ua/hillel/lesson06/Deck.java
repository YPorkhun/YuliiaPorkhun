package ua.hillel.lesson06;
/*
Написати новий клас (чи класи), які можна використати для задачі з покером, яку розглянули на попередньому занятті.
Інтегрувати ці класи і переписати програму з ними.
Результат виконання завдання - посилання на пулл-реквест в репозиторії на GitHub
*/

public abstract class Deck {
    public abstract void choosingGame(String game);
    public abstract void createDeck();
}
