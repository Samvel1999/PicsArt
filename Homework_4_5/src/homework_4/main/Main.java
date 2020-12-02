package homework_4.main;

import homework_4.menu.Menu;
import homework_4.model.Laptop;
import homework_4.model.PlayingConsole;
import homework_4.model.RecordPlayer;
import homework_4.model.WashingMachine;
import homework_4.service.*;

public class Main {
    public static void main(String[] args) {
        //Laptop
        /*LaptopService laptopService = new LaptopService();
        //laptopService.save();
        System.out.println("----Get All----");
        laptopService.print(laptopService.getAll());
        System.out.println("---------------");
        System.out.println("----Get by id---");
        System.out.println(laptopService.getById(7));
        System.out.println("---------------");
        System.out.println("---Get by price--");
        laptopService.print(laptopService.getByPrice(195000));
        System.out.println("---------------");
        System.out.println("---Get by model--");
        laptopService.print(laptopService.getByModel("Asus"));
        System.out.println("------------------");
        System.out.println("---Get by Color---");
        laptopService.print(laptopService.getByColor("Blue"));
        System.out.println("------------------");
        System.out.println("---Get by Ram-----");
        laptopService.print(laptopService.getByRam(16));
        System.out.println("------------------");*/

        //TV
        /*TVService tvService = new TVService();
        //tvService.save();
        System.out.println("-----Get All ----");
        tvService.print(tvService.getAll());
        System.out.println("-----Get by id---");
        System.out.println(tvService.getById(9));
        System.out.println("-----Get by price--");
        tvService.print(tvService.getByPrice(355000));
        System.out.println("-----Get by model--");
        tvService.print(tvService.getByModel("LG"));
        System.out.println("-----Get smart tvs--");
        tvService.print(tvService.getSmart(true));*/

        //Mobile
        /*MobileService mobileService = new MobileService();
        //mobileService.save();
        System.out.println("---Get All ---");
        mobileService.print(mobileService.getAll());
        System.out.println("---Get by id---");
        System.out.println(mobileService.getById(3));
        System.out.println("---Get by model--");
        mobileService.print(mobileService.getByModel("Samsung"));
        System.out.println("---Get by ram----");
        mobileService.print(mobileService.getByRam(16));
        System.out.println("---Get by price---");
        mobileService.print(mobileService.getByPrice(500000));
        System.out.println("---Get by color----");
        mobileService.print(mobileService.getByColor("Gold"));
        System.out.println("---Get by os----");
        mobileService.print(mobileService.getByOs("Android"));*/

        //Camera
        /*CameraService cameraService = new CameraService();
        //cameraService.save();
        System.out.println("---Get All---");
        cameraService.print(cameraService.getAll());
        System.out.println("---Get by id---");
        System.out.println(cameraService.getById(2));
        System.out.println("---Get by model---");
        cameraService.print(cameraService.getByModel("Nikon"));
        System.out.println("---Get by pixel---");
        cameraService.print(cameraService.getByPixel(16));
        System.out.println("---Get by price---");
        cameraService.print(cameraService.getByPrice(25000));*/

        //Printer
        /*PrinterService printerService = new PrinterService();
        //printerService.save();
        System.out.println("----Get All----");
        printerService.print(printerService.getAll());
        System.out.println("---------------");
        System.out.println("----Get by id---");
        System.out.println(printerService.getById(4));
        System.out.println("---------------");
        System.out.println("---Get by price--");
        printerService.print(printerService.getByPrice(150000));
        System.out.println("-----------------");
        System.out.println("---Get by Color--");
        printerService.print(printerService.getByColor("White"));
        System.out.println("-----------------");*/

        //DishWasher
        /*DishWasherService dishWasherService = new DishWasherService();
        //dishWasherService.save();
        System.out.println("----Get All----");
        dishWasherService.print(dishWasherService.getAll());
        System.out.println("---------------");
        System.out.println("----Get by id----");
        System.out.println(dishWasherService.getById(3));
        System.out.println("-----------------");
        System.out.println("----Get by Model----");
        dishWasherService.print(dishWasherService.getByModel("Bosch"));
        System.out.println("--------------------");
        System.out.println("----Get by Price----");
        dishWasherService.print(dishWasherService.getByPrice(250000));
        System.out.println("--------------------");
        System.out.println("----Get by Color----");
        dishWasherService.print(dishWasherService.getByColor("White"));
        System.out.println("--------------------");*/

        //PlayingConsole
        /*PlayingConsoleService playingConsoleService = new PlayingConsoleService();
        //playingConsoleService.save();
        System.out.println("----Get All----");
        playingConsoleService.print(playingConsoleService.getAll());
        System.out.println("---------------");
        System.out.println("----Get by id----");
        System.out.println(playingConsoleService.getById(2));
        System.out.println("-----------------");
        System.out.println("----Get by model----");
        playingConsoleService.print(playingConsoleService.getByModel("Xbox"));
        System.out.println("--------------------");
        System.out.println("----Get by ram----");
        playingConsoleService.print(playingConsoleService.getByRam(16));
        System.out.println("------------------");
        System.out.println("----Get by price----");
        playingConsoleService.print(playingConsoleService.getByPrice(250000));
        System.out.println("--------------------");
        System.out.println("----Get by color----");
        playingConsoleService.print(playingConsoleService.getByColor("Black"));
        System.out.println("--------------------");*/

        //RecordPlayer
        /*RecordPlayerService recordPlayerService = new RecordPlayerService();
        //recordPlayerService.save();
        System.out.println("---Get All---");
        recordPlayerService.print(recordPlayerService.getAll());
        System.out.println("-------------");
        System.out.println("---Get by id---");
        System.out.println(recordPlayerService.getById(4));
        System.out.println("---------------");
        System.out.println("---Get by model---");
        recordPlayerService.print(recordPlayerService.getByModel("LG"));
        System.out.println("------------------");
        System.out.println("---Get by price---");
        recordPlayerService.print(recordPlayerService.getByPrice(30000));
        System.out.println("------------------");*/

        //VacuumCleaner
        /*VacuumCleanerService vacuumCleanerService = new VacuumCleanerService();
        //vacuumCleanerService.save();
        System.out.println("----Get All----");
        vacuumCleanerService.print(vacuumCleanerService.getAll());
        System.out.println("---------------");
        System.out.println("----Get by id----");
        System.out.println(vacuumCleanerService.getById(3));
        System.out.println("-----------------");
        System.out.println("----Get by model----");
        vacuumCleanerService.print(vacuumCleanerService.getByModel("Panasonic"));
        System.out.println("--------------------");
        System.out.println("----Get by color----");
        vacuumCleanerService.print(vacuumCleanerService.getByColor("Black"));
        System.out.println("--------------------");
        System.out.println("----Get by price----");
        vacuumCleanerService.print(vacuumCleanerService.getByPrice(150000));
        System.out.println("--------------------");*/

        //WashingMachine
        /*WashingMachineService washingMachineService = new WashingMachineService();
        //washingMachineService.save();
        System.out.println("------Get All------");
        washingMachineService.print(washingMachineService.getAll());
        System.out.println("-------------------");
        System.out.println("------Get by id------");
        System.out.println(washingMachineService.getById(4));
        System.out.println("-------------------");
        System.out.println("------Get by model------");
        washingMachineService.print(washingMachineService.getByModel("Bompani"));
        System.out.println("-------------------------");
        System.out.println("------Get by color------");
        washingMachineService.print(washingMachineService.getByColor("Grey"));
        System.out.println("------------------------");
        System.out.println("------Get by price------");
        washingMachineService.print(washingMachineService.getByPrice(179000));
        System.out.println("------------------------");
        System.out.println("------Get by manufacturer country------");
        washingMachineService.print(washingMachineService.getByManufacturerCountry("China"));
        System.out.println("---------------------------------------");*/

        Menu menu = new Menu();
        menu.menu();
    }
}
