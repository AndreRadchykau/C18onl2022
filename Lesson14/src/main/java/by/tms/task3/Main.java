package by.tms.task3;

import java.util.regex.Pattern;

import static by.tms.services.Services.getSubstrings;
import static by.tms.services.Services.print;

public class Main {
    public static void main(String[] args) {
        /**
         * 3) Дана строка "Versions: Java  5, Java 6, Java   7, Java 8, Java 12."  Найти все подстроки "Java X", где X - число и распечатать их.
         */
        Pattern pattern = Pattern.compile("Java\\s+[0-9]+");
        print(getSubstrings("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.", pattern));
    }
}
