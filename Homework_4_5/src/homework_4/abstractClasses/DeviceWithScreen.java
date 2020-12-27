package homework_4.abstractClasses;

import homework_4.abstractClasses.Device;
import homework_4.model.Screen;

public abstract class DeviceWithScreen extends Device {
    private Screen screen = new Screen();

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return super.toString()  + screen + "\n";
    }
}
