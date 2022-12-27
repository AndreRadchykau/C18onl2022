package by.tms.task4;

import lombok.Builder;

@Builder
public class Rectangle extends Figure implements IFigure {

    private double firstSide;
    private double secondSide;

    @Override
    public double getSquare() {
        return firstSide * secondSide;
    }

    @Override
    public Type getType() {
        return Type.RECTANGLE;
    }

}
