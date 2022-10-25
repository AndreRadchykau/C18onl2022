import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int count = 0; // count - переманная счетчик.
        Scanner scanner = new Scanner(System.in);// Объявили сканнер для ввода данных (чисел)
        int n = scanner.nextInt(); // n - количество чисел которые хочет ввести пользователь
                                  // Метод nextInt() считывает и возвращает введенное число
        for (int i = 0; i < n; i++) { //for(<начальная точка>; <условие выхода>; <операторы счетчика "++"увеличили переменную на 1>)
            int number = scanner.nextInt();//number - это проверяймое число
            if (number >= 0) { //Если number больше или = 0 то увеличиваем переменную счетчика на один
                count++;
            }
        }
        System.out.println("Количсевто положительных чисел = " + count);
    }
}
