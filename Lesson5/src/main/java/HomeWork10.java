import java.util.Arrays;

public class HomeWork10 {
    //  10) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void main(String[] args) {
        int[] array = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        System.out.println(Arrays.toString(array));
        int maxCount = array[0];
        int indexCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxCount) {
                maxCount = array[i];
                indexCount = i;
            }
        }
        int temp = array[indexCount];
        array[indexCount] = array[0];
        array[0] = temp;
        System.out.println(Arrays.toString(array));
    }
}
