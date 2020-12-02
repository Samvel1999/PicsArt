package homework_4.model;

import homework_4.model.interfaces.CleaningDevice;

public class VacuumCleaner extends DeviceWithoutScreen {
    private double weight;
    private String filter;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight > 0) {
            this.weight = weight;
        }
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public String toString() {
        return super.toString() + "weight = " + weight + "\n"
                + "filter = " + filter + "\n";
    }
}
