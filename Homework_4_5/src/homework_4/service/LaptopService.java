package homework_4.service;

import homework_4.abstractClasses.AbstractDeviceService;
import homework_4.model.Laptop;
import homework_4.model.Screen;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaptopService extends AbstractDeviceService<Laptop> {
    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\Laptop.txt";
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
    public Laptop create() {
        Scanner scanner = new Scanner(System.in);
        Laptop laptop = new Laptop();

        System.out.println("Enter model: ");
        laptop.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        laptop.setColor(scanner.nextLine());

        System.out.println("Enter cpu: ");
        laptop.setCpu(scanner.nextLine());

        System.out.println("Enter hard disc capacity: ");
        laptop.setHardDiscCapacity(scanner.nextInt());

        System.out.println("Enter ram: ");
        laptop.setRam(scanner.nextInt());

        System.out.println("Enter camera: ");
        laptop.setCamera(scanner.nextInt());

        System.out.println("Enter width of screen: ");
        laptop.getScreen().setWidth(scanner.nextInt());

        System.out.println("Enter height of screen: ");
        laptop.getScreen().setHeight(scanner.nextInt());

        System.out.println("Enter announcement year: ");
        laptop.setAnnouncementYear(scanner.nextInt());

        System.out.println("Enter price: ");
        laptop.setPrice(scanner.nextInt());

        return laptop;
    }

    @Override
    public List<Laptop> getAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Laptop> laptops = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                Laptop laptop = new Laptop();
                laptop.setId(Integer.parseInt(data[0]));
                laptop.setModel(data[1]);
                laptop.setColor(data[2]);
                laptop.setCpu(data[3]);
                laptop.setHardDiscCapacity(Integer.parseInt(data[4]));
                laptop.setRam(Integer.parseInt(data[5]));
                laptop.setCamera(Integer.parseInt(data[6]));
                Screen screen = new Screen();
                screen.setWidth(Integer.parseInt(data[7]));
                screen.setHeight(Integer.parseInt(data[8]));
                laptop.setScreen(screen);
                laptop.setAnnouncementYear(Integer.parseInt(data[9]));
                laptop.setPrice(Integer.parseInt(data[10]));

                laptops.add(laptop);
            }

            reader.close();
            return laptops;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public Laptop getById(Integer id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            Laptop laptop = new Laptop();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    laptop.setId(id);
                    laptop.setModel(data[1]);
                    laptop.setColor(data[2]);
                    laptop.setCpu(data[3]);
                    laptop.setHardDiscCapacity(Integer.parseInt(data[4]));
                    laptop.setRam(Integer.parseInt(data[5]));
                    laptop.setCamera(Integer.parseInt(data[6]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[7]));
                    screen.setHeight(Integer.parseInt(data[8]));
                    laptop.setScreen(screen);
                    laptop.setAnnouncementYear(Integer.parseInt(data[9]));
                    laptop.setPrice(Integer.parseInt(data[10]));
                }
            }

            reader.close();

            return laptop;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    @Override
    public List<Laptop> getByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Laptop> laptops= new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    Laptop laptop = new Laptop();
                    laptop.setId(Integer.parseInt(data[0]));
                    laptop.setModel(data[1]);
                    laptop.setColor(data[2]);
                    laptop.setCpu(data[3]);
                    laptop.setHardDiscCapacity(Integer.parseInt(data[4]));
                    laptop.setRam(Integer.parseInt(data[5]));
                    laptop.setCamera(Integer.parseInt(data[6]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[7]));
                    screen.setHeight(Integer.parseInt(data[8]));
                    laptop.setScreen(screen);
                    laptop.setAnnouncementYear(Integer.parseInt(data[9]));
                    laptop.setPrice(Integer.parseInt(data[10]));

                    laptops.add(laptop);
                }
            }

            reader.close();

            return laptops;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<Laptop> getByColor(String color) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Laptop> laptops = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    Laptop laptop = new Laptop();
                    laptop.setId(Integer.parseInt(data[0]));
                    laptop.setModel(data[1]);
                    laptop.setColor(data[2]);
                    laptop.setCpu(data[3]);
                    laptop.setHardDiscCapacity(Integer.parseInt(data[4]));
                    laptop.setRam(Integer.parseInt(data[5]));
                    laptop.setCamera(Integer.parseInt(data[6]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[7]));
                    screen.setHeight(Integer.parseInt(data[8]));
                    laptop.setScreen(screen);
                    laptop.setAnnouncementYear(Integer.parseInt(data[9]));
                    laptop.setPrice(Integer.parseInt(data[10]));

                    laptops.add(laptop);
                }
            }

            reader.close();

            return laptops;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<Laptop> getByPrice(Integer price) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Laptop> laptops = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[10]) == price) {
                    Laptop laptop = new Laptop();
                    laptop.setId(Integer.parseInt(data[0]));
                    laptop.setModel(data[1]);
                    laptop.setColor(data[2]);
                    laptop.setCpu(data[3]);
                    laptop.setHardDiscCapacity(Integer.parseInt(data[4]));
                    laptop.setRam(Integer.parseInt(data[5]));
                    laptop.setCamera(Integer.parseInt(data[6]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[7]));
                    screen.setHeight(Integer.parseInt(data[8]));
                    laptop.setScreen(screen);
                    laptop.setAnnouncementYear(Integer.parseInt(data[9]));
                    laptop.setPrice(Integer.parseInt(data[10]));

                    laptops.add(laptop);
                }
            }

            reader.close();

            return laptops;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }


    public List<Laptop> getByRam(Integer ram) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Laptop> laptops = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[5]) == ram) {
                    Laptop laptop = new Laptop();
                    laptop.setId(Integer.parseInt(data[0]));
                    laptop.setModel(data[1]);
                    laptop.setColor(data[2]);
                    laptop.setCpu(data[3]);
                    laptop.setHardDiscCapacity(Integer.parseInt(data[4]));
                    laptop.setRam(Integer.parseInt(data[5]));
                    laptop.setCamera(Integer.parseInt(data[6]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[7]));
                    screen.setHeight(Integer.parseInt(data[8]));
                    laptop.setScreen(screen);
                    laptop.setAnnouncementYear(Integer.parseInt(data[9]));
                    laptop.setPrice(Integer.parseInt(data[10]));

                    laptops.add(laptop);
                }
            }

            reader.close();

            return laptops;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public void save() {
        try {
            Laptop laptop = create();
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;

            if(new File(path).length() == 0) {
                data = id + "," + laptop.getModel() + "," + laptop.getColor() + "," + laptop.getCpu() + ","
                        + laptop.getHardDiscCapacity() + "," +laptop.getRam()+ ","+ laptop.getCamera() + ","
                        + laptop.getScreen().getWidth() + "," + laptop.getScreen().getHeight() + ","
                        + laptop.getAnnouncementYear() + "," + laptop.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                data = "\n" + id + "," + laptop.getModel() + "," + laptop.getColor() + "," + laptop.getCpu() + ","
                        + laptop.getHardDiscCapacity() + "," +laptop.getRam()+ ","+ laptop.getCamera() + ","
                        + laptop.getScreen().getWidth() + "," + laptop.getScreen().getHeight() + ","
                        + laptop.getAnnouncementYear() + "," + laptop.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void save(Laptop laptop) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;

            if(new File(path).length() == 0) {
                data = id + "," + laptop.getModel() + "," + laptop.getColor() + "," + laptop.getCpu() + ","
                        + laptop.getHardDiscCapacity() + "," +laptop.getRam()+ ","+ laptop.getCamera() + ","
                        + laptop.getScreen().getWidth() + "," + laptop.getScreen().getHeight() + ","
                        + laptop.getAnnouncementYear() + "," + laptop.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                data = "\n" + id + "," + laptop.getModel() + "," + laptop.getColor() + "," + laptop.getCpu() + ","
                        + laptop.getHardDiscCapacity() + "," +laptop.getRam()+ ","+ laptop.getCamera() + ","
                        + laptop.getScreen().getWidth() + "," + laptop.getScreen().getHeight() + ","
                        + laptop.getAnnouncementYear() + "," + laptop.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void update(Integer id, Laptop newLaptop) {
        List<Laptop> laptops = getAll();
        deleteAllInfoFromFile();
        for(Laptop laptop : laptops) {
            if(laptop.getId().equals(id)) {
                laptop = newLaptop;
            }
            save(laptop);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            List<Laptop> laptops = getAll();
            deleteAllInfoFromFile();
            laptops.remove(id.intValue());

            for (Laptop laptop : laptops) {
                save(laptop);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong Index");
        }
    }

}
