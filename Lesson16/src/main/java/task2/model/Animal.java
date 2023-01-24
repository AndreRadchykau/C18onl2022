package task2.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@ToString
public class Animal implements IsAnimal, Serializable {
    private String name;
    private int age;

    @Override
    public void go() {
        System.out.println("Коллопортус");

    }
}
