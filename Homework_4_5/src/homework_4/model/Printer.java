package homework_4.model;

import homework_4.abstractClasses.DeviceWithoutScreen;

public class Printer extends DeviceWithoutScreen {
    private int maxNumberOfLists;
    private boolean isColored;

    public int getMaxNumberOfLists() {
        return maxNumberOfLists;
    }

    public void setMaxNumberOfLists(int maxNumberOfLists) {
        this.maxNumberOfLists = maxNumberOfLists;
    }

    public boolean isColored() {
        return isColored;
    }

    public void setColored(boolean isColored) {
        this.isColored = isColored;
    }

    @Override
    public String toString() {
        String colored = isColored ? "Yes" : "No";

        return super.toString() + "Max number of lists: " + maxNumberOfLists + "pieces" +  "\n" +
                "Colored: " + colored + "\n";
    }
}
