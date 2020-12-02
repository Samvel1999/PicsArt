package homework_4.model;

public abstract class Device {

    private String model;
    private String color;
    private int announcementYear;
    private int price;
    private boolean power = false;
    private boolean powerButton = false;

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

    public int getAnnouncementYear() {
        return announcementYear;
    }

    public void setAnnouncementYear(int announcementYear) {
        this.announcementYear = announcementYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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

    @Override
    public String toString() {
        return  "model=" + model + "\n" +
                "color=" + color + "\n" +
                "announcementYear=" + announcementYear + "\n" +
                "price=" + price + "\n";

    }
}
