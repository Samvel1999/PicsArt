package homework_4.model;

import homework_4.abstractClasses.DeviceWithScreen;

public class Mobile extends DeviceWithScreen {

    private String os;
    private Integer ram;
    private Integer memory;
    private Integer frontCamera;
    private Integer mainCamera;
    private Integer batteryCapacity;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
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

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        if(memory > 0) {
            this.memory = memory;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public Integer getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(Integer frontCamera) {
        if(frontCamera > 0) {
            this.frontCamera = frontCamera;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public Integer getMainCamera() {
        return mainCamera;
    }

    public void setMainCamera(Integer mainCamera) {
        if(mainCamera > 0) {
            this.mainCamera = mainCamera;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        if(batteryCapacity > 0) {
            this.batteryCapacity = batteryCapacity;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "OS: " + os +  "\n" +
                "RAM: " + ram + "GB" + "\n" +
                "Memory: " + memory + "GB" + "\n" +
                "Front camera: " + frontCamera + "MP" + "\n" +
                "Main camera: " + mainCamera + "MP" + "\n" +
                "Battery capacity: " + batteryCapacity +"mAh" + "\n";
    }
}

