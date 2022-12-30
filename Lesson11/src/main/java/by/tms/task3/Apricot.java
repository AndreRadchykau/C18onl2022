package by.tms.task3;

import lombok.experimental.SuperBuilder;

import static by.tms.task3.TypeFruit.APRICOT;


@SuperBuilder
public class Apricot extends Fruit {

    @Override
    TypeFruit getType() {
        return APRICOT;
    }
}
