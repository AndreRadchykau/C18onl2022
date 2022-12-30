package by.tms.task1;

public class Trumpet implements IInstrument {
    private final int diameter;


    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба, диаметр трубы = " + diameter);
    }
}
