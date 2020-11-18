package homework_4.service;

import homework_4.model.Laptop;
import homework_4.model.Mobile;

import java.util.Scanner;

public class MobileService implements CreateService {
    @Override
    public Mobile create() {
        Scanner scanner = new Scanner(System.in);
        Mobile mobile = new Mobile();
        System.out.println("Enter announcement year: ");
        mobile.setAnnouncementYear(scanner.nextInt());


        System.out.println("Enter price: ");
        mobile.setPrice(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter model: ");
        mobile.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        mobile.setColor(scanner.nextLine());

        System.out.println("Enter touch screen: ");
        mobile.getScreen().setTouchScreen(scanner.nextBoolean());

        scanner.nextLine();
        System.out.println("Enter height of screen: ");
        mobile.getScreen().setHeight(scanner.nextInt());

        System.out.println("Enter width of screen: ");
        mobile.getScreen().setWidth(scanner.nextInt());

        scanner.nextLine();
        System.out.println("Enter OS: ");
        mobile.setOs(scanner.nextLine());

        System.out.println("Enter ram: ");
        mobile.setRam(scanner.nextInt());

        System.out.println("Enter memory: ");
        mobile.setMemory(scanner.nextInt());

        System.out.println("Enter front camera: ");
        mobile.setFrontCamera(scanner.nextInt());

        System.out.println("Enter main camera: ");
        mobile.setMainCamera(scanner.nextInt());

        System.out.println("Enter battery capacity: ");
        mobile.setBatteryCapacity(scanner.nextInt());

        System.out.println("Enter gps: ");
        mobile.setGps(scanner.nextBoolean());

        System.out.println("Enter bluetooth: ");
        mobile.setBluetooth(scanner.nextBoolean());

        return mobile;
    }
}
