package by.tms.task4;

import lombok.Builder;

@Builder
public class Triangle extends Figure implements IFigure {
    private double height;
    private double base;

    @Override
    public double getSquare() {
        return height * base / 2;
    }

    @Override
    public Type getType() {
        return Type.TRIANGLE;
    }
}
