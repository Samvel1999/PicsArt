package homework_4.model;

public class DishWasher extends DeviceWithoutScreen {
    private int capacity;
    private String manufacturerCountry;
    private double width;
    private double height;
    private double depth;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0) {
            this.width = width;
        }
        else {
            System.out.println("Invalid width");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        }
        else {
            System.out.println("Invalid height");
        }
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
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
