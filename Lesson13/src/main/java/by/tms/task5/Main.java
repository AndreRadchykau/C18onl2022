package by.tms.task5;

public class Main {
    public static void main(String[] args) {
        String str = "String";
        String str2 = "Practice";
        System.out.println(getMiddleChars(str));
        System.out.println(getMiddleChars(str2));
    }

    public static String getMiddleChars(String string) {
        return string.substring(string.length() / 2 - 1, string.length() / 2 + 1);
    }
}

