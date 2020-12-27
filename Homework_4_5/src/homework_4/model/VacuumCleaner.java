package homework_4.model;

import homework_4.abstractClasses.DeviceWithoutScreen;

public class VacuumCleaner extends DeviceWithoutScreen {
    private Double weight;
    private String filter;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
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
