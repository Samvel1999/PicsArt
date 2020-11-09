package model;

public class Plane {
    private String model;
    private String country;
    private int year;
    private int hours;
    private boolean military;
    private String engineType;
    private int weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(!model.equals("")) {
            this.model = model;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(!country.equals("")) {
            this.country = country;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1903 && year <= 2020) {
            this.year = year;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours >= 0 && hours <= 10000) {
            this.hours = hours;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if(!engineType.equals("")) {
            this.engineType = engineType;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight >= 1000 && weight <= 160000) {
            this.weight = weight;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if(wingspan >= 10 && wingspan <= 45) {
            this.wingspan = wingspan;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if(topSpeed <= 1000 && topSpeed >= 0) {
            this.topSpeed = topSpeed;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats >= 0) {
            this.seats = seats;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost >= 0) {
            this.cost = cost;
        }
        else {
            System.out.println("Wrong data");
        }
    }
}
