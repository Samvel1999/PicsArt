package homework_4.menu;

import homework_4.model.Laptop;
import homework_4.model.Mobile;
import homework_4.model.RecordPlayer;
import homework_4.service.*;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello: Welcome to our Electronics supermarket.");
        System.out.println("Please, choose your device:");
        System.out.println("1: Device with screen");
        System.out.println("2: Device without screen");
        int a = scanner.nextInt();
        switch(a) {
            case 1:
                System.out.println("Please, choose your device with screen");
                System.out.println("1: Laptop");
                System.out.println("2: Mobile");
                System.out.println("3: TV");
                a = scanner.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("Please, choose what to look for in laptops.");
                        System.out.println("1: Find all");
                        System.out.println("2: Find by price ");
                        System.out.println("3: Find by model ");
                        System.out.println("4: Find by color ");
                        System.out.println("5: Find by ram ");
                        a = scanner.nextInt();
                        switch (a) {
                            case 1:
                                LaptopService laptopService1 = new LaptopService();
                                laptopService1.print(laptopService1.getAll());
                                break;
                            case 2:
                                LaptopService laptopService2 = new LaptopService();
                                int price = scanner.nextInt();
                                laptopService2.print(laptopService2.getByPrice(price));
                                break;
                            case 3:
                                LaptopService laptopService3 = new LaptopService();
                                scanner.nextLine();
                                String model = scanner.nextLine();
                                laptopService3.print(laptopService3.getByModel(model));
                                break;
                            case 4:
                                LaptopService laptopService4 = new LaptopService();
                                scanner.nextLine();
                                String color = scanner.nextLine();
                                laptopService4.print(laptopService4.getByColor(color));
                                break;
                            case 5:
                                LaptopService laptopService5 = new LaptopService();
                                int ram = scanner.nextInt();
                                laptopService5.print(laptopService5.getByRam(ram));
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Please, choose what to look for in mobiles.");
                        System.out.println("1: Find all");
                        System.out.println("2: Find by price ");
                        System.out.println("3: Find by model ");
                        System.out.println("4: Find by color ");
                        System.out.println("5: Find by ram ");
                        System.out.println("6: Find by os ");
                        a = scanner.nextInt();
                        switch (a) {
                            case 1:
                                MobileService mobileService1 = new MobileService();
                                mobileService1.print(mobileService1.getAll());
                                break;
                            case 2:
                                MobileService mobileService2 = new MobileService();
                                int price = scanner.nextInt();
                                mobileService2.print(mobileService2.getByPrice(price));
                                break;
                            case 3:
                                MobileService mobileService3 = new MobileService();
                                scanner.nextLine();
                                String model = scanner.nextLine();
                                mobileService3.print(mobileService3.getByModel(model));
                                break;
                            case 4:
                                MobileService mobileService4 = new MobileService();
                                scanner.nextLine();
                                String color = scanner.nextLine();
                                mobileService4.print(mobileService4.getByColor(color));
                                break;
                            case 5:
                                MobileService mobileService5 = new MobileService();
                                int ram = scanner.nextInt();
                                mobileService5.print(mobileService5.getByRam(ram));
                                break;
                            case 6:
                                MobileService mobileService6 = new MobileService();
                                scanner.nextLine();
                                String os = scanner.nextLine();
                                mobileService6.print(mobileService6.getByOs(os));
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Please, choose what to look for in tvs.");
                        System.out.println("1: Find all");
                        System.out.println("2: Find by price ");
                        System.out.println("3: Find by model ");
                        System.out.println("4: Find by smart(true or false) ");
                        a = scanner.nextInt();
                        switch (a) {
                            case 1:
                                TVService tvService1 = new TVService();
                                tvService1.print(tvService1.getAll());
                                break;
                            case 2:
                                TVService tvService2 = new TVService();
                                int price = scanner.nextInt();
                                tvService2.print(tvService2.getByPrice(price));
                                break;
                            case 3:
                                TVService tvService3 = new TVService();
                                scanner.nextLine();
                                String model = scanner.nextLine();
                                tvService3.print(tvService3.getByModel(model));
                                break;
                            case 4:
                                TVService tvService4 = new TVService();
                                boolean smart = scanner.nextBoolean();
                                tvService4.print(tvService4.getBySmart(smart));
                                break;
                        }
                        break;
                }
                break;
            case 2:
                System.out.println("Please, choose your device without screen");
                System.out.println("1: Washing machine");
                System.out.println("2: Camera");
                System.out.println("3: Playing console");
                System.out.println("4: Record player");
                System.out.println("5: Vacuum cleaner");
                System.out.println("6: Printer");
                System.out.println("7: Dish Washer");
                a = scanner.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("Please, choose what to look for in washing machines.");
                        System.out.println("1: Find all");
                        System.out.println("2: Find by price ");
                        System.out.println("3: Find by model ");
                        System.out.println("4: Find by color ");
                        System.out.println("5: Find by manufacturer country ");
                        a = scanner.nextInt();
                        switch (a) {
                            case 1:
                                WashingMachineService washingMachineService1 = new WashingMachineService();
                                washingMachineService1.print(washingMachineService1.getAll());
                                break;
                            case 2:
                                WashingMachineService washingMachineService2 = new WashingMachineService();
                                int price = scanner.nextInt();
                                washingMachineService2.print(washingMachineService2.getByPrice(price));
                                break;
                            case 3:
                                WashingMachineService washingMachineService3 = new WashingMachineService();
                                scanner.nextLine();
                                String model = scanner.nextLine();
                                washingMachineService3.print(washingMachineService3.getByModel(model));
                                break;
                            case 4:
                                WashingMachineService washingMachineService4 = new WashingMachineService();
                                scanner.nextLine();
                                String color = scanner.nextLine();
                                washingMachineService4.print(washingMachineService4.getByColor(color));
                                break;
                            case 5:
                                WashingMachineService washingMachineService5 = new WashingMachineService();
                                scanner.nextLine();
                                String manufacturerCountry = scanner.nextLine();
                                washingMachineService5.print(washingMachineService5.getByManufacturerCountry(manufacturerCountry));
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("Please, choose what to look for in cameras.");
                        System.out.println("1: Find all");
                        System.out.println("2: Find by price ");
                        System.out.println("3: Find by model ");
                        System.out.println("4: Find by pixel ");
                        a = scanner.nextInt();
                        switch (a) {
                            case 1:
                                CameraService cameraService1 = new CameraService();
                                cameraService1.print(cameraService1.getAll());
                                break;
                            case 2:
                                CameraService cameraService2 = new CameraService();
                                int price = scanner.nextInt();
                                cameraService2.print(cameraService2.getByPrice(price));
                                break;
                            case 3:
                                CameraService cameraService3 = new CameraService();
                                scanner.nextLine();
                                String model = scanner.nextLine();
                                cameraService3.print(cameraService3.getByModel(model));
                                break;
                            case 4:
                                CameraService cameraService4 = new CameraService();
                                int pixel = scanner.nextInt();
                                cameraService4.print(cameraService4.getByPixel(pixel));
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Please, choose what to look for in playing consoles.");
                        System.out.println("1: Find all");
                        System.out.println("2: Find by price ");
                        System.out.println("3: Find by model ");
                        System.out.println("4: Find by ram ");
                        System.out.println("5: Find by color ");
                        a = scanner.nextInt();
                        switch (a) {
                            case 1:
                                PlayingConsoleService playingConsoleService1 = new PlayingConsoleService();
                                playingConsoleService1.print(playingConsoleService1.getAll());
                                break;
                            case 2:
                                PlayingConsoleService playingConsoleService2 = new PlayingConsoleService();
                                int price = scanner.nextInt();
                                playingConsoleService2.print(playingConsoleService2.getByPrice(price));
                                break;
                            case 3:
                                PlayingConsoleService playingConsoleService3 = new PlayingConsoleService();
                                scanner.nextLine();
                                String model = scanner.nextLine();
                                playingConsoleService3.print(playingConsoleService3.getByModel(model));
                                break;
                            case 4:
                                PlayingConsoleService playingConsoleService4 = new PlayingConsoleService();
                                int ram = scanner.nextInt();
                                playingConsoleService4.print(playingConsoleService4.getByRam(ram));
                                break;
                            case 5:
                                PlayingConsoleService playingConsoleService5 = new PlayingConsoleService();
                                scanner.nextLine();
                                String color = scanner.nextLine();
                                playingConsoleService5.print(playingConsoleService5.getByColor(color));
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Please, choose what to look for in record players.");
                        System.out.println("1: Find all");
                        System.out.println("2: Find by price ");
                        System.out.println("3: Find by model ");
                        System.out.println("4: Find by color ");
                        a = scanner.nextInt();
                        switch (a) {
                            case 1:
                                RecordPlayerService recordPlayerService1 = new RecordPlayerService();
                                recordPlayerService1.print(recordPlayerService1.getAll());
                                break;
                            case 2:
                                RecordPlayerService recordPlayerService2 = new RecordPlayerService();
                                int price = scanner.nextInt();
                                recordPlayerService2.print(recordPlayerService2.getByPrice(price));
                                break;
                            case 3:
                                RecordPlayerService recordPlayerService3 = new RecordPlayerService();
                                scanner.nextLine();
                                String model = scanner.nextLine();
                                recordPlayerService3.print(recordPlayerService3.getByModel(model));
                                break;
                            case 4:
                                RecordPlayerService recordPlayerService4 = new RecordPlayerService();
                                scanner.nextLine();
                                String color = scanner.nextLine();
                                recordPlayerService4.print(recordPlayerService4.getByColor(color));
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Please, choose what to look for in vacuum cleaners.");
                        System.out.println("1: Find all");
                        System.out.println("2: Find by price ");
                        System.out.println("3: Find by model ");
                        System.out.println("4: Find by color ");
                        a = scanner.nextInt();
                        switch (a) {
                            case 1:
                                VacuumCleanerService vacuumCleanerService1 = new VacuumCleanerService();
                                vacuumCleanerService1.print(vacuumCleanerService1.getAll());
                                break;
                            case 2:
                                VacuumCleanerService vacuumCleanerService2 = new VacuumCleanerService();
                                int price = scanner.nextInt();
                                vacuumCleanerService2.print(vacuumCleanerService2.getByPrice(price));
                                break;
                            case 3:
                                VacuumCleanerService vacuumCleanerService3 = new VacuumCleanerService();
                                scanner.nextLine();
                                String model = scanner.nextLine();
                                vacuumCleanerService3.print(vacuumCleanerService3.getByModel(model));
                                break;
                            case 4:
                                VacuumCleanerService vacuumCleanerService4 = new VacuumCleanerService();
                                scanner.nextLine();
                                String color = scanner.nextLine();
                                vacuumCleanerService4.print(vacuumCleanerService4.getByColor(color));
                                break;
                        }
                        break;
                    case 6:
                        System.out.println("Please, choose what to look for in printers.");
                        System.out.println("1: Find all");
                        System.out.println("2: Find by price ");
                        System.out.println("3: Find by model ");
                        System.out.println("4: Find by color ");
                        System.out.println("5: Find by colored");
                        a = scanner.nextInt();
                        switch (a) {
                            case 1:
                                PrinterService printerService1 = new PrinterService();
                                printerService1.print(printerService1.getAll());
                                break;
                            case 2:
                                PrinterService printerService2 = new PrinterService();
                                int price = scanner.nextInt();
                                printerService2.print(printerService2.getByPrice(price));
                                break;
                            case 3:
                                PrinterService printerService3 = new PrinterService();
                                scanner.nextLine();
                                String model = scanner.nextLine();
                                printerService3.print(printerService3.getByModel(model));
                                break;
                            case 4:
                                PrinterService printerService4 = new PrinterService();
                                scanner.nextLine();
                                String color = scanner.nextLine();
                                printerService4.print(printerService4.getByColor(color));
                                break;
                            case 5:
                                PrinterService printerService5 = new PrinterService();
                                scanner.nextLine();
                                boolean colored = scanner.nextBoolean();
                                printerService5.print(printerService5.getByColored(colored));
                                break;
                        }
                        break;
                    case 7:
                        System.out.println("Please, choose what to look for in dish washers.");
                        System.out.println("1: Find all");
                        System.out.println("2: Find by price ");
                        System.out.println("3: Find by model ");
                        System.out.println("4: Find by color ");
                        a = scanner.nextInt();
                        switch (a) {
                            case 1:
                                DishWasherService dishWasherService1 = new DishWasherService();
                                dishWasherService1.print(dishWasherService1.getAll());
                                break;
                            case 2:
                                DishWasherService dishWasherService2 = new DishWasherService();
                                int price = scanner.nextInt();
                                dishWasherService2.print(dishWasherService2.getByPrice(price));
                                break;
                            case 3:
                                DishWasherService dishWasherService3 = new DishWasherService();
                                scanner.nextLine();
                                String model = scanner.nextLine();
                                dishWasherService3.print(dishWasherService3.getByModel(model));
                                break;
                            case 4:
                                DishWasherService dishWasherService4 = new DishWasherService();
                                scanner.nextLine();
                                String color = scanner.nextLine();
                                dishWasherService4.print(dishWasherService4.getByColor(color));
                                break;
                        }
                        break;
                }
                break;
        }
    }
}