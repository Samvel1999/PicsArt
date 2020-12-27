package homework_4.model;

import homework_4.abstractClasses.DeviceWithScreen;

public class Laptop extends DeviceWithScreen {

    private Integer hardDiscCapacity;
    private Integer camera;
    private Integer ram;
    private String cpu;

    public Integer getHardDiscCapacity() {
        return hardDiscCapacity;
    }

    public void setHardDiscCapacity(Integer hardDiscCapacity) {
        if(hardDiscCapacity > 0) {
            this.hardDiscCapacity = hardDiscCapacity;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public Integer getCamera() {
        return camera;
    }

    public void setCamera(Integer camera) {
        if(camera > 0) {
            this.camera = camera;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        if(ram > 0) {
            this.ram = ram;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return super.toString() + "hardDiscCapacity=" + hardDiscCapacity + "\n" +
                "camera=" + camera + "\n" +
                "ram=" + ram + "\n" +
                "cpu=" + cpu +  "\n";
    }
}
