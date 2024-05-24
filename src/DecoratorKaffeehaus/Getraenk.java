package DecoratorKaffeehaus;

public abstract class Getraenk {
    protected String beschreibung = "unbekanntes Getraenk";
    //nur abgeleiteten Klassen können zugreifen - protected

    public String getBeschreibung() {
        return beschreibung;
    }


    public abstract double kostet();
}