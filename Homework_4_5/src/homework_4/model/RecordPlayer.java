package homework_4.model;

import homework_4.model.interfaces.MusicDevice;

public class RecordPlayer extends DeviceWithoutScreen implements MusicDevice {

    private int volume;
    private boolean radio;
    private boolean disc;

    public int getVolume() {
        return volume;
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

    public boolean isRadio() {
        return radio;
    }

    public boolean isDisc() {
        return disc;
    }

    public void radioOn() {
        radio = true;
        disc = false;
    }

    public void discOn() {
        disc = true;
        radio = false;
    }

    public void insertDisc() {
        System.out.println("Disc is inserted");
    }

    public void removeDisc() {
        System.out.println("Disc is removed");
    }

    public void changeMusic() {
        System.out.println("Change music");
    }

    @Override
    public void listenToMusic() {
        System.out.println("Listen to music with record player");
    }

    @Override
    public String toString() {
        return super.toString() + "volume=" + volume + "\n" +
                "radio=" + radio + "\n" +
                "disc=" + disc + "\n";
    }
}
