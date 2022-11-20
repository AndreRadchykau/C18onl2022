import java.util.Random;

public class HomeWork13 {
    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void main(String[] args) {
        calculateSumOfDiagonalElements();
    }

    private static void calculateSumOfDiagonalElements() {
        int[][] mass = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = random.nextInt(100);
            }
        }
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            result += mass[i][i];
        }
        System.out.println(result);
    }
}


