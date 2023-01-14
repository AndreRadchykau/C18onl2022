package by.tms.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Services {
    public static String[] getMiddleSigns(String... str) {
        String[] result = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            result[i] = str[i].substring(str[i].length() / 2 - 1, str[i].length() / 2 + 1);
        }
        return result;
    }

    public static String[] getSubstrings(String string, Pattern pattern) {
        String[] words = string.split(",");
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            Matcher matcher = pattern.matcher(words[i]);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                result[i] = words[i].substring(start, end);
            }
        }
        return result;
    }

    public static void print(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static boolean validate(String str) {
        return str.matches("[a-z15]{4,20}");
    }
}
