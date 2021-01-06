public class HitungTetesanState implements State {

    RollerClamp rollerClamp;

    public HitungTetesanState(RollerClamp rollerClamp) {
        this.rollerClamp = rollerClamp;
    }

    public void aturRollerclamp() {
        System.out.println("Cairan infus akan jatuh pertetesnya sesuai yang diatur");
    }

    public void rusakRollerclamp() {
        System.out.println("Infus tidak dapat mengeluarkan tetesan");
    }

    public void hitungTetesan() {        
        System.out.println("Tidak dapat mengembalikan cairan yang sudah masuk ke pasien");
    }

    public void habis() {
        rollerClamp.infusHabis();
        if (rollerClamp.getCount() > 0) {
            rollerClamp.setState(rollerClamp.getSettingRollerclampState());
            rollerClamp.hitungTetesan();
        } else {
            System.out.println("Infus akan habis!");
            rollerClamp.setState(rollerClamp.getTampilanMonitorState());
        }
    }

    public String toString() {
        return "segera ganti cairan infus";
    }
}
