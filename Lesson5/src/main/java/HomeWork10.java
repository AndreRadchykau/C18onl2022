public class HomeWork10 {
    //2) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//         сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    public static void main(String[] args) {
        int ameba = 1;
        for (int i = 3; i <= 24; i += 3) {
            ameba *= 2;
            System.out.println("Сompiled " + ameba + " ameb " + i + " hours");
        }
    }
}