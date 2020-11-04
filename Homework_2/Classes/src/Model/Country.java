package Model;

public class Country {

    private int id;
    private String name;
    private int population;
    private String belief;
    private String location;
    private double growthRate;
    private double unemploymentRate;
    private double populationDensity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getBelief() {
        return belief;
    }

    public void setBelief(String belief) {
        this.belief = belief;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public double getUnemploymentRate() {
        return unemploymentRate;
    }

    public void setUnemploymentRate(double unemploymentRate) {
        this.unemploymentRate = unemploymentRate;
    }

    public double getPopulationDensity() {
        return populationDensity;
    }

    public void setPopulationDensity(double populationDensity) {
        this.populationDensity = populationDensity;
    }
}
