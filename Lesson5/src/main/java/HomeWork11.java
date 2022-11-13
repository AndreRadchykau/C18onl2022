import java.util.Scanner;

public class HomeWork11 {
//      3)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        int length = 0;
        int count = a;
        while (count != 0) {
            count = count / 10;
            length++;
        }
        if (a > 0) {
            System.out.println(a + " - это положительное число, " + "количество цифр = " + length);
        } else if (a < 0) {
            System.out.println(a + " - это отрицательное, " + "количество цифр = " + length);
        } else {
            System.out.println(a + " - null exception");
        }
    }
}
