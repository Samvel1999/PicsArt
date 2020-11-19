package homework_4.model;

import homework_4.model.interfaces.CleaningDevice;

public class VacuumCleaner extends DeviceWithoutScreen implements CleaningDevice {
    private int weight;
    private String filter;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
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
    public void clean() {
        System.out.println("Collect dusts.");
    }
}
