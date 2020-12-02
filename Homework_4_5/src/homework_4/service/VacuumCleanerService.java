package homework_4.service;

import homework_4.model.VacuumCleaner;
import homework_4.model.interfaces.CleaningDevice;

import java.io.*;
import java.util.Scanner;

public class VacuumCleanerService implements CleaningDevice {
    private static String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\VacuumCleaner.txt";
    private static int id = 0;

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

    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            VacuumCleaner vacuumCleaner = create();

            if(new File(path).length() == 0) {
                id++;
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
                id++;
                data = "\n" + id + "," + vacuumCleaner.getModel() + "," + vacuumCleaner.getColor()  + ","
                        + vacuumCleaner.getWeight()  + "," + vacuumCleaner.getFilter() + ","
                        + vacuumCleaner.getAnnouncementYear() + "," + vacuumCleaner.getPrice();
            }
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    public VacuumCleaner[] getAll() {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while(reader1.readLine() != null) {
                n++;
            }

            VacuumCleaner[] vacuumCleaners = new VacuumCleaner[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                vacuumCleaners[i] = new VacuumCleaner();
                vacuumCleaners[i].setModel(data[1]);
                vacuumCleaners[i].setColor(data[2]);
                vacuumCleaners[i].setWeight(Double.parseDouble(data[3]));
                vacuumCleaners[i].setFilter(data[4]);
                vacuumCleaners[i].setAnnouncementYear(Integer.parseInt(data[5]));
                vacuumCleaners[i].setPrice(Integer.parseInt(data[6]));
                i++;
            }

            reader1.close();
            reader2.close();

            return vacuumCleaners;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public VacuumCleaner getById(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            VacuumCleaner vacuumCleaner = new VacuumCleaner();
            int i = 0;

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

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

    public VacuumCleaner[] getByModel(String model) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(data[1].equals(model)) {
                    n++;
                }
            }
            reader1.close();

            VacuumCleaner[] vacuumCleaners = new VacuumCleaner[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    vacuumCleaners[i] = new VacuumCleaner();
                    vacuumCleaners[i].setModel(data[1]);
                    vacuumCleaners[i].setColor(data[2]);
                    vacuumCleaners[i].setWeight(Double.parseDouble(data[3]));
                    vacuumCleaners[i].setFilter(data[4]);
                    vacuumCleaners[i].setAnnouncementYear(Integer.parseInt(data[5]));
                    vacuumCleaners[i].setPrice(Integer.parseInt(data[6]));

                    i++;
                }
            }


            reader2.close();

            return vacuumCleaners;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public VacuumCleaner[] getByColor(String color) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(data[2].equals(color)) {
                    n++;
                }
            }
            reader1.close();

            VacuumCleaner[] vacuumCleaners = new VacuumCleaner[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    vacuumCleaners[i] = new VacuumCleaner();
                    vacuumCleaners[i].setModel(data[1]);
                    vacuumCleaners[i].setColor(data[2]);
                    vacuumCleaners[i].setWeight(Double.parseDouble(data[3]));
                    vacuumCleaners[i].setFilter(data[4]);
                    vacuumCleaners[i].setAnnouncementYear(Integer.parseInt(data[5]));
                    vacuumCleaners[i].setPrice(Integer.parseInt(data[6]));

                    i++;
                }
            }


            reader2.close();

            return vacuumCleaners;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public VacuumCleaner[] getByPrice(int price) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(Integer.parseInt(data[6]) == price) {
                    n++;
                }
            }
            reader1.close();

            VacuumCleaner[] vacuumCleaners = new VacuumCleaner[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[6]) == price) {
                    vacuumCleaners[i] = new VacuumCleaner();
                    vacuumCleaners[i].setModel(data[1]);
                    vacuumCleaners[i].setColor(data[2]);
                    vacuumCleaners[i].setWeight(Double.parseDouble(data[3]));
                    vacuumCleaners[i].setFilter(data[4]);
                    vacuumCleaners[i].setAnnouncementYear(Integer.parseInt(data[5]));
                    vacuumCleaners[i].setPrice(Integer.parseInt(data[6]));

                    i++;
                }
            }


            reader2.close();

            return vacuumCleaners;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public void print(VacuumCleaner[] vacuumCleaners) {
        for(VacuumCleaner vacuumCleaner : vacuumCleaners) {
            System.out.println(vacuumCleaner);
        }
    }

    @Override
    public void clean() {
        System.out.println("Collect dusts.");
    }

}
