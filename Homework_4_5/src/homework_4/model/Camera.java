package homework_4.model;

import homework_4.model.interfaces.ShootingDevice;

public class Camera extends DeviceWithoutScreen {
    private int pixel;
    private int memory;
    private int weight;
    private boolean hasBluetooth;

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        if(pixel > 0) {
            this.pixel = pixel;
        }
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        if(memory > 0) {
            this.memory = memory;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0) {
            this.weight = weight;
        }
    }

    public boolean hasBluetooth() {
        return hasBluetooth;
    }

    public void setBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    @Override
    public String toString() {
        return super.toString() + "pixel = " + pixel + "\n"
                + "memory = " + memory + "\n"
                + "weight = " + weight + "\n"
                + "hasBluetooth = " + hasBluetooth + "\n";
    }
}
