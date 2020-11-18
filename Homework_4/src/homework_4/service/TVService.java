package homework_4.service;

import homework_4.model.Laptop;
import homework_4.model.TV;

import java.util.Scanner;

public class TVService implements CreateService {
    @Override
    public TV create() {
        Scanner scanner = new Scanner(System.in);
        TV tv = new TV();
        System.out.println("Enter announcement year: ");
        tv.setAnnouncementYear(scanner.nextInt());


        System.out.println("Enter price: ");
        tv.setPrice(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter model: ");
        tv.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        tv.setColor(scanner.nextLine());

        System.out.println("Enter touch screen: ");
        tv.getScreen().setTouchScreen(scanner.nextBoolean());

        scanner.nextLine();
        System.out.println("Enter height of screen: ");
        tv.getScreen().setHeight(scanner.nextInt());

        System.out.println("Enter width of screen: ");
        tv.getScreen().setWidth(scanner.nextInt());

        System.out.println("Enter smart: ");
        tv.setSmart(scanner.nextBoolean());

        return tv;
    }
}
