package homework_4.service;

import com.sun.jdi.ArrayReference;
import homework_4.model.WashingMachine;
import homework_4.model.interfaces.CleaningDevice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WashingMachineService /*implements CleaningDevice*/ {
    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\WashingMachine.txt";
    private static int id = 0;

    public WashingMachine create() {
        Scanner scanner = new Scanner(System.in);
        WashingMachine washingMachine = new WashingMachine();

        System.out.println("Enter model: ");
        washingMachine.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        washingMachine.setColor(scanner.nextLine());

        System.out.println("Enter washing capacity: ");
        washingMachine.setWashingCapacity(scanner.nextInt());

        System.out.println("Enter spin speed: ");
        washingMachine.setSpinSpeed(scanner.nextInt());

        System.out.println("Enter number of programs: ");
        washingMachine.setNumberOfPrograms(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Enter energy class: ");
        washingMachine.setEnergyClass(scanner.nextLine());

        System.out.println("Enter manufacturer country: ");
        washingMachine.setManufacturerCountry(scanner.nextLine());

        System.out.println("Enter announcement year: ");
        washingMachine.setAnnouncementYear(scanner.nextInt());

        System.out.println("Enter price: ");
        washingMachine.setPrice(scanner.nextInt());

        return washingMachine;
    }

    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            WashingMachine washingMachine = create();

            if(new File(path).length() == 0) {
                id++;
                data = id + "," + washingMachine.getModel() + "," + washingMachine.getColor()  + ","
                        + washingMachine.getWashingCapacity()  + "," + washingMachine.getSpinSpeed() + ","
                        + washingMachine.getNumberOfPrograms() + "," + washingMachine.getEnergyClass() + ","
                        + washingMachine.getManufacturerCountry() + "," + washingMachine.getAnnouncementYear() + ","
                        + washingMachine.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                id++;
                data = "\n" + id + "," + washingMachine.getModel() + "," + washingMachine.getColor()  + ","
                        + washingMachine.getWashingCapacity()  + "," + washingMachine.getSpinSpeed() + ","
                        + washingMachine.getNumberOfPrograms() + "," + washingMachine.getEnergyClass() + ","
                        + washingMachine.getManufacturerCountry() + "," + washingMachine.getAnnouncementYear() + ","
                        + washingMachine.getPrice();
            }
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    public List<WashingMachine> getAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<WashingMachine> washingMachines = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                WashingMachine washingMachine = new WashingMachine();
                washingMachine.setModel(data[1]);
                washingMachine.setColor(data[2]);
                washingMachine.setWashingCapacity(Integer.parseInt(data[3]));
                washingMachine.setSpinSpeed(Integer.parseInt(data[4]));
                washingMachine.setNumberOfPrograms(Integer.parseInt(data[5]));
                washingMachine.setEnergyClass(data[6]);
                washingMachine.setManufacturerCountry(data[7]);
                washingMachine.setAnnouncementYear(Integer.parseInt(data[8]));
                washingMachine.setPrice(Integer.parseInt(data[9]));

                washingMachines.add(washingMachine);
            }

            reader.close();

            return washingMachines;

        } catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public WashingMachine getById(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            WashingMachine washingMachine = new WashingMachine();
            int i = 0;

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    washingMachine.setModel(data[1]);
                    washingMachine.setColor(data[2]);
                    washingMachine.setWashingCapacity(Integer.parseInt(data[3]));
                    washingMachine.setSpinSpeed(Integer.parseInt(data[4]));
                    washingMachine.setNumberOfPrograms(Integer.parseInt(data[5]));
                    washingMachine.setEnergyClass(data[6]);
                    washingMachine.setManufacturerCountry(data[7]);
                    washingMachine.setAnnouncementYear(Integer.parseInt(data[8]));
                    washingMachine.setPrice(Integer.parseInt(data[9]));

                    break;
                }
            }

            reader.close();

            return washingMachine;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }

    }

    public List<WashingMachine> getByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<WashingMachine> washingMachines = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {

                    WashingMachine washingMachine = new WashingMachine();
                    washingMachine.setModel(data[1]);
                    washingMachine.setColor(data[2]);
                    washingMachine.setWashingCapacity(Integer.parseInt(data[3]));
                    washingMachine.setSpinSpeed(Integer.parseInt(data[4]));
                    washingMachine.setNumberOfPrograms(Integer.parseInt(data[5]));
                    washingMachine.setEnergyClass(data[6]);
                    washingMachine.setManufacturerCountry(data[7]);
                    washingMachine.setAnnouncementYear(Integer.parseInt(data[8]));
                    washingMachine.setPrice(Integer.parseInt(data[9]));

                    washingMachines.add(washingMachine);
                }
            }

            reader.close();

            return washingMachines;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public List<WashingMachine> getByColor(String color) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<WashingMachine> washingMachines = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {

                    WashingMachine washingMachine = new WashingMachine();
                    washingMachine.setModel(data[1]);
                    washingMachine.setColor(data[2]);
                    washingMachine.setWashingCapacity(Integer.parseInt(data[3]));
                    washingMachine.setSpinSpeed(Integer.parseInt(data[4]));
                    washingMachine.setNumberOfPrograms(Integer.parseInt(data[5]));
                    washingMachine.setEnergyClass(data[6]);
                    washingMachine.setManufacturerCountry(data[7]);
                    washingMachine.setAnnouncementYear(Integer.parseInt(data[8]));
                    washingMachine.setPrice(Integer.parseInt(data[9]));

                    washingMachines.add(washingMachine);
                }
            }


            reader.close();

            return washingMachines;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public List<WashingMachine> getByPrice(int price) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<WashingMachine> washingMachines = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[9]) == price) {

                    WashingMachine washingMachine = new WashingMachine();
                    washingMachine.setModel(data[1]);
                    washingMachine.setColor(data[2]);
                    washingMachine.setWashingCapacity(Integer.parseInt(data[3]));
                    washingMachine.setSpinSpeed(Integer.parseInt(data[4]));
                    washingMachine.setNumberOfPrograms(Integer.parseInt(data[5]));
                    washingMachine.setEnergyClass(data[6]);
                    washingMachine.setManufacturerCountry(data[7]);
                    washingMachine.setAnnouncementYear(Integer.parseInt(data[8]));
                    washingMachine.setPrice(Integer.parseInt(data[9]));

                    washingMachines.add(washingMachine);
                }
            }


            reader.close();

            return washingMachines;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public List<WashingMachine> getByManufacturerCountry(String manufacturerCountry) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<WashingMachine> washingMachines = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[7].equals(manufacturerCountry)) {

                    WashingMachine washingMachine = new WashingMachine();
                    washingMachine.setModel(data[1]);
                    washingMachine.setColor(data[2]);
                    washingMachine.setWashingCapacity(Integer.parseInt(data[3]));
                    washingMachine.setSpinSpeed(Integer.parseInt(data[4]));
                    washingMachine.setNumberOfPrograms(Integer.parseInt(data[5]));
                    washingMachine.setEnergyClass(data[6]);
                    washingMachine.setManufacturerCountry(data[7]);
                    washingMachine.setAnnouncementYear(Integer.parseInt(data[8]));
                    washingMachine.setPrice(Integer.parseInt(data[9]));

                    washingMachines.add(washingMachine);
                }
            }


            reader.close();

            return washingMachines;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public void print(List<WashingMachine> washingMachines) {
        for(WashingMachine washingMachine : washingMachines) {
            System.out.println(washingMachine);
        }
    }

    /*@Override
    public void clean() {
        System.out.println("Wash clothes");
    }*/
}
