import java.util.Random;

public class HomeWork7 {
    public static void main(String[] args) {
        Random what = new Random();
        int n = what.nextInt(28801);
        System.out.println("Для петрова: " + n);
        System.out.println("Для сотрудниц: " + (n / 3600));
    }
}