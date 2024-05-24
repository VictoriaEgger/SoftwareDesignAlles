package StrategieMitarbeiter;

public class GewinnProvisionsstrategie implements Provisionsstrategie {

    @Override
    public double berechnen(Mitarbeiterin m) {
      return m.getGewinn()*0.1;
    }
}