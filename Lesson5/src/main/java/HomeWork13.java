import java.util.Scanner;

public class HomeWork13 {
    //4) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 19 ? "Capricorn" : "Aquarius");
                } else {
                    System.out.println("Error, please enter another day...");
                }
            }
            case 2 -> {
                if (day >= 1 && day <= 28) {
                    System.out.println(day <= 18 ? "Aquarius" : "Pisces");
                } else {
                    System.out.println("Error, please enter another day...");
                }
            }
            case 3 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 20 ? "Pisces" : "Aries");
                } else {
                    System.out.println("Error, please enter another day...");
                }
            }
            case 4 -> {
                if (day >= 1 && day <= 30) {
                    System.out.println(day <= 19 ? "Aries" : "Taurus");
                } else {
                    System.out.println("Error, please enter another day...");
                }
            }
            case 5 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 20 ? "Taurus" : "Gemini");
                } else {
                    System.out.println("Error, please enter another day...");
                }
            }
            case 6 -> {
                if (day >= 1 && day <= 30) {
                    System.out.println(day <= 20 ? "Gemini" : "Cancer");
                } else {
                    System.out.println("Error, please enter another day...");
                }
            }
            case 7 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 22 ? "Cancer" : "Leo");
                } else {
                    System.out.println("Error, please enter another day...");
                }
            }
            case 8 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 22 ? "Leo" : "Virgo");
                } else {
                    System.out.println("Error, please enter another day...");
                }
            }
            case 9 -> {
                if (day >= 1 && day <= 30) {
                    System.out.println(day <= 22 ? "Virgo" : "Libra");
                } else {
                    System.out.println("Error, please enter another day...");
                }
            }
            case 10 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 22 ? "Libra" : "Scorpio");
                } else {
                    System.out.println("Error, please enter another day...");
                }
            }
            case 11 -> {
                if (day >= 1 && day <= 30) {
                    System.out.println(day <= 21 ? "Scorpio" : "Sagittarius");
                } else {
                    System.out.println("Error, please enter another day...");
                }
            }
            case 12 -> {
                if (day >= 1 && day <= 31) {
                    System.out.println(day <= 21 ? "Sagittarius" : "Capricorn");
                } else {
                    System.out.println("Error, please enter another day...");
                }
            }
            default -> System.out.println("Error, please enter another month...");
        }
    }
}

