package homework_4.model;

import homework_4.model.interfaces.GamingDevice;

public class PlayingConsole extends DeviceWithoutScreen {
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
    public String toString() {
        return super.toString() + "memory = " + memory + "\n"
                + "ram = " + ram + "\n";
    }
}
