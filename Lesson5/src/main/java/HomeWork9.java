public class HomeWork9 {
    //1) Задача на оператор switch!
//        Рандомно генерируется число От 1 до 7.
//        Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
//        Если 6 или 7 – “Выходной”.
    public static void main(String[] args) {
        int week = (int) (Math.random() * (7 - 1) + 1);
        switch (week) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Fridayn");
            case 6, 7 -> System.out.println("day off");
            default -> System.out.println("god of randomness");
        }
    }
}
