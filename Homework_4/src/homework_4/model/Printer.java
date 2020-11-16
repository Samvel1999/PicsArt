package homework_4.model;

public class Printer extends DeviceWithoutScreen {
    private int numberOfLists;
    private int numberOfColors = 1;

    public int getNumberOfLists() {
        return numberOfLists;
    }

    public void setNumberOfLists(int numberOfLists) {
        this.numberOfLists = numberOfLists;
    }

    public int getNumberOfColors() {
        return numberOfColors;
    }

    public void setNumberOfColors(int numberOfColors) {
        if(numberOfColors > 0) {
            this.numberOfColors = numberOfColors;
        }
    }

    public void print(int numberOfSamples) {
        System.out.println("Print " + numberOfSamples + " sample");
    }

    public void xerox(int numberOfSamples) {
        System.out.println("Xerox " + numberOfSamples + " sample");
    }

    @Override
    public String toString() {
        return super.toString() + "numberOfLists=" + numberOfLists +  "\n" +
                "numberOfColors=" + numberOfColors + "\n";
    }
}
