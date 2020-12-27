package homework_4.service;

import homework_4.abstractClasses.AbstractDeviceService;
import homework_4.model.VacuumCleaner;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VacuumCleanerService extends AbstractDeviceService<VacuumCleaner> {

    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\VacuumCleaner.txt";
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
    public VacuumCleaner create() {
        Scanner scanner = new Scanner(System.in);
        VacuumCleaner vacuumCleaner = new VacuumCleaner();

        System.out.println("Enter model: ");
        vacuumCleaner.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        vacuumCleaner.setColor(scanner.nextLine());

        System.out.println("Enter weight: ");
        vacuumCleaner.setWeight(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Enter filter: ");
        vacuumCleaner.setFilter(scanner.nextLine());


        System.out.println("Enter announcement year: ");
        vacuumCleaner.setAnnouncementYear(scanner.nextInt());

        System.out.println("Enter price: ");
        vacuumCleaner.setPrice(scanner.nextInt());

        return vacuumCleaner;
    }

    @Override
    public List<VacuumCleaner> getAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<VacuumCleaner> vacuumCleaners = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                VacuumCleaner vacuumCleaner = new VacuumCleaner();
                vacuumCleaner.setId(Integer.parseInt(data[0]));
                vacuumCleaner.setModel(data[1]);
                vacuumCleaner.setColor(data[2]);
                vacuumCleaner.setWeight(Double.parseDouble(data[3]));
                vacuumCleaner.setFilter(data[4]);
                vacuumCleaner.setAnnouncementYear(Integer.parseInt(data[5]));
                vacuumCleaner.setPrice(Integer.parseInt(data[6]));

                vacuumCleaners.add(vacuumCleaner);
            }

            reader.close();

            return vacuumCleaners;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public VacuumCleaner getById(Integer id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            VacuumCleaner vacuumCleaner = new VacuumCleaner();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    vacuumCleaner.setId(id);
                    vacuumCleaner.setModel(data[1]);
                    vacuumCleaner.setColor(data[2]);
                    vacuumCleaner.setWeight(Double.parseDouble(data[3]));
                    vacuumCleaner.setFilter(data[4]);
                    vacuumCleaner.setAnnouncementYear(Integer.parseInt(data[5]));
                    vacuumCleaner.setPrice(Integer.parseInt(data[6]));

                    break;
                }
            }

            reader.close();

            return vacuumCleaner;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }

    }

    @Override
    public List<VacuumCleaner> getByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<VacuumCleaner> vacuumCleaners = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {

                    VacuumCleaner vacuumCleaner = new VacuumCleaner();
                    vacuumCleaner.setId(Integer.parseInt(data[0]));
                    vacuumCleaner.setModel(data[1]);
                    vacuumCleaner.setColor(data[2]);
                    vacuumCleaner.setWeight(Double.parseDouble(data[3]));
                    vacuumCleaner.setFilter(data[4]);
                    vacuumCleaner.setAnnouncementYear(Integer.parseInt(data[5]));
                    vacuumCleaner.setPrice(Integer.parseInt(data[6]));

                    vacuumCleaners.add(vacuumCleaner);
                }
            }


            reader.close();

            return vacuumCleaners;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<VacuumCleaner> getByColor(String color) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<VacuumCleaner> vacuumCleaners = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    VacuumCleaner vacuumCleaner = new VacuumCleaner();
                    vacuumCleaner.setId(Integer.parseInt(data[0]));
                    vacuumCleaner.setModel(data[1]);
                    vacuumCleaner.setColor(data[2]);
                    vacuumCleaner.setWeight(Double.parseDouble(data[3]));
                    vacuumCleaner.setFilter(data[4]);
                    vacuumCleaner.setAnnouncementYear(Integer.parseInt(data[5]));
                    vacuumCleaner.setPrice(Integer.parseInt(data[6]));

                    vacuumCleaners.add(vacuumCleaner);
                }
            }

            reader.close();

            return vacuumCleaners;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<VacuumCleaner> getByPrice(Integer price) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<VacuumCleaner> vacuumCleaners = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[6]) == price) {

                    VacuumCleaner vacuumCleaner = new VacuumCleaner();
                    vacuumCleaner.setId(Integer.parseInt(data[0]));
                    vacuumCleaner.setModel(data[1]);
                    vacuumCleaner.setColor(data[2]);
                    vacuumCleaner.setWeight(Double.parseDouble(data[3]));
                    vacuumCleaner.setFilter(data[4]);
                    vacuumCleaner.setAnnouncementYear(Integer.parseInt(data[5]));
                    vacuumCleaner.setPrice(Integer.parseInt(data[6]));

                    vacuumCleaners.add(vacuumCleaner);
                }
            }


            reader.close();

            return vacuumCleaners;
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
            VacuumCleaner vacuumCleaner = create();

            if(new File(path).length() == 0) {
                data = id + "," + vacuumCleaner.getModel() + "," + vacuumCleaner.getColor()  + ","
                        + vacuumCleaner.getWeight()  + "," + vacuumCleaner.getFilter() + ","
                        + vacuumCleaner.getAnnouncementYear() + "," + vacuumCleaner.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }

                data = "\n" + id + "," + vacuumCleaner.getModel() + "," + vacuumCleaner.getColor()  + ","
                        + vacuumCleaner.getWeight()  + "," + vacuumCleaner.getFilter() + ","
                        + vacuumCleaner.getAnnouncementYear() + "," + vacuumCleaner.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void save(VacuumCleaner vacuumCleaner) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;

            if(new File(path).length() == 0) {
                data = id + "," + vacuumCleaner.getModel() + "," + vacuumCleaner.getColor()  + ","
                        + vacuumCleaner.getWeight()  + "," + vacuumCleaner.getFilter() + ","
                        + vacuumCleaner.getAnnouncementYear() + "," + vacuumCleaner.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                data = "\n" + id + "," + vacuumCleaner.getModel() + "," + vacuumCleaner.getColor()  + ","
                        + vacuumCleaner.getWeight()  + "," + vacuumCleaner.getFilter() + ","
                        + vacuumCleaner.getAnnouncementYear() + "," + vacuumCleaner.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void update(Integer id, VacuumCleaner newVacuumCleaner) {
        List<VacuumCleaner> vacuumCleaners = getAll();
        deleteAllInfoFromFile();
        for(VacuumCleaner vacuumCleaner : vacuumCleaners) {
            if(vacuumCleaner.getId().equals(id)) {
                vacuumCleaner = newVacuumCleaner;
            }
            save(vacuumCleaner);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            List<VacuumCleaner> vacuumCleaners = getAll();
            deleteAllInfoFromFile();
            vacuumCleaners.remove(id.intValue());

            for (VacuumCleaner vacuumCleaner : vacuumCleaners) {
                save(vacuumCleaner);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong Index");
        }
    }
}
