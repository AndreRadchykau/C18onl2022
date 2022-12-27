package shuttle;


import shuttle.start.IStart;
import shuttle.start.Nasa;
import shuttle.start.RosCosmos;
import shuttle.start.SpaceX;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SpasePort spasePort = new SpasePort();

        IStart rosCosmos = new RosCosmos();
        IStart nasa = new Nasa();
        IStart spaceX = new SpaceX();

        spasePort.start(rosCosmos);
        spasePort.start(nasa);
        spasePort.start(spaceX);
    }
}
