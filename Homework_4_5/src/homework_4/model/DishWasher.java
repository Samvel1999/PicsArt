package homework_4.model;

import homework_4.model.interfaces.CleaningDevice;

public class DishWasher extends DeviceWithoutScreen implements CleaningDevice {
    private int capacity;
    private int numberOfPrograms;
    private String energyClass;
    private char washClass;
    private char dryClass;
    private int noise;
    private boolean hasRapidWashing;
    private String manufacturerCountry;
    private int width;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity > 0) {
            this.capacity = capacity;
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

    public char getWashClass() {
        return washClass;
    }

    public void setWashClass(char washClass) {
        this.washClass = washClass;
    }

    public char getDryClass() {
        return dryClass;
    }

    public void setDryClass(char dryClass) {
        this.dryClass = dryClass;
    }

    public int getNoise() {
        return noise;
    }

    public void setNoise(int noise) {
        if(noise > 0) {
            this.noise = noise;
        }
    }

    public boolean HasRapidWashing() {
        return hasRapidWashing;
    }

    public void setHasRapidWashing(boolean hasRapidWashing) {
        this.hasRapidWashing = hasRapidWashing;
    }

    public boolean isHasRapidWashing() {
        return hasRapidWashing;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width > 0) {
            this.width = width;
        }
    }

    @Override
    public void clean() {
        System.out.println("Clean dishes");
    }
}
