package by.tms.task2;

public class Main {
    public static void main(String[] args) {
        String strTask2 = "Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0";
        System.out.println(strTask2.replace(strTask2.charAt(3), strTask2.charAt(0)));
    }
}
