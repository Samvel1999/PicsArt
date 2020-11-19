package homework_4.model;

import homework_4.model.interfaces.ShootingDevice;

public class Camera extends DeviceWithoutScreen implements ShootingDevice {
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

    public boolean isHasBluetooth() {
        return hasBluetooth;
    }

    public void setHasBluetooth(boolean hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    @Override
    public void takePhoto() {
        System.out.println("Take a photo with camera");
    }

    @Override
    public void takeVideo() {
        System.out.println("Take a video with camera");
    }
}
