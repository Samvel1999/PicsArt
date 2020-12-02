package homework_4.model;

import homework_4.model.interfaces.CallingDevice;
import homework_4.model.interfaces.GamingDevice;
import homework_4.model.interfaces.MusicDevice;
import homework_4.model.interfaces.ShootingDevice;

public class Mobile extends DeviceWithScreen {

    private String os;
    private int ram;
    private int memory;
    private int frontCamera;
    private int mainCamera;
    private int batteryCapacity;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if(ram > 0) {
            this.ram = ram;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        if(memory > 0) {
            this.memory = memory;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(int frontCamera) {
        if(frontCamera > 0) {
            this.frontCamera = frontCamera;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getMainCamera() {
        return mainCamera;
    }

    public void setMainCamera(int mainCamera) {
        if(mainCamera > 0) {
            this.mainCamera = mainCamera;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        if(batteryCapacity > 0) {
            this.batteryCapacity = batteryCapacity;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "os=" + os +  "\n" +
                "ram=" + ram + "\n" +
                "memory=" + memory + "\n" +
                "frontCamera=" + frontCamera + "\n" +
                "mainCamera=" + mainCamera + "\n" +
                "batteryCapacity=" + batteryCapacity + "\n";
    }
}

