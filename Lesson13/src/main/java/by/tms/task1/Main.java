package by.tms.task1;

public class Main {
    public static void main(String[] args) {
        String strTask1 = "Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения символа(B).";
        System.out.println(strTask1.substring(strTask1.indexOf("А"), strTask1.lastIndexOf("B")));
    }
}
