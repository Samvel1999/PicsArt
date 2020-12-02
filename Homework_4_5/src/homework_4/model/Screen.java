package homework_4.model;

public class Screen {

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width > 0) {
            this.width = width;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height > 0) {
            this.height = height;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    @Override
    public String toString() {
        return "width=" + width + "\n"
                + "height=" + height;

    }
}
