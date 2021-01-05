public class Saline extends CondimentDecorator {
    Infus infus;

    public Saline(Infus infus) {
        this.infus = infus;
    }

    public String getDescription() {
        return infus.getDescription() + ", Saline";
    }

    public int jumlah() {
        return 3 + infus.jumlah();
    }
}
