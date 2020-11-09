package main;

import model.Plane;
import service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService planeService = new PlaneService();
        Plane[] planes = planeService.createArray(3);

        //task 1
        System.out.println("-----Plane Data----");
        planeService.printPlane(planes[0]);
        System.out.println("-------------------");

        //task 2
        planeService.printPlaneSomeData(planes[0]);

        //task 3
        System.out.println("----Newer Plane----");
        planeService.printPlane(planeService.newerPlane(planes[0], planes[1]));
        System.out.println("-------------------");

        //task 4
        System.out.println("---Model of plane with bigger Wingspan---");
        System.out.println(planeService.modelOfPlaneWithBiggerWingspan(planes[0], planes[1]));
        System.out.println("-----------------------------------------");

        //task 5
        System.out.println("----Plane with highest cost----");
        planeService.printPlane(planeService.planeWithHighestCost(planes[0], planes[1], planes[2]));
        System.out.println("-------------------------------");

        //task 6

        planeService.printCountryOfPlaneWithSmallestSeatsCount(planes[0], planes[1], planes[2]);

        //task 7
        planeService.printAllNotMilitaryPlanes(planes);

        //task 8
        planeService.printAllMilitaryPlanesMoreThan100Hours(planes);

        //task 9
        System.out.println("-----Plane with minimal weight-----");
        planeService.printPlane(planeService.planeWithMinimalWeight(planes));
        System.out.println("------------------------------------");

        //task 10
        System.out.println("-----Plane with minimal cost from all military planes------");
        planeService.printPlane(planeService.planeWithMinimalCostFromAllMilitaryPlanes(planes));
        System.out.println("-----------------------------------------------------------");

        //task 11
        System.out.println("------Planes in Ascending order by year-----");
        planeService.printPlanesInAscendingOrderByYear(planes);
        System.out.println("---------------------------------------------");

        //task 12
        System.out.println("-----Not Military Planes in descending order by seats-----");
        planeService.printNotMilitaryPlanesInDescendingOrderBySeats(planes);
        System.out.println("----------------------------------------------------------");
    }
}
