package homework_4.abstractClasses;

import java.time.Year;

public abstract class Device {

    private Integer id;
    private String model;
    private String color;
    private Integer price;
    private Integer announcementYear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id >= 0) {
            this.id = id;
        }
        else {
            System.out.println("Wrong data");
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

    public int getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        if(price > 0) {
            this.price = price;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getAnnouncementYear() {
        return announcementYear;
    }

    public void setAnnouncementYear(Integer announcementYear) {
        if(announcementYear > 2010 && announcementYear <= Year.now().getValue()) {
            this.announcementYear = announcementYear;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    @Override
    public String toString() {
        return  "Model: " + model + "\n" +
                "Color: " + color + "\n" +
                "AnnouncementYear: " + announcementYear + "\n" +
                "Price: " + price + "AMD" + "\n";
    }
}
