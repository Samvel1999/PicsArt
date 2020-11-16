package homework_4.main;

import homework_4.model.*;
import homework_4.service.*;

public class Main {
    public static void main(String[] args) {
        LaptopService laptopService = new LaptopService();
        Laptop laptop = laptopService.create();

        System.out.println("------------Laptop-----------");
        System.out.println(laptop);
        System.out.println("-----------------------------");

        MobileService mobileService = new MobileService();
        Mobile mobile = mobileService.create();

        System.out.println("------------Mobile-----------");
        System.out.println(mobile);
        System.out.println("-----------------------------");
        mobile.call();
        mobile.takePhoto();
        mobile.takeSelfie();
        mobile.takeVideo();

        TVService tvService = new TVService();
        TV tv = tvService.create();

        System.out.println("------------TV-----------");
        System.out.println(tv);
        System.out.println("-------------------------");
        tv.changeChannel(5);
        tv.changeChannelBack();
        tv.changeChannelForward();
        System.out.println(tv.getCurrentChannel());
        tv.raiseVolume(74);
        tv.lowVolume(25);
        System.out.println(tv.getVolume());

        PrinterService printerService = new PrinterService();
        Printer printer = printerService.create();

        System.out.println("------------Printer----------");
        System.out.println(printer);
        System.out.println("-----------------------------");
        printer.xerox(2);
        printer.print(5);

        RecordPlayerService recordPlayerService = new RecordPlayerService();
        RecordPlayer recordPlayer = recordPlayerService.create();

        System.out.println("------------Record Player-----------");
        System.out.println(recordPlayer);
        System.out.println("-----------------------------");
        recordPlayer.changeMusic();
        recordPlayer.insertDisc();
        recordPlayer.removeDisc();
    }
}
