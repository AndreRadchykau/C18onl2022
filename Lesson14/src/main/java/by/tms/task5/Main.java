package by.tms.task5;

import static by.tms.services.Services.validate;

public class Main {
    public static void main(String[] args) {
        /**
         * *5*)со звездочкой! В метод на вход приходит строка
         * public static boolean validate(String str) {
         *      return false;
         * }
         * Необходимо выполнить проверку на валидацию входящей строки и вернуть false или true
         * - Строка должна содержать только маленькие латинские буквы и цифры 1 или 5 без знака подчеркивания.
         * - Длина строки должна быть от 4 до 20 символов.
         * PS: нужно посмотреть презентацию страница 44 (Метасимволы для группировки символов)
         */
        System.out.println(validate("q1555"));
        System.out.println(validate("15155151fv"));
    }
}
