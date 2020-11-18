package homework_4.model;

public class PlayStation extends DeviceWithoutScreen implements GamingDevice {
    private int memory;
    private int ram;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public void play() {
        System.out.println("Playing with playstation");
    }

    @Override
    public void downloadGame() {
        System.out.println("Download game into playstation");

    }

    @Override
    public void deleteGame() {
        System.out.println("Delete game from playstation");
    }

    @Override
    public void connectToTheInternet() {
        System.out.println("Playstation is connected to the Internet");
    }

    @Override
    public void disconnectFromTheInternet() {
        System.out.println("Playstation is disconnected from the Internet");
    }
}
