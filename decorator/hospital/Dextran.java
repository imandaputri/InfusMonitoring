public class Dextran extends CondimentDecorator{

    Infus infus;

    public Dextran(Infus infus) {
        this.infus = infus;
    }

    public String getDescription() {
        return infus.getDescription() + ", Dextran";
    }

    public int jumlah() {
        return 1 + infus.jumlah();
    }
}
