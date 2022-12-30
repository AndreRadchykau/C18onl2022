package by.tms.task1;

public class Main {
    public static void main(String[] args) {
        {
            Car car = new Car();
            car.setBrand("Audi");
            try {
                car.start();
            } catch (CustomCarException exception) {
                System.out.println(exception.getMessage());
            }
        }
        {
            Car car = new Car();
            car.setBrand("BMW");
            try {
                car.start();
            } catch (CustomCarException exception) {
                System.out.println(exception.getMessage());
            }
        }
        {
            Car car = new Car();

            car.setBrand("Mercedes");
            try {
                car.start();
            } catch (CustomCarException exception) {
                System.out.println(exception.getMessage());
            }
        }
        {
            Car car = new Car();
            car.setBrand("Volkswagen");
            try {
                car.start();
            } catch (CustomCarException exception) {
                System.out.println(exception.getMessage());
            }
        }


    }

}

