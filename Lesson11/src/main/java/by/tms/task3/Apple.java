package by.tms.task3;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Apple extends Fruit {

    @Override
    TypeFruit getType() {
        return TypeFruit.APPLE;
    }
}
