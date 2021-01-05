public class Gelatin extends CondimentDecorator {

    Infus infus;

    public Gelatin(Infus infus) {
        this.infus = infus;
    }

    public String getDescription() {
        return infus.getDescription() + ", Gelatin";
    }

    public int jumlah() {
        return 3 + infus.jumlah();
    }
}
