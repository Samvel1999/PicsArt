package homework_4.model;

public class WashingMachine extends DeviceWithoutScreen {
    private int washingCapacity;
    private int spinSpeed;
    private int numberOfPrograms;
    private String energyClass;
    private String manufacturerCountry;

    public int getWashingCapacity() {
        return washingCapacity;
    }

    public void setWashingCapacity(int washingCapacity) {
        if(washingCapacity > 0) {
            this.washingCapacity = washingCapacity;
        }
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        if(spinSpeed > 0) {
            this.spinSpeed = spinSpeed;
        }
    }

    public int getNumberOfPrograms() {
        return numberOfPrograms;
    }

    public void setNumberOfPrograms(int numberOfPrograms) {
        if(numberOfPrograms > 0) {
            this.numberOfPrograms = numberOfPrograms;
        }
    }

    public String getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(String energyClass) {
        this.energyClass = energyClass;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    @Override
    public String toString() {
        return super.toString() + "washing capacity = " + washingCapacity + "\n"
                + "spin speed = " + spinSpeed + "\n"
                + "number of programs = " + numberOfPrograms + "\n"
                + "energy class = " + energyClass + "\n"
                + "manufacturer country = " + manufacturerCountry + "\n";
    }
}
