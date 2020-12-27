package homework_4.model;

import homework_4.abstractClasses.DeviceWithScreen;

public class TV extends DeviceWithScreen {

    private Boolean smart;

    public Boolean isSmart() {
        return smart;
    }

    public void setSmart(Boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + "smart=" + smart + "\n";
    }
}
