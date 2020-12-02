package homework_4.model;

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
