package homework_4.abstractClasses;

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
        this.id = id;
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
        this.announcementYear = announcementYear;
    }

    @Override
    public String toString() {
        return  "model=" + model + "\n" +
                "color=" + color + "\n" +
                "announcementYear=" + announcementYear + "\n" +
                "price=" + price + "\n";

    }
}
