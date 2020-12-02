package homework_4.model;

public class Laptop extends DeviceWithScreen {

    private int hardDiscCapacity;
    private int camera;
    private int ram;
    private String cpu;

    public int getHardDiscCapacity() {
        return hardDiscCapacity;
    }

    public void setHardDiscCapacity(int hardDiscCapacity) {
        if(hardDiscCapacity > 0) {
            this.hardDiscCapacity = hardDiscCapacity;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        if(camera > 0) {
            this.camera = camera;
        }
        else {
            System.out.println("Wrong data");
        }
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
