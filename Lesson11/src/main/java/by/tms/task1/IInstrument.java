package by.tms.task1;

public interface IInstrument {
    enum Type {
        GUITAR, DRUM, TRUMPET
    }

    String KEY = "До мажор"; //в интерфейсах можно объявлять статические переменные

    void play();
}
