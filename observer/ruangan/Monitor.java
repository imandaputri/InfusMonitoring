public class Monitor  implements Observer, DisplayElement {
    private String datapasien;
    private Subject ruangan;
    private boolean lampu = false;

    public Monitor(Subject ruangan) {
        this.ruangan = ruangan;
        ruangan.addObserver(this);
    }

    public void update(String datapasien) {
        this.datapasien = datapasien;
        display(datapasien);
    }

    public void display(String datapasien) {
        Database db = Database.getInstance();
        String data[][] = db.getData();
        for (int i = 0; i < data.length; i++) {
            if(datapasien == data[i][0] ){
                System.out.println("==============");
                System.out.println("Ruangan : "+ data[i][0]);
                System.out.println("Nama Pasien : " + data[i][1]);
                System.out.println("Umur : "+ data[i][2]);
                System.out.println("Jenis Cairan Infus : " + data[i][3]);
                System.out.println("Sisa Cairan Infus : " + data[i][4]);
                System.out.println("Warna Lampu : "+ data[i][5]);
                System.out.println("==============");
                lampu = true;
            }

            if(lampu == false && i == data.length-1){
                System.out.println("==============");
                System.out.println("Ruangan : "+datapasien);
                System.out.println("Tidak ada pasien");
                System.out.println("==============");
            }
        }
    }
}