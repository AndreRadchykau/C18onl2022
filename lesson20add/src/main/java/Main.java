public class Main {
    public static void main(String[] args) {

        CashDesk[] cashDesk = {new CashDesk("кассе №1"), new CashDesk("кассе №2"),
                new CashDesk("кассе №3"), new CashDesk("кассе №4"), new CashDesk("кассе №5")};

        String[] goods = {"Хлеб", "молоко", "сосиски", "творог", "сметана", "чипсики", "батон", "яйца", "кефир"};
        for (int i = 1; i <= 25; i++) {
            new Buyer("№" + i, cashDesk, goods);
        }

    }
}
