public class Hospital {

    public static void main(String[] args) {

        Infus ruangoperasi = new ruangOperasi();
        ruangoperasi = new Dextran(ruangoperasi); //wrapper
        ruangoperasi = new Gelatin(ruangoperasi);
        ruangoperasi = new Albumin(ruangoperasi);

        System.out.println(ruangoperasi.getDescription() +
            " total botol " + ruangoperasi.jumlah());    
        
        Infus ruangopname = new ruangOpname();
        ruangopname = new Dextran(ruangopname); //wrapper
        ruangopname = new Saline(ruangopname);

        System.out.println(ruangopname.getDescription() +
            " total botol " + ruangopname.jumlah());

        Infus ruangigd = new ruangIGD();
        ruangigd = new Dextran(ruangigd); //wrapper
        ruangigd = new Ringerlaktat(ruangigd);
        ruangigd = new Albumin(ruangigd);
    
        System.out.println(ruangigd.getDescription() +
            " total botol " + ruangigd.jumlah());

        Infus ruangicu = new ruangICU();
        ruangicu = new Gelatin(ruangicu); //wrapper
        ruangicu = new Albumin(ruangicu);
        
        System.out.println(ruangicu.getDescription() +
            " total botol " + ruangicu.jumlah());
    }
}
