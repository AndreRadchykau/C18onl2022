import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день рождения:");
        int day = scanner.nextInt();
        System.out.print("Введите месяц рождения:");
        int month = scanner.nextInt();
        Zodiac zodiac = new Zodiac();
        String name = zodiac.getZodiacName(month, day);
        if (name != null) {
            System.out.println("Знак зодиака - " + name);
        } else {
            System.out.println("Не корректные данные");
        }
    }
}