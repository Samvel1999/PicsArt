package homework_4.model;

public class TV extends DeviceWithScreen {

    private boolean smart;
    private int currentChannel = 1;
    private int volume;

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getVolume() {
        return volume;
    }

    public void changeChannelForward() {
        currentChannel++;
        if(currentChannel > 99) {
            currentChannel = 1;
        }
    }

    public void changeChannelBack() {
        currentChannel--;
        if(currentChannel < 0) {
            currentChannel = 99;
        }
    }

    public void changeChannel(int numberOfChannel) {
        if(numberOfChannel > 0 && numberOfChannel < 100) {
            currentChannel = numberOfChannel;
        }
    }

    public int lowVolume(int volume) {
        this.volume -= volume;
        if(this.volume < 0) {
            this.volume = 0;
        }

        return this.volume;
    }

    public int raiseVolume(int volume) {
        this.volume += volume;

        if(this.volume > 100) {
            this.volume = 100;
        }

        return this.volume;
    }

    @Override
    public String toString() {
        return super.toString() + "smart=" + smart + "\n";
    }
}
