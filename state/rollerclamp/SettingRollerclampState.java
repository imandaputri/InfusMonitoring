import java.util.Random;

public class SettingRollerclampState implements State {
    Random randomGantiInfus = new Random(System.currentTimeMillis());
    RollerClamp rollerClamp;

    public SettingRollerclampState(RollerClamp rollerClamp) {
        this.rollerClamp = rollerClamp;
    }

    public void aturRollerclamp() {
        System.out.println("Kamu belum mengatur rollerclampnya");
    }

    public void rusakRollerclamp() {
        System.out.println("Rollerclamp tidak berfungsi");
        rollerClamp.setState(rollerClamp.getRollerclampStabilState());
    }

    public void hitungTetesan() {
        System.out.println("Cairan dihitung setiap tetesan jatuh");
        int gantiinfus = randomGantiInfus.nextInt(100);
        if ((gantiinfus == 0) && (rollerClamp.getCount() > 1)) {
            rollerClamp.setState(rollerClamp.getGantiInfusState());
        } else {
            rollerClamp.setState(rollerClamp.getHitungTetesanState());
        }

    }

    public void habis() {
        System.out.println("Tidak ada cairan yang dihitung");
    }

    public String toString() {
        return "rollerclamp sudah diatur";
    }
}
