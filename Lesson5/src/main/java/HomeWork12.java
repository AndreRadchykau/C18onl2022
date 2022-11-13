public class HomeWork12 {
    //        5) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static void main(String[] args) {
        int a = 54;
        int b = 5;
        int summ = 0;
        for (int i = 1; i <= b; i++) {
            summ += a;
        }
        System.out.println(summ);
    }
}
