package by.tms.task4;

import lombok.Builder;

@Builder
public class Circle extends Figure implements IFigure {
    private double radius;

    @Override
    public double getSquare() {
        return 3.14 * Math.pow(radius, 2);
    }

    @Override
    public Type getType() {
        return Type.CIRCLE;
    }
}
