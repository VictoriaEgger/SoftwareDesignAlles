package StrategieEnte;

public class Segelflugverhalten implements Flugverhalten{
    @Override
    public void fliegen() {
        System.out.println("Ente segelt");
    }
}