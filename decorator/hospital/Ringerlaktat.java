public class Ringerlaktat extends CondimentDecorator {
    Infus infus;

    public Ringerlaktat(Infus infus) {
        this.infus = infus;
    }

    public String getDescription() {
        return infus.getDescription() + ", Ringerlaktat";
    }

    public int jumlah() {
        return 1 + infus.jumlah();
    }
}
