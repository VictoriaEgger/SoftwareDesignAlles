package StrategieEnte;

public class Flatterflugverhalten implements Flugverhalten{
    @Override
    public void fliegen() {
        System.out.println("Ente flattert.");
    }
}