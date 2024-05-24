package ObserverMedienverlag;

public interface AbonnentIn {
    //wenn der Medienverlag mir einen neuen Artikel schickt
    public void erhalte(Artikel artikel);
    public String getName();
}