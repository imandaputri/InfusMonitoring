public class RollerclampStabilState implements State {
    RollerClamp rollerClamp;

    public RollerclampStabilState(RollerClamp rollerClamp) {
        this.rollerClamp = rollerClamp;
    }

    public void aturRollerclamp() {
        System.out.println("Kamu sudah mengatur rollerclamp");
        rollerClamp.setState(rollerClamp.getSettingRollerclampState());
    }

    public void rusakRollerclamp() {
        System.out.println("Rollerclamp tidak berfungsi");
    }

    public void hitungTetesan() {
        System.out.println("Rollerclamp berfungsi, tapi belum diatur kecepatannya");
    }

    public void habis() {
        System.out.println("Kamu perlu mengganti rollerclamp ke cairan infus yang baru");
    }

    public String toString() {
        return "atur kecepatan keluarnya tetesan cairan didalam infus";
    }
}
