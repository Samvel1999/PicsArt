package homework_4.menu;

import homework_4.enums.Language;
import homework_4.exceptions.FullNameException;
import homework_4.model.*;
import homework_4.otherClasses.Dictionary;
import homework_4.service.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public void startMenu() throws FullNameException {
        Scanner scanner = new Scanner(System.in);
        Map<Language, HashMap<String, String>> dictionary =  Dictionary.translate();

        System.out.println("Հայերենի համար սեղմեք 1:");
        System.out.println("For english press  2.");
        System.out.println("Для русского языка нажмите 3.");
        int l = scanner.nextInt();
        Language language = null;
        switch (l) {
            case 1:
                language = Language.ARMENIAN;
                break;
            case 2:
                language = Language.ENGLISH;
                break;
            case 3:
                language = Language.RUSSIAN;
                break;
        }

        System.out.println("1: " + dictionary.get(language).get("Registration"));
        System.out.println("2: " + dictionary.get(language).get("Login"));
        l = scanner.nextInt();
        UserService userService = new UserService();
        switch (l) {
            case 1:
                userService.registration(language);
                break;
            case 2:
                userService.login(language);
                break;
        }

        System.out.println(dictionary.get(language).get("Hello: Welcome to our Electronics supermarket."));
        System.out.println(dictionary.get(language).get("Please, choose your device:"));
        System.out.println("1: " + dictionary.get(language).get("Device with screen"));
        System.out.println("2: " + dictionary.get(language).get("Device without screen"));
        int a = scanner.nextInt();
        switch(a) {
            case 1:
                System.out.println(dictionary.get(language).get("Please, choose your device with screen"));
                System.out.println("1: " + dictionary.get(language).get("Laptop"));
                System.out.println("2: " + dictionary.get(language).get("Mobile"));
                System.out.println("3: " + dictionary.get(language).get("TV"));
                a = scanner.nextInt();
                System.out.println(dictionary.get(language).get("Please, select filter."));
                System.out.println("1: " + dictionary.get(language).get("All"));
                System.out.println("2: " + dictionary.get(language).get("Price"));
                System.out.println("3: " + dictionary.get(language).get("Model"));
                System.out.println("4: " + dictionary.get(language).get("Color"));
                switch (a) {
                    case 1:
                        System.out.println("5: " + dictionary.get(language).get("RAM"));
                        a = scanner.nextInt();
                        if(a != 1) {
                            System.out.println(dictionary.get(language).get("Your input"));
                        }
                        LaptopService laptopService = new LaptopService();
                        List<Laptop> laptops = null;
                        switch (a) {
                            case 1:
                                laptops = laptopService.getAll();
                                break;
                            case 2:
                                laptops = laptopService.getByPrice(scanner.nextInt());
                                break;
                            case 3:
                                scanner.nextLine();
                                laptops = laptopService.getByModel(scanner.nextLine());
                                break;
                            case 4:
                                scanner.nextLine();
                                laptops = laptopService.getByColor(scanner.nextLine());
                                break;
                            case 5:
                                laptops = laptopService.getByRam(scanner.nextInt());
                                break;
                        }

                        if(laptops != null && laptops.size() == 0) {
                            System.out.println(dictionary.get(language).get("Nothing is found"));
                        }
                        else if(laptops != null) {
                            laptopService.print(laptops);
                        }
                        break;
                    case 2:
                        System.out.println("5: " + dictionary.get(language).get("RAM"));
                        System.out.println("6: " + dictionary.get(language).get("OS"));
                        a = scanner.nextInt();
                        if(a != 1) {
                            System.out.println(dictionary.get(language).get("Your input"));
                        }
                        MobileService mobileService = new MobileService();
                        List<Mobile> mobiles = null;
                        switch (a) {
                            case 1:
                                mobiles = mobileService.getAll();
                                break;
                            case 2:
                                mobiles = mobileService.getByPrice(scanner.nextInt());
                                break;
                            case 3:
                                scanner.nextLine();
                                mobiles = mobileService.getByModel(scanner.nextLine());
                                break;
                            case 4:
                                scanner.nextLine();
                                mobiles = mobileService.getByColor(scanner.nextLine());
                                break;
                            case 5:
                                mobiles = mobileService.getByRam(scanner.nextInt());
                                break;
                            case 6:
                                scanner.nextLine();
                                mobiles = mobileService.getByOs(scanner.nextLine());
                                break;
                        }

                        if(mobiles != null && mobiles.size() == 0) {
                            System.out.println(dictionary.get(language).get("Nothing is found"));
                        }
                        else if(mobiles != null) {
                            mobileService.print(mobiles);
                        }

                        break;
                    case 3:
                        System.out.println("4: " + dictionary.get(language).get("Smart"));
                        a = scanner.nextInt();
                        if(a != 1) {
                            System.out.println(dictionary.get(language).get("Your input"));
                        }
                        TVService tvService = new TVService();
                        List<TV> tvs = null;
                        switch (a) {
                            case 1:
                                tvs = tvService.getAll();
                                break;
                            case 2:
                                tvs = tvService.getByPrice(scanner.nextInt());
                                break;
                            case 3:
                                scanner.nextLine();
                                tvs = tvService.getByModel(scanner.nextLine());
                                break;
                            case 4:
                                tvs = tvService.getBySmart(scanner.nextBoolean());
                                break;
                        }

                        if(tvs != null && tvs.size() == 0) {
                            System.out.println(dictionary.get(language).get("Nothing is found"));
                        }
                        else if(tvs != null) {
                            tvService.print(tvs);
                        }

                        break;
                }
                break;
            case 2:
                System.out.println(dictionary.get(language).get("Please, choose your device without screen"));
                System.out.println("1: " + dictionary.get(language).get("Washing machine"));
                System.out.println("2: " + dictionary.get(language).get("Camera"));
                System.out.println("3: " + dictionary.get(language).get("Playing console"));
                System.out.println("4: " + dictionary.get(language).get("Vacuum cleaner"));
                System.out.println("5: " + dictionary.get(language).get("Printer"));
                System.out.println("6: " + dictionary.get(language).get("Dish washer"));
                a = scanner.nextInt();
                System.out.println(dictionary.get(language).get("Please, select filter."));
                System.out.println("1: " +  dictionary.get(language).get("All"));
                System.out.println("2: " + dictionary.get(language).get("Price"));
                System.out.println("3: " + dictionary.get(language).get("Model"));
                switch (a) {
                    case 1:
                        System.out.println("4: " + dictionary.get(language).get("Color"));
                        System.out.println("5: " + dictionary.get(language).get("Manufacturer country"));
                        a = scanner.nextInt();
                        if(a != 1) {
                            System.out.println(dictionary.get(language).get("Your input"));
                        }
                        WashingMachineService washingMachineService = new WashingMachineService();
                        List<WashingMachine> washingMachines = null;
                        switch (a) {
                            case 1:
                                washingMachines = washingMachineService.getAll();
                                break;
                            case 2:
                                washingMachines = washingMachineService.getByPrice(scanner.nextInt());
                                break;
                            case 3:
                                scanner.nextLine();
                                washingMachines = washingMachineService.getByModel(scanner.nextLine());
                                break;
                            case 4:
                                scanner.nextLine();
                                washingMachines = washingMachineService.getByColor(scanner.nextLine());
                                break;
                            case 5:
                                scanner.nextLine();
                                washingMachines = washingMachineService.getByManufacturerCountry(scanner.nextLine());
                                break;
                        }

                        if(washingMachines != null && washingMachines.size() == 0) {
                            System.out.println(dictionary.get(language).get("Nothing is found"));
                        }
                        else if(washingMachines != null) {
                            washingMachineService.print(washingMachines);
                        }

                        break;
                    case 2:
                        System.out.println("4: " + dictionary.get(language).get("Pixel"));
                        a = scanner.nextInt();
                        if(a != 1) {
                            System.out.println(dictionary.get(language).get("Your input"));
                        }
                        CameraService cameraService = new CameraService();
                        List<Camera> cameras = null;
                        switch (a) {
                            case 1:
                                cameras = cameraService.getAll();
                                break;
                            case 2:
                                cameras = cameraService.getByPrice(scanner.nextInt());
                                break;
                            case 3:
                                scanner.nextLine();
                                cameras = cameraService.getByModel(scanner.nextLine());
                                break;
                            case 4:
                                cameras = cameraService.getByPixel(scanner.nextInt());
                                break;
                        }

                        if(cameras != null && cameras.size() == 0) {
                            System.out.println(dictionary.get(language).get("Nothing is found"));
                        }
                        else if(cameras != null) {
                            cameraService.print(cameras);
                        }

                        break;
                    case 3:
                        System.out.println("4: " + dictionary.get(language).get("RAM"));
                        System.out.println("5: " + dictionary.get(language).get("Color"));
                        a = scanner.nextInt();
                        if(a != 1) {
                            System.out.println(dictionary.get(language).get("Your input"));
                        }
                        PlayingConsoleService playingConsoleService = new PlayingConsoleService();
                        List<PlayingConsole> playingConsoles = null;
                        switch (a) {
                            case 1:
                                playingConsoles = playingConsoleService.getAll();
                                break;
                            case 2:
                                playingConsoles = playingConsoleService.getByPrice(scanner.nextInt());
                                break;
                            case 3:
                                scanner.nextLine();
                                playingConsoles = playingConsoleService.getByModel(scanner.nextLine());
                                break;
                            case 4:
                                playingConsoles = playingConsoleService.getByRam(scanner.nextInt());
                                break;
                            case 5:
                                scanner.nextLine();
                                playingConsoles = playingConsoleService.getByColor(scanner.nextLine());
                                break;
                        }

                        if(playingConsoles != null && playingConsoles.size() == 0) {
                            System.out.println(dictionary.get(language).get("Nothing is found"));
                        }
                        else if(playingConsoles != null) {
                            playingConsoleService.print(playingConsoles);
                        }

                        break;
                    case 4:
                        System.out.println("4: " + dictionary.get(language).get("Color"));
                        a = scanner.nextInt();

                        if(a != 1) {
                            System.out.println(dictionary.get(language).get("Your input"));
                        }
                        VacuumCleanerService vacuumCleanerService = new VacuumCleanerService();
                        List<VacuumCleaner> vacuumCleaners = null;
                        switch (a) {
                            case 1:
                                vacuumCleaners = vacuumCleanerService.getAll();
                                break;
                            case 2:
                                vacuumCleaners = vacuumCleanerService.getByPrice(scanner.nextInt());
                                break;
                            case 3:
                                scanner.nextLine();
                                vacuumCleaners = vacuumCleanerService.getByModel(scanner.nextLine());
                                break;
                            case 4:
                                scanner.nextLine();
                                vacuumCleaners = vacuumCleanerService.getByColor(scanner.nextLine());
                                break;
                        }

                        if(vacuumCleaners != null && vacuumCleaners.size() == 0) {
                            System.out.println(dictionary.get(language).get("Nothing is found"));
                        }
                        else if(vacuumCleaners != null) {
                            vacuumCleanerService.print(vacuumCleaners);
                        }

                        break;
                    case 5:
                        System.out.println("4: " + dictionary.get(language).get("Color"));
                        System.out.println("5: " + dictionary.get(language).get("Colored"));
                        a = scanner.nextInt();
                        if(a != 1) {
                            System.out.println(dictionary.get(language).get("Your input"));
                        }
                        PrinterService printerService = new PrinterService();
                        List<Printer> printers = null;
                        switch (a) {
                            case 1:
                                printers = printerService.getAll();
                                break;
                            case 2:
                                printers = printerService.getByPrice(scanner.nextInt());
                                break;
                            case 3:
                                scanner.nextLine();
                                printers = printerService.getByModel(scanner.nextLine());
                                break;
                            case 4:
                                scanner.nextLine();
                                printers = printerService.getByColor(scanner.nextLine());
                                break;
                            case 5:
                                scanner.nextLine();
                                printers = printerService.getByColored(scanner.nextBoolean());
                                break;
                        }

                        if(printers != null && printers.size() == 0) {
                            System.out.println(dictionary.get(language).get("Nothing is found"));
                        }
                        else if(printers != null) {
                            printerService.print(printers);
                        }

                        break;
                    case 6:
                        System.out.println("4: " + dictionary.get(language).get("Color"));
                        a = scanner.nextInt();
                        if(a != 1) {
                            System.out.println(dictionary.get(language).get("Your input"));
                        }
                        DishWasherService dishWasherService = new DishWasherService();
                        List<DishWasher> dishWashers = null;
                        switch (a) {
                            case 1:
                                dishWashers = dishWasherService.getAll();
                                break;
                            case 2:
                                dishWashers = dishWasherService.getByPrice(scanner.nextInt());
                                break;
                            case 3:
                                scanner.nextLine();
                                dishWashers = dishWasherService.getByModel(scanner.nextLine());
                                break;
                            case 4:
                                scanner.nextLine();
                                dishWashers = dishWasherService.getByColor(scanner.nextLine());
                                break;
                        }

                        if(dishWashers != null && dishWashers.size() == 0) {
                            System.out.println(dictionary.get(language).get("Nothing is found"));
                        }
                        else if(dishWashers != null) {
                            dishWasherService.print(dishWashers);
                        }

                        break;
                }
                break;
        }
    }
}
