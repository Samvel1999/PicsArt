package homework_4.model;

import homework_4.abstractClasses.DeviceWithoutScreen;

public class Camera extends DeviceWithoutScreen {
    private Integer pixel;
    private Integer memory;
    private Integer weight;
    private Boolean hasBluetooth;

    public Integer getPixel() {
        return pixel;
    }

    public void setPixel(Integer pixel) {
        if(pixel > 0) {
            this.pixel = pixel;
        }
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        if(memory > 0) {
            this.memory = memory;
        }
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if(weight > 0) {
            this.weight = weight;
        }
    }

    public Boolean hasBluetooth() {
        return hasBluetooth;
    }

    public void setBluetooth(Boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    @Override
    public String toString() {
        String bluetooth = hasBluetooth ? "Yes" : "No";

        return super.toString() + "Pixel: " + pixel + "MP" + "\n"
                + "Memory: " + memory + "GB" + "\n"
                + "Weight: " + weight + "g" + "\n"
                + "Bluetooth: " + bluetooth + "\n";
    }
}
