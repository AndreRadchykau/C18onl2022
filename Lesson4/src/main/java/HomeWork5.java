import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (scanner.hasNext()) {
            int a = scanner.nextInt();
            if (a % 2 == 0) {
                System.out.println("Число" + " " + a + " " + "четное");
            } else {
                System.out.println("Вы ввели не четное целое число");
            }
        }
    }
}
