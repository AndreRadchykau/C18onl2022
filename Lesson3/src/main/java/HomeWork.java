public class HomeWork {
    public static void main(String[] args) {
        //Некоторые тесты для проверки задач.
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(average(new int[]{0, -2, 3, -1, 5}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(calculateHypotenuse(3, 4));
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        long result = (long) a + b;
        if (result > Integer.MAX_VALUE) {
            return -1;
        } else {
            return (int) result;
        }
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    /**
     * Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     */
    public static double average(int[] array) {
        int sum = 0;
        for (int a : array) {
            sum = sum + a;
        }
        return (double) sum / array.length;
    }

    /**
     * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * <p>
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a, int b) {
        double c = Math.sqrt(a * a + b * b);
        return c;
    }
}