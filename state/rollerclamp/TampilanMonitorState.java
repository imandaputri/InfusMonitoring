public class TampilanMonitorState implements State {
    RollerClamp rollerClamp;

    public TampilanMonitorState(RollerClamp rollerClamp) {
        this.rollerClamp = rollerClamp;
    }

    public void aturRollerclamp() {
        System.out.println("Kamu tidak bisa mengatur rollerclamp di monitor");
    }

    public void rusakRollerclamp() {
        System.out.println("Rollerclamp rusak");
    }

    public void hitungTetesan() {
        System.out.println("Rollerclamp berfungsi, tapi belum diatur kecepatannya");
    }

    public void habis() {
        System.out.println("Infus habis");
    }

    public String toString() {
        return "ganti infus";
    }
}
