package DecoratorKaffeehaus;

public abstract class ZutatDecorator extends Getraenk {
    protected Getraenk getraenk;
    public abstract String getBeschreibung();

    public ZutatDecorator(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    @Override
    public double kostet() {
        return 0;
    }
}