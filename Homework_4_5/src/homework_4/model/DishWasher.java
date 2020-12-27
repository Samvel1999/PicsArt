package homework_4.model;

import homework_4.abstractClasses.DeviceWithoutScreen;

public class DishWasher extends DeviceWithoutScreen {
    private Integer capacity;
    private String manufacturerCountry;
    private Double width;
    private Double height;
    private Double depth;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        if(capacity > 0) {
            this.capacity = capacity;
        }
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        if(width > 0) {
            this.width = width;
        }
        else {
            System.out.println("Invalid width");
        }
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        if(height > 0) {
            this.height = height;
        }
        else {
            System.out.println("Invalid height");
        }
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        if(depth > 0) {
            this.depth = depth;
        }
        else {
            System.out.println("Invalid depth");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "capacity = " + capacity + "\n"
                + "manufacturer country = " + manufacturerCountry + "\n"
                + "width = " + width + "\n"
                + "height = " + height + "\n"
                + "depth = " + depth + "\n";
    }
}
