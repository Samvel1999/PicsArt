package service;

import model.Country;

public class CountryService {
    public static void main(String[] args) {
        Country country = new Country();

        country.setId(1);
        country.setName("Brazil");
        country.setPopulation(213_089_945);
        country.setBelief("Catholic");
        country.setLocation("South America");
        country.setGrowthRate(0.72);
        country.setUnemploymentRate(14.4);
        country.setPopulationDensity(25);

        System.out.println("Id: " + country.getId());
        System.out.println("Name: " + country.getName());
        System.out.println("Population: " + country.getPopulation());
        System.out.println("Belief: " + country.getBelief());
        System.out.println("Location: " + country.getLocation());
        System.out.println("Growth Rate: " + country.getGrowthRate() + " %");
        System.out.println("Unemployment Rate: " + country.getUnemploymentRate() + " %");
        System.out.println("Population Density: " + country.getPopulationDensity() + " per km^2");
    }
}
