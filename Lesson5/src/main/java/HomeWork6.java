public class HomeWork6 {
    //  6) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
//
//                 a)                  b)
//                       *        *
//                     * *        * *
//                   * * *        * * *
//                 * * * *        * * * *
//
//                 c)                  d)
//                 * * * *        * * * *
//                   * * *        * * *
//                     * *        * *
//                       *        *
//
    public static void main(String[] args) {
        arrayA();
        arrayB();
        arrayC();
        arrayD();
    }

    private static void arrayA() {
        char[][] array = new char[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 2 * (array.length - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void arrayB() {
        char[][] array = new char[4][];
        for (int i = 0; i <= array.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void arrayC() {
        char[][] array = new char[4][4];
        for (int i = array.length; i >= 0; i--) {
            for (int j = 2 * (array.length - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void arrayD() {
        char[][] array = new char[4][];
        for (int i = array.length; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
    }
}