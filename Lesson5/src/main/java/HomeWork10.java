import java.util.Arrays;

public class HomeWork10 {
    //  10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void main(String[] args) {
        int[] numbers = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};

        int currentMax = numbers[0];
        int maxPlace = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > currentMax) {
                currentMax = numbers[i];
                maxPlace = i;

            }
        }
        numbers[maxPlace] = numbers[0];
        numbers[0] = currentMax;
        System.out.println(Arrays.toString(numbers));
    }
}
