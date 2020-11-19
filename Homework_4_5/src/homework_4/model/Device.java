package homework_4.model;

public class Device {

    private int announcementYear;
    private double price;
    private boolean power = false;
    private boolean powerButton = false;
    private String model;
    private String color;

    protected Device() {

    }

    public int getAnnouncementYear() {
        return announcementYear;
    }

    public void setAnnouncementYear(int announcementYear) {
        this.announcementYear = announcementYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public boolean getPower() {
        return power;
    }

    public boolean getPowerButton() {
        return powerButton;
    }

    public void powerOn() {
        if(!power) {
            power = true;
        }
        else {
            System.out.println("Power is already on");
        }
    }

    public void powerOff() {
        if(power) {
            power = false;
        }
        else {
            System.out.println("Power is already off");
        }
    }

    public void turnOn() {
        if(!powerButton) {
            powerButton = true;
        }
        else {
            System.out.println("Power button is already turn on.");
        }
    }

    public void turnOff() {
        if(powerButton) {
            powerButton = false;
        }
        else {
            System.out.println("Power button is already turn off.");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "announcementYear=" + announcementYear + "\n" +
                "price=" + price + "\n" +
                "power=" + power + "\n" +
                "powerButton=" + powerButton + "\n" +
                "model=" + model + "\n" +
                "color=" + color + "\n";
    }
}
