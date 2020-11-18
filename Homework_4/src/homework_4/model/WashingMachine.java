package homework_4.model;

public class WashingMachine extends DeviceWithoutScreen implements CleaningDevice {
    private int washingCapacity;
    private int spinSpeed;
    private int numberOfPrograms;
    private char washClass;
    private int noise;
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

    public char getWashClass() {
        return washClass;
    }

    public void setWashClass(char washClass) {
        this.washClass = washClass;
    }

    public int getNoise() {
        return noise;
    }

    public void setNoise(int noise) {
        if(noise > 0) {
            this.noise = noise;
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
    public void clean() {
        System.out.println("Wash clothes");
    }
}
