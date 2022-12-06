public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine("Diesel"), new GasTank(45));
        car.carOn();
        car.carOf();
        car.calculateFuelResidue();
        car.refueling(15);
    }
}