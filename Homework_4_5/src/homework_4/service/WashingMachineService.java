package homework_4.service;

import homework_4.abstractClasses.AbstractDeviceService;
import homework_4.model.WashingMachine;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WashingMachineService extends AbstractDeviceService<WashingMachine> {
    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\WashingMachine.txt";
    private static int id = 0;

    private void deleteAllInfoFromFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            writer.write("");
        } catch (IOException e) {
            System.out.println("File is not found.");
        }

    }

    @Override
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

    @Override
    public List<WashingMachine> getAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<WashingMachine> washingMachines = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                WashingMachine washingMachine = new WashingMachine();
                washingMachine.setId(Integer.parseInt(data[0]));
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

    @Override
    public WashingMachine getById(Integer id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            WashingMachine washingMachine = new WashingMachine();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    washingMachine.setId(id);
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

    @Override
    public List<WashingMachine> getByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<WashingMachine> washingMachines = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {

                    WashingMachine washingMachine = new WashingMachine();
                    washingMachine.setId(Integer.parseInt(data[0]));
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

    @Override
    public List<WashingMachine> getByColor(String color) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<WashingMachine> washingMachines = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {

                    WashingMachine washingMachine = new WashingMachine();
                    washingMachine.setId(Integer.parseInt(data[0]));
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

    @Override
    public List<WashingMachine> getByPrice(Integer price) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<WashingMachine> washingMachines = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[9]) == price) {

                    WashingMachine washingMachine = new WashingMachine();
                    washingMachine.setId(Integer.parseInt(data[0]));
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
                    washingMachine.setId(Integer.parseInt(data[0]));
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

    @Override
    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            WashingMachine washingMachine = create();

            if(new File(path).length() == 0) {

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

                data = "\n" + id + "," + washingMachine.getModel() + "," + washingMachine.getColor()  + ","
                        + washingMachine.getWashingCapacity()  + "," + washingMachine.getSpinSpeed() + ","
                        + washingMachine.getNumberOfPrograms() + "," + washingMachine.getEnergyClass() + ","
                        + washingMachine.getManufacturerCountry() + "," + washingMachine.getAnnouncementYear() + ","
                        + washingMachine.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void save(WashingMachine washingMachine) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;

            if(new File(path).length() == 0) {
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
                data = "\n" + id + "," + washingMachine.getModel() + "," + washingMachine.getColor()  + ","
                        + washingMachine.getWashingCapacity()  + "," + washingMachine.getSpinSpeed() + ","
                        + washingMachine.getNumberOfPrograms() + "," + washingMachine.getEnergyClass() + ","
                        + washingMachine.getManufacturerCountry() + "," + washingMachine.getAnnouncementYear() + ","
                        + washingMachine.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void update(Integer id, WashingMachine newWashingMachine) {
        List<WashingMachine> washingMachines = getAll();
        deleteAllInfoFromFile();
        for(WashingMachine washingMachine : washingMachines) {
            if(washingMachine.getId().equals(id)) {
                washingMachine = newWashingMachine;
            }
            save(washingMachine);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            List<WashingMachine> washingMachines = getAll();
            deleteAllInfoFromFile();
            washingMachines.remove(id.intValue());

            for (WashingMachine washingMachine : washingMachines) {
                save(washingMachine);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong Index");
        }
    }
}
