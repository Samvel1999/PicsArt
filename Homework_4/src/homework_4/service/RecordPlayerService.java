package homework_4.service;

import homework_4.model.Laptop;
import homework_4.model.RecordPlayer;

import java.util.Scanner;

public class RecordPlayerService {
    public RecordPlayer create() {
        Scanner scanner = new Scanner(System.in);
        RecordPlayer recordPlayer = new RecordPlayer();

        System.out.println("Enter announcement year: ");
        recordPlayer.setAnnouncementYear(scanner.nextInt());


        System.out.println("Enter price: ");
        recordPlayer.setPrice(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Enter model: ");
        recordPlayer.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        recordPlayer.setColor(scanner.nextLine());

        return recordPlayer;
    }
}
