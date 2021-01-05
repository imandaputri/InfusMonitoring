 public class Main {
    public static void main(String[] args) {
        Infus ruangan = new Infus();
        new Monitor(ruangan);
      
        ruangan.setDatapasien("ICU");
    }
}
