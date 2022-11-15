import java.util.Scanner;
//        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
public class HomeWork_5 {
    private static long calculate(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        boolean negative = false;
        if (a < 0) {
            negative = true;
            a = -a;
        }
        if (b < 0) {
            negative = !negative;
            b = -b;
        }
        int result = 0;
        for (int i = 1; i <= a; ++i) {
            result += b;
        }
        return negative ? -result : result;
    }
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        final long a = scanner.nextInt();
        System.out.println("Введите второе число : ");
        final long b = scanner.nextInt();
        System.out.println("Ответ : " + calculate(a, b));
    }
}