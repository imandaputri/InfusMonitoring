public class RollerClamp {

    State tampilanMonitorState;
    State rollerclampStabilState;
    State settingRollerclampState;
    State hitungTetesanState;
    State gantiInfusState;

    State state;
    int count = 0;

    public RollerClamp(int numberRollers) {
        tampilanMonitorState = new TampilanMonitorState(this);
        rollerclampStabilState = new RollerclampStabilState(this);
        settingRollerclampState = new SettingRollerclampState(this);
        hitungTetesanState = new HitungTetesanState(this);
        gantiInfusState = new GantiInfusState(this);

        this.count = numberRollers;
        if (numberRollers > 0) {
            state = rollerclampStabilState;
        }
    }

    public void aturRollerclamp() {
        state.aturRollerclamp();
    }

    public void rusakRollerclamp() {
        state.rusakRollerclamp();
    }

    public void hitungTetesan() {
        state.hitungTetesan();
        state.habis();
    }

    void infusHabis() {
        System.out.println("Infus segera habis...");
        if (count != 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void changeinfuse(int count) {
        this.count = count;
        state = gantiInfusState;
    }

    void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }

    public State getTampilanMonitorState() {
        return tampilanMonitorState;
    }

    public State getRollerclampStabilState() {
        return rollerclampStabilState;
    }

    public State getSettingRollerclampState() {
        return settingRollerclampState;
    }

    public State getHitungTetesanState() {
        return hitungTetesanState;
    }

    public State getGantiInfusState() {
        return gantiInfusState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n"+ state);
        result.append("\nSisa cairan infus: " + count + " ml");        

        result.append("\n");
        
        return result.toString();
    }
}
