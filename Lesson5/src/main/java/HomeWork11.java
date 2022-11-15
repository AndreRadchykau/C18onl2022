import java.util.Scanner;
public class HomeWork11 {
    //    11) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер последовательностей:");
        int j = scanner.nextInt();
        int a[] = new int[j];
        int b[] = new int[j];
        System.out.println("Введите первую числовую последовательность:");
        for (int i = 0; i < j; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Введите вторую числовую последовательность");
        for (int k = 0; k < j; k++) {
            b[k] = scanner.nextInt();
        }
        int different = 0;
        for (int i = 0; i < j; i++) {
            if (a[i] == b[i]) {
                System.out.println("Одинаковые элементы: " + " " + a[i] + "-" + b[i]);
                different++;
            }
        }
    }
}

