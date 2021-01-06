public class GantiInfusState implements State {
    RollerClamp rollerClamp;

    public GantiInfusState(RollerClamp rollerClamp) {
        this.rollerClamp = rollerClamp;
        rollerClamp.setState(rollerClamp.getSettingRollerclampState());
    }

    public void aturRollerclamp() {        
        System.out.println("Cairan infus akan jatuh sesuai setting kecepatan rollerclamp");
    }

    public void rusakRollerclamp() {
        System.out.println("Infus belum habis");
    }

    public void hitungTetesan() {
        System.out.println("Tidak dapat mengembalikan cairan yang sudah masuk ke pasien!");
    }

    public void habis() {
        rollerClamp.infusHabis();
        if (rollerClamp.getCount() == 0) {
            rollerClamp.setState(rollerClamp.getTampilanMonitorState());
        }
         else {
            rollerClamp.infusHabis();
            System.out.println("Anda harus mengganti cairan infus pasien!");
            if (rollerClamp.getCount() > 0) {
                rollerClamp.setState(rollerClamp.getRollerclampStabilState());
            } else {
                System.out.println("Infus habis");
                rollerClamp.setState(rollerClamp.getTampilanMonitorState());
            }
        }
    }

    public String toString() {
        return "pergantian infus";
    }
}
