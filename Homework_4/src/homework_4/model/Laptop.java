package homework_4.model;

public class Laptop extends DeviceWithScreen {

    private boolean microphone;
    private boolean speakers;
    private int hardDiscCapacity;
    private int camera;
    private int ram;
    private String cpu;
    private String os;

    public boolean hasMicrophone() {
        return microphone;
    }

    public void setMicrophone(boolean microphone) {
        this.microphone = microphone;
    }

    public boolean hasSpeakers() {
        return speakers;
    }

    public void setSpeakers(boolean speakers) {
        this.speakers = speakers;
    }

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

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return super.toString() + "microphone=" + microphone +  "\n" +
                "speakers=" + speakers +  "\n" +
                "hardDiscCapacity=" + hardDiscCapacity + "\n" +
                "camera=" + camera + "\n" +
                "ram=" + ram + "\n" +
                "cpu=" + cpu +  "\n" +
                "os=" + os +  "\n";
    }
}
