package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {
    public Plane create() {
        Plane plane = new Plane();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Model: ");
        plane.setModel(scanner.nextLine());

        System.out.println("Enter Country: ");
        plane.setCountry(scanner.nextLine());

        System.out.println("Enter Year: ");
        plane.setYear(scanner.nextInt());

        System.out.println("Enter Hours: ");
        plane.setHours(scanner.nextInt());

        System.out.println("Enter Military: ");
        plane.setMilitary(scanner.nextBoolean());

        scanner.nextLine();
        System.out.println("Enter EngineType: ");
        plane.setEngineType(scanner.nextLine());

        System.out.println("Enter Weight: ");
        plane.setWeight(scanner.nextInt());

        System.out.println("Enter Wingspan: ");
        plane.setWingspan(scanner.nextInt());

        System.out.println("Enter TopSpeed: ");
        plane.setTopSpeed(scanner.nextInt());

        System.out.println("Enter Seats: ");
        plane.setSeats(scanner.nextInt());

        System.out.println("Enter Cost: ");
        plane.setCost(scanner.nextInt());

        return plane;
    }

    public Plane[] createArray(int size) {
        Plane[] planes = new Plane[size];

        for(int i = 0; i < planes.length; i++) {
            planes[i] = create();
        }

        return planes;
    }

    //task 1
    public void printPlane(Plane plane) {
        System.out.println("Model: " + plane.getModel());
        System.out.println("Country: " + plane.getCountry());
        System.out.println("Year: " + plane.getYear());
        System.out.println("Hours: " + plane.getHours());
        System.out.println("Military: " + plane.isMilitary());
        System.out.println("EngineType: " + plane.getEngineType());
        System.out.println("Weight: " + plane.getWeight());
        System.out.println("Wingspan: " + plane.getWingspan());
        System.out.println("TopSpeed: " + plane.getTopSpeed());
        System.out.println("Seats: " + plane.getSeats());
        System.out.println("Cost: " + plane.getCost());
    }

    //task 2
    public void printPlaneSomeData(Plane plane) {
        if(plane.isMilitary()) {
            System.out.println("---Military Plane's cost and topSpeed----");
            System.out.println("Cost: " + plane.getCost());
            System.out.println("TopSpeed: " + plane.getTopSpeed());
            System.out.println("---------------------------------------");
        }
        else {
            System.out.println("---Not Military Plane's model and country----");
            System.out.println("Model: " + plane.getModel());
            System.out.println("Country: " + plane.getCountry());
            System.out.println("---------------------------------------");
        }
    }

    //task 3
    public Plane newerPlane(Plane plane1, Plane plane2) {
        return plane1.getYear() >= plane2.getYear()? plane1 : plane2;
    }

    //task 4
    public String modelOfPlaneWithBiggerWingspan(Plane plane1, Plane plane2) {
        return plane1.getWingspan() > plane2.getWingspan()? plane1.getModel(): plane2.getModel();
    }

    //task 5
    public Plane planeWithHighestCost(Plane plane1, Plane plane2, Plane plane3) {
        Plane plane = plane1.getCost() >= plane2.getCost()? plane1 : plane2;

        return plane.getCost() >= plane3.getCost() ? plane : plane3;
    }

    //task 6
    public void printCountryOfPlaneWithSmallestSeatsCount(Plane plane1, Plane plane2, Plane plane3) {
        Plane plane = plane1.getSeats() <= plane2.getSeats() ? plane1 : plane2;
        plane = plane.getSeats() <= plane3.getSeats() ? plane : plane3;

        System.out.println("Country of plane with smallest seats count: " + plane.getCountry());
    }

    //task 7
    public void printAllNotMilitaryPlanes(Plane[] planes) {
        System.out.println("--------Not Military Planes---------");
        for(int i = 0; i < planes.length; i++) {
            if(!planes[i].isMilitary()) {
                System.out.println("Plane " + (i + 1));
                printPlane(planes[i]);
            }
        }
        System.out.println("------------------------------------");
    }

    //task 8
    public void printAllMilitaryPlanesMoreThan100Hours(Plane[] planes) {
        System.out.println("--------Military Planes in air more than 100 hours---------");
        for(int i = 0; i < planes.length; i++) {
            if(planes[i].getHours() > 100 && planes[i].isMilitary()) {
                System.out.println("Plane " + (i + 1));
                printPlane(planes[i]);
            }
        }
        System.out.println("------------------------------------------------------------");
    }

    //task 9
    public Plane planeWithMinimalWeight(Plane[] planes) {
        Plane minPlane = planes[0];
        for(int i = 1; i < planes.length; i++) {
            if(planes[i].getWeight() <= minPlane.getWeight()) {
                minPlane = planes[i];
            }
        }

        return minPlane;
    }

    //task 10
    public Plane planeWithMinimalCostFromAllMilitaryPlanes(Plane[] planes) {
        Plane minPlane = planes[0];

        for(Plane plane : planes) {
            if(plane.isMilitary()) {
                minPlane = plane;
                break;
            }
        }

        for(int i = 1; i < planes.length; i++) {
            if(planes[i].getCost() < minPlane.getCost() && planes[i].isMilitary()) {
                minPlane = planes[i];
            }
        }

        return minPlane;
    }

    //task 11
    public void printPlanesInAscendingOrderByYear(Plane[] planes) {
        sortAscendingOrderByYear(planes);

        for (int i = 0; i < planes.length; i++) {
            System.out.println("-------Plane " + (i + 1) + "-----");
            printPlane(planes[i]);
            System.out.println("------------------------");
        }
    }

    //task 12
    public void printNotMilitaryPlanesInDescendingOrderBySeats(Plane[] planes) {
        sortDescendingOrderBySeats(planes);

        for (int i = 0; i < planes.length; i++) {

            if(!planes[i].isMilitary()) {
                System.out.println("-------Plane " + (i + 1) + "-----");
                printPlane(planes[i]);
                System.out.println("------------------------");
            }
        }
    }

    private void sortAscendingOrderByYear(Plane[] planes) {
        int n = planes.length;
        boolean isSorted;

        for(int i = 0; i < n - 1; i++) {
            isSorted = true;
            for(int j = 0; j < n - i - 1; j++) {
                if(planes[j].getYear() > planes[j + 1].getYear()) {

                    Plane temp = planes[j];
                    planes[j]  = planes[j + 1];
                    planes[j + 1] = temp;

                    isSorted = false;
                }
            }
            if(isSorted) {
                break;
            }
        }
    }

    private void sortDescendingOrderBySeats(Plane[] planes) {
        int n = planes.length;
        boolean isSorted;

        for(int i = 0; i < n - 1; i++) {
            isSorted = true;
            for(int j = 0; j < n - i - 1; j++) {
                if(planes[j].getSeats() < planes[j + 1].getSeats()) {

                    Plane temp = planes[j];
                    planes[j]  = planes[j + 1];
                    planes[j + 1] = temp;

                    isSorted = false;
                }
            }
            if(isSorted) {
                break;
            }
        }
    }


}


