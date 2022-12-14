import java.util.Arrays;
import java.util.Random;
public class HomeWorks8 {
    //        8) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    public static void main(String[] args) {
        int[] array = new int[12];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 16);
        }
        System.out.println(Arrays.toString(array));
        int elementMax = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > elementMax) {
                elementMax = array[i];
                index = i;
            }
        }
        System.out.printf("Максимальный элемент - " + elementMax + ", индекс его последнего вхождения в массив = " + index);
    }
}
