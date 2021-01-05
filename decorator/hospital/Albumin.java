public class Albumin extends CondimentDecorator {

    Infus infus;

    public Albumin(Infus infus) {
        this.infus = infus;
    }

    public String getDescription() {
        return infus.getDescription() + ", Albumin";
    }

    public int jumlah() {
        return 2 + infus.jumlah();
    }
}
