import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private String modelCar;
    private int yearCar;
    private int distanceCar;
    private int mile;
    private final Engine engine;
    private GasTank gasTank;
    private boolean startEngine;

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public void carOn() {
        if (!startEngine) {
            engineOn();
            System.out.println("The car stared");
            carGo();
        } else {
            System.out.println("The car don't drive");
        }
    }

    public void carOf() {
        System.out.println("The car stopped");
        engineOff();
        startEngine = false;
        distanceCar += mile;
    }

    private void engineOff() {
        System.out.println("The engine off");
        startEngine = false;
    }

    public void engineOn() {
        if (gasTank.getFuelResidue() > 0) {
            System.out.println("The engine stared");
            startEngine = true;
        }
    }

    public void calculateFuelResidue() {
        int result = gasTank.getFuelResidue() - gasTank.getFuelConsumption();
    }

    public void carGo() {
        System.out.println("The car went");
    }

    public void refueling(int liters) {
        if (gasTank.getFuelResidue() + liters > gasTank.getFuelTank()) {
            System.out.println("The tank is full");
        } else {
            gasTank.setFuelResidue(gasTank.getFuelResidue() + liters);
        }
    }
}
