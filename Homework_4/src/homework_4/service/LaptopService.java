package homework_4.service;

import homework_4.model.Laptop;

import java.util.Scanner;

public class LaptopService implements CreateService {

    @Override
    public Laptop create() {
        Scanner scanner = new Scanner(System.in);
        Laptop laptop = new Laptop();
        System.out.println("Enter announcement year: ");
        laptop.setAnnouncementYear(scanner.nextInt());


        System.out.println("Enter price: ");
        laptop.setPrice(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter model: ");
        laptop.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        laptop.setColor(scanner.nextLine());

        System.out.println("Enter touch screen: ");
        laptop.getScreen().setTouchScreen(scanner.nextBoolean());

        scanner.nextLine();
        System.out.println("Enter height of screen: ");
        laptop.getScreen().setHeight(scanner.nextInt());

        System.out.println("Enter width of screen: ");
        laptop.getScreen().setWidth(scanner.nextInt());

        System.out.println("Enter microphone: ");
        laptop.setMicrophone(scanner.nextBoolean());

        System.out.println("Enter speakers: ");
        laptop.setSpeakers(scanner.nextBoolean());

        scanner.nextLine();
        System.out.println("Enter hard disc capacity: ");
        laptop.setHardDiscCapacity(scanner.nextInt());

        System.out.println("Enter camera: ");
        laptop.setCamera(scanner.nextInt());

        System.out.println("Enter ram: ");
        laptop.setRam(scanner.nextInt());

        scanner.nextLine();
        System.out.println("Enter cpu: ");
        laptop.setCpu(scanner.nextLine());

        System.out.println("Enter OS: ");
        laptop.setOs(scanner.nextLine());

        return laptop;
    }
}
