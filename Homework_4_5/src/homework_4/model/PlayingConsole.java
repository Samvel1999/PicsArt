package homework_4.model;

import homework_4.abstractClasses.DeviceWithoutScreen;

public class PlayingConsole extends DeviceWithoutScreen {
    private Integer memory;
    private Integer ram;

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        if(memory > 0) {
            this.memory = memory;
        }
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        if(ram > 0) {
            this.ram = ram;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "memory = " + memory + "\n"
                + "ram = " + ram + "\n";
    }
}
