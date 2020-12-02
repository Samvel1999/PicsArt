package homework_4.model;

public class RecordPlayer extends DeviceWithoutScreen {

    private int volume;
    private boolean radio;
    private boolean disc;
    private int weight;

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return super.toString() + "weight = " + weight + "\n";
    }
}
