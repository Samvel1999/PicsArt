package homework_4.model;

import homework_4.abstractClasses.DeviceWithScreen;

public class TV extends DeviceWithScreen {

    private Boolean isSmart;

    public Boolean isSmart() {
        return isSmart;
    }

    public void setSmart(Boolean smart) {
        this.isSmart = smart;
    }

    @Override
    public String toString() {
        String smart = isSmart? "Yes" : "No";
        return super.toString() + "Smart: " + smart + "\n";
    }
}
