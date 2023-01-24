package task3;

/**
 * 3) Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
 * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
 * Написать метод принимающий MinMax объект и печатающий информацию об элементах.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 66,};
        Double[] doubles = new Double[]{-20.0, 20.1, 120.6};
        MinMax<Integer> integerMinMax = new MinMax<>(integers);
        System.out.println(integerMinMax.getMaxManElementInfo());
        MinMax<Double> doubleMinMax = new MinMax<>(doubles);
        System.out.println(doubleMinMax.getMaxManElementInfo());
    }
}
