package homework_4.model;

import homework_4.model.interfaces.CallingDevice;
import homework_4.model.interfaces.GamingDevice;
import homework_4.model.interfaces.MusicDevice;

public class Laptop extends DeviceWithScreen implements MusicDevice, GamingDevice, CallingDevice {

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
    public void listenToMusic() {

        System.out.println("Listen to music with Laptop");
    }


    @Override
    public void audiCall() {

        System.out.println("Audio call with laptop");
    }

    @Override
    public void videoCall() {
        System.out.println("Video call with laptop");
    }

    @Override
    public void play() {
        System.out.println("Playing game with laptop");
    }

    @Override
    public void downloadGame() {
        System.out.println("Download game into laptop");
    }

    @Override
    public void deleteGame() {
        System.out.println("Delete game from laptop");
    }

    @Override
    public void connectToTheInternet() {

        System.out.println("Laptop is connected to the Internet");
    }

    @Override
    public void disconnectFromTheInternet() {
        System.out.println("Laptop is disconnected from the Internet");
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
