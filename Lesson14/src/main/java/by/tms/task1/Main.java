package by.tms.task1;

import java.util.Arrays;

import static by.tms.services.Services.getMiddleSigns;

public class Main {
    public static void main(String[] args) {
        /**
         * 1) Даны строки разной длины c четным числом символов(казаки, просмотреть и так далее),
         * необходимо вернуть ее два средних знака.
         * Например, если дана строка "string"  результат будет "ri", для строки "code" результат "od",  для "Practice" результат "ct".
         */
        System.out.println(Arrays.toString(getMiddleSigns("эндшпиль", "казаки", "король", "жаба")));

    }
}

