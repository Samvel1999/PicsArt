package homework_4.service;

import homework_4.model.Laptop;
import homework_4.model.Printer;

import java.util.Scanner;

public class PrinterService {
    public Printer create() {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        System.out.println("Enter announcement year: ");
        printer.setAnnouncementYear(scanner.nextInt());

        System.out.println("Enter price: ");
        printer.setPrice(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter model: ");
        printer.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        printer.setColor(scanner.nextLine());

        return printer;
    }
}
