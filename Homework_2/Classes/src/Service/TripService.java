package Service;

import Model.Trip;

public class TripService {
    public static void main(String[] args) {
        Trip trip = new Trip();

        trip.setId(1);
        trip.setPlane("Airbus A380");
        trip.setTownFrom("Dubai");
        trip.setTownTo("New York");
        trip.setPrice(500);
        trip.setAirline("Emirates");

        System.out.println("Id: " + trip.getId());
        System.out.println("Plane: " + trip.getPlane());
        System.out.println("Town From: " + trip.getTownFrom());
        System.out.println("Town To: " + trip.getTownTo());
        System.out.println("Price: " + trip.getPrice());
        System.out.println("Airline: " + trip.getAirline());
    }
}
