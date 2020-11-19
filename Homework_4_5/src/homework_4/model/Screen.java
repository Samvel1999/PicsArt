package homework_4.model;

public class Screen {

    private boolean touchScreen;
    private double height;
    private double width;

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0) {
            this.width = width;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    @Override
    public String toString() {
        return "touchScreen=" + touchScreen + "\n" +
                "height=" + height + "\n" +
                "width=" + width;
    }
}
