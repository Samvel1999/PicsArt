package homework_4.model;

public class Mobile extends DeviceWithScreen implements MusicDevice, GamingDevice, CallingDevice, ShootingDevice {

    private String os;
    private int ram;
    private int memory;
    private int frontCamera;
    private int mainCamera;
    private int batteryCapacity;
    private boolean gps;
    private boolean bluetooth;

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

    public boolean hasGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean hasBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public void audiCall() {
        System.out.println("Audio call with mobile");
    }

    @Override
    public void videoCall() {
        System.out.println("Video call with mobile");
    }

    @Override
    public void play() {
        System.out.println("Playing game with mobile");
    }

    @Override
    public void downloadGame() {
        System.out.println("Download game into mobile");

    }

    @Override
    public void deleteGame() {
        System.out.println("Delete game from mobile");
    }

    @Override
    public void connectToTheInternet() {
        System.out.println("Mobile is connected to the Internet");

    }

    @Override
    public void disconnectFromTheInternet() {
        System.out.println("obile is disconnected from the Internet");

    }

    @Override
    public void listenToMusic() {
        System.out.println("Listen to music with mobile");
    }

    @Override
    public void takePhoto() {
        System.out.println("Take a photo with mobile");
    }

    @Override
    public void takeVideo() {
        System.out.println("Take a video with mobile");
    }

    @Override
    public String toString() {
        return super.toString() + "os=" + os +  "\n" +
                "ram=" + ram + "\n" +
                "memory=" + memory + "\n" +
                "frontCamera=" + frontCamera + "\n" +
                "mainCamera=" + mainCamera + "\n" +
                "batteryCapacity=" + batteryCapacity + "\n" +
                "gps=" + gps + "\n" +
                "bluetooth=" + bluetooth;
    }
}

