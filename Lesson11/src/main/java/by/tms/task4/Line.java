package by.tms.task4;

import lombok.Builder;

import static by.tms.task4.Type.LINE;

@Builder
public class Line extends Figure {

    private double length;

    @Override
    Type getType() {
        return LINE;
    }
}
