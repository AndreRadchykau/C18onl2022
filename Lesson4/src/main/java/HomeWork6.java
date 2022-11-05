import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int d = 0;
        System.out.print("Введите первое число: ");
        a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        d = scanner.nextInt();
        if (a <= b && a <= d) {
            count = a;
        } else if (b <= d && b <= a) {
            count = b;
        } else {
            count = d;
        }
        System.out.println("Наименьшее число = " + count);
    }
}
