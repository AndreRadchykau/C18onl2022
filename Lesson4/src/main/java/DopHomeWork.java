import java.util.Random;
import java.util.Scanner;

public class DopHomeWork {
    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        countDevs(1);
        countDevs(2);
        countDevs(11);
        countDevs(13);
        countDevs(50);
        countDevs(98);
        countDevs(239);
        countDevs(345);
        countDevs(444);
        countDevs(686);
        countDevs(777);
        foobar(6);
        foobar(10);
        foobar(15);
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * сделать проверку что если пользователь ввел не положительное число,
     * то вывести ошибку и отправить пользователя вводить заново новое число!
     * далее создать одномерный массив типа int размера прочитанного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */
    private static void printArray() {
        Scanner scanner = new Scanner(System.in);
        int countOne;
        do {
            System.out.println("Введите положительное число");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка, введите число заново");
                scanner.next();
            }
            countOne = scanner.nextInt();
        } while (countOne < 0);
        int[] array = new int[countOne];
        Random random = new Random();
        for (int a = 0; a < array.length; a++) {
            array[a] = random.nextInt();
        }
        return array;
    }


    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int[] calculateCountOfOddElementsInMatrix(int[] ints) {
        int count = 0;
        for (int x : ints) {
            if (x % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        int c10 = count % 10;
        int c100 = count % 100;
        if (c10 == 0 || c10 >= 5 || c100 == 11 || c100 == 12 || c100 == 13 || c100 == 14) {
            System.out.println(count + " программистов");
        } else if (c10 >= 2 && c10 <= 4) {
            System.out.println(count + " программиста");
        } else {
            System.out.println(count + " программист");
        }

    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        } else if (number % 5 == 0) {
            System.out.println("bar");
        } else if (number % 3 == 0) {
            System.out.println("foo");
        }
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */
    public static void printPrimeNumbers() {
        int i, j;

        for (i = 2; i < 1000; i++) {
            int k = 0;

            for (j = 2; j <= i; j++) {
                if ((i % j) == 0) {
                    k++;
                }
            }
            if (k < 2) {
                System.out.println(i + " - простое число.");
            }
        }
    }
}
