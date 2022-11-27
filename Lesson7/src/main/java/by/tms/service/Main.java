package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("5600X", "16 gb", "SSD 1000 GB", 10);
        System.out.println(computer);
        for (int i = 0; i < 10; i++) {
            computer.on();
            computer.off();
            if (computer.theBurned()) {
                break;
            }
        }

    }
}