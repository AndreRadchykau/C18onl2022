package by.tms.task4;

public class Main {
    public static void main(String[] args) {
        String text = "Пьяный Гарри забыл как себя зовут.Топот крыс.Сообщение в консоль. " +
                "Циферки 1 + 2 + 3 + 444 + 55555." +
                "Дамболдор старый дед";

        TextFormatter textFormatter = new TextFormatter();
        textFormatter.printSentences(text);

    }
}
