package by.tms.task1;

public class Drum implements IInstrument {
    private final int size;

    public Drum(int size) {
        this.size = size;
    }

    public void play() {
        System.out.println("Играет барабан, размер барабана = " + size);
    }
}
