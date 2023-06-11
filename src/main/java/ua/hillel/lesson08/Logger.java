package ua.hillel.lesson08;
/*
Написати свій клас Logger, який потім можна використовувати в різних місцях нашиї програм.
Логер має підтримувати різні рівні логування (info, debug, warn, error).
Можна створити Enum для різних рівнів, щоб передевати його як параметр, або ж використовувати в конкретних методах під кожний рівень.
Як міняти колір тексту в консолі:
https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
*/
public class Logger {
    public final String message = "Logger level is: ";
    public static final String ANSI_RED = "\u001B[32m";
    public static final String ANSI_GREEN = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[34m";
    public static final String ANSI_BLUE = "\u001B[33m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void setLoggerLevel(LoggerLevel level) {
        switch (level) {
            case INFO: System.out.println(message + level + ANSI_GREEN);break;
            case DEBUG: System.out.println(message + level + ANSI_BLUE);break;
            case WARN: System.out.println(message + level + ANSI_YELLOW);break;
            case ERROR: System.out.println(message + level + ANSI_RED);break;
            default:
                System.out.println(message + level + ANSI_WHITE);
        }
    }
    public static void main(String[] args) {
        Logger logger1 = new Logger();
        logger1.setLoggerLevel(LoggerLevel.INFO);
        logger1.setLoggerLevel(LoggerLevel.DEBUG);
        logger1.setLoggerLevel(LoggerLevel.WARN);
        logger1.setLoggerLevel(LoggerLevel.ERROR);

    }

}

