package homework_4.model;

import homework_4.abstractClasses.DeviceWithoutScreen;

public class WashingMachine extends DeviceWithoutScreen {
    private Integer washingCapacity;
    private Integer spinSpeed;
    private Integer numberOfPrograms;
    private String energyClass;
    private String manufacturerCountry;

    public Integer getWashingCapacity() {
        return washingCapacity;
    }

    public void setWashingCapacity(Integer washingCapacity) {
        if(washingCapacity > 0) {
            this.washingCapacity = washingCapacity;
        }
    }

    public Integer getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(Integer spinSpeed) {
        if(spinSpeed > 0) {
            this.spinSpeed = spinSpeed;
        }
    }

    public Integer getNumberOfPrograms() {
        return numberOfPrograms;
    }

    public void setNumberOfPrograms(Integer numberOfPrograms) {
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
        return super.toString() + "Washing capacity: " + washingCapacity + "KG" + "\n"
                + "Spin speed: " + spinSpeed + "rpm" + "\n"
                + "Number of programs: " + numberOfPrograms + "\n"
                + "Energy class: " + energyClass + "\n"
                + "Manufacturer country: " + manufacturerCountry + "\n";
    }
}
