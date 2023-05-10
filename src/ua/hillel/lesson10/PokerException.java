package ua.hillel.lesson10;

public class PokerException extends Exception{
    public PokerException() {
    }

    public PokerException(String message) {
        super(message);
    }

    public PokerException(String message, Throwable cause) {
        super(message, cause);
    }

    public PokerException(Throwable cause) {
        super(cause);
    }

    public PokerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
