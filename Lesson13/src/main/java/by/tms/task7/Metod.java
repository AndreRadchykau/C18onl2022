package by.tms.task7;

import lombok.NonNull;

public class Metod {
    public static int getNumberOfLatin(@NonNull String string) {
        int count = 0;
        for (String str : string.split("[\\s \\W]")) {
            if (str.matches("([A-Za-z])+")) {
                count++;
            }
        }
        return count;
    }
}
