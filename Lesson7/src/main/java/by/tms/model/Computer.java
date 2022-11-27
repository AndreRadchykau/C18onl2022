package by.tms.model;

import lombok.NoArgsConstructor;

import java.util.Random;
import java.util.Scanner;

@NoArgsConstructor

public class Computer {

    private String cpu;
    private String ram;
    private String ssd;
    private int resource;
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private boolean burned;

    public boolean theBurned() {
        return burned;
    }

    public Computer(String cpu, String ram, String ssd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.resource = resource;
    }

    public Computer(int resource) {
        this.resource = resource;
    }

    public void on() {
        if (!burned) {
            int inputNumber = inputNumber();
            int count = random.nextInt(2);
            if (inputNumber == count) {
                off();
            } else {
                burned();
            }
        } else {
            burned();
        }
    }

    private void burned() {
        System.out.println("Компьютер сгорел!");
        burned = true;
    }

    private int inputNumber() {
        System.out.println("Введите 0 или 1");
        int number = 0;
        do {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Ошибка!");
                scanner.next();
            }
        } while (number < 0 || number > 1);
        return number;
    }

    public void off() {
        if (!burned && resource != 0) {
            System.out.println("Выключение");
        } else {
            System.out.println("Компьютер сгорел!");
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                ", resource=" + resource +
                '}';
    }
}