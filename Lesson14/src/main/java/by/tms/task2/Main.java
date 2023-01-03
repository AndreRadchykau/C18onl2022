package by.tms.task2;

import java.util.regex.Pattern;

import static by.tms.services.Services.getSubstrings;
import static by.tms.services.Services.print;

public class Main {
    public static void main(String[] args) {
        /**
         * 2) Дана строка "cab, ccab, cccab" Необходимо составить регулярное выражение, сделать класс Pattern, Matcher, вызвать метод find и вывести слова на консоль
         * Должно вывести:
         * cab
         * ccab
         * cccab
         */
        Pattern pattern = Pattern.compile("c+ab");
        print(getSubstrings("cab, ccab, cccab", pattern));
    }
}

