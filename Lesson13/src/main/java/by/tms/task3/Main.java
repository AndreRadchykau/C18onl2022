package by.tms.task3;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Казак");
        strings.add("Дед");
        strings.add("Заказ");
        strings.add("Поселок");
        System.out.println(showPalindromes(strings));
    }

    public static List<String> showPalindromes(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String stringPalindrome : strings) {
            if (stringPalindrome.equalsIgnoreCase(StringUtils.reverse(stringPalindrome))) {
                result.add(stringPalindrome);
            }
        }
        return result;
    }
}
