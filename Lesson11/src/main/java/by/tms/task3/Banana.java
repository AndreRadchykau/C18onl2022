package by.tms.task3;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Banana extends Fruit {

    @Override
    TypeFruit getType() {
        return TypeFruit.BANANA;
    }
}
