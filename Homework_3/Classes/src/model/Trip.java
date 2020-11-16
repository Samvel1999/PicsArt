package model;

public class Trip {
    private int id;
    private String plane;
    private String townFrom;
    private String townTo;
    private int price;
    private String airline;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public String getTownFrom() {
        return townFrom;
    }

    public void setTownFrom(String townFrom) {
        this.townFrom = townFrom;
    }

    public String getTownTo() {
        return townTo;
    }

    public void setTownTo(String townTo) {
        this.townTo = townTo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
}
