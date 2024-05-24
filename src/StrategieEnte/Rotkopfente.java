package StrategieEnte;

public class Rotkopfente extends Ente{


    public Rotkopfente(String name) {
        super(name, new Segelflugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("Schau dir meinen roten Kopf an!");
    }

}