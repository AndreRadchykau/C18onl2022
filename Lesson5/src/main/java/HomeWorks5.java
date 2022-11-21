public class HomeWorks5 {
    //        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static void main(String[] args) {
        int sum = sum(3, 4);
        System.out.println(sum(3, 5));
        System.out.println(sum(-3, 5));
        System.out.println(sum(3, -5));
        System.out.println(sum(-3, -5));
        System.out.println(sum(0, -5));
        System.out.println(sum(-5, 0));
        System.out.println(sum(1, 10000));
    }

    private static int sum(int a, int b) {
        int result = 0;
        int minValue = Math.min(Math.abs(a), Math.abs(b));
        int maxValue = Math.max(Math.abs(a), Math.abs(b));

        for (int i = 0; i < minValue; i++) {
            result += maxValue;
        }
        if (a < 0 && b > 0 || b < 0 && a > 0) {//a < 0 ^ b > 0
            return -result;
        }
        return result;
    }
}
