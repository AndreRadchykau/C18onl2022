public class Zodiac {
    //4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
    public String getZodiacName(int month, int day) {
        return switch (month) {
            case 1 -> checkDay(day, 21, 31) ? "Водолей" : checkDay(day, 1, 20) ? "Козерог" : null;
            case 2 -> checkDay(day, 1, 19) ? "Водолей" : checkDay(day, 20, 29) ? "Рыбы" : null;
            case 3 -> checkDay(day, 1, 20) ? "Рыбы" : checkDay(day, 21, 31) ? "Овен" : null;
            case 4 -> checkDay(day, 1, 20) ? "Овен" : checkDay(day, 21, 30) ? "Телец" : null;
            case 5 -> checkDay(day, 1, 21) ? "Телец" : checkDay(day, 22, 31) ? "Близнецы" : null;
            case 6 -> checkDay(day, 1, 21) ? "Близнецы" : checkDay(day, 22, 30) ? "Рак" : null;
            case 7 -> checkDay(day, 1, 22) ? "Рак" : checkDay(day, 23, 31) ? "Лев" : null;
            case 8 -> checkDay(day, 1, 21) ? "Лев" : checkDay(day, 22, 31) ? "Дева" : null;
            case 9 -> checkDay(day, 1, 23) ? "Дева" : checkDay(day, 24, 30) ? "Весы" : null;
            case 10 -> checkDay(day, 1, 23) ? "Весы" : checkDay(day, 24, 31) ? "Скорпион" : null;
            case 11 -> checkDay(day, 1, 23) ? "Скорпион" : checkDay(day, 23, 30) ? "Стрелец" : null;
            case 12 -> checkDay(day, 1, 22) ? "Стрелец" : checkDay(day, 23, 31) ? "Козерог" : null;
            default -> null;
        };
    }

    static boolean checkDay(int day, int from, int to) {
        return day >= from && day <= to;
    }
}



