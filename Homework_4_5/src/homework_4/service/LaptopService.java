package homework_4.service;

import homework_4.model.Laptop;
import homework_4.model.Screen;
import homework_4.model.interfaces.CallingDevice;
import homework_4.model.interfaces.GamingDevice;
import homework_4.model.interfaces.MusicDevice;

import java.io.*;
import java.util.Scanner;

public class LaptopService implements MusicDevice, GamingDevice, CallingDevice {
    private static String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\Laptop.txt";
    private static int id = 0;

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

    public void save() {
        try {
            Laptop laptop = create();
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;

            if(new File(path).length() == 0) {
                id++;
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
                id++;
                data = "\n" + id + "," + laptop.getModel() + "," + laptop.getColor() + "," + laptop.getCpu() + ","
                        + laptop.getHardDiscCapacity() + "," +laptop.getRam()+ ","+ laptop.getCamera() + ","
                        + laptop.getScreen().getWidth() + "," + laptop.getScreen().getHeight() + ","
                        + laptop.getAnnouncementYear() + "," + laptop.getPrice();
            }
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    public Laptop[] getAll() {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while(reader1.readLine() != null) {
                n++;
            }

            reader1.close();

            Laptop[] laptops = new Laptop[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                laptops[i] = new Laptop();
                laptops[i].setModel(data[1]);
                laptops[i].setColor(data[2]);
                laptops[i].setCpu(data[3]);
                laptops[i].setHardDiscCapacity(Integer.parseInt(data[4]));
                laptops[i].setRam(Integer.parseInt(data[5]));
                laptops[i].setCamera(Integer.parseInt(data[6]));
                Screen screen = new Screen();
                screen.setWidth(Integer.parseInt(data[7]));
                screen.setHeight(Integer.parseInt(data[8]));
                laptops[i].setScreen(screen);
                laptops[i].setAnnouncementYear(Integer.parseInt(data[9]));
                laptops[i].setPrice(Integer.parseInt(data[10]));
                i++;
            }

            reader2.close();
            return laptops;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Laptop getById(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            Laptop laptop = new Laptop();
            int i = 0;

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

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

    public Laptop[] getByPrice(int price) {
        try {
            BufferedReader userReader1 = new BufferedReader(new FileReader(path));
            BufferedReader userReader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = userReader1.readLine()) != null) {
                String[] data = s.split(",");
                if(Integer.parseInt(data[10]) == price) {
                    n++;
                }
            }

            Laptop[] laptops = new Laptop[n];
            int i = 0;

            while ((s = userReader2.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[10]) == price) {
                    laptops[i] = new Laptop();
                    laptops[i].setModel(data[1]);
                    laptops[i].setColor(data[2]);
                    laptops[i].setCpu(data[3]);
                    laptops[i].setHardDiscCapacity(Integer.parseInt(data[4]));
                    laptops[i].setRam(Integer.parseInt(data[5]));
                    laptops[i].setCamera(Integer.parseInt(data[6]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[7]));
                    screen.setHeight(Integer.parseInt(data[8]));
                    laptops[i].setScreen(screen);
                    laptops[i].setAnnouncementYear(Integer.parseInt(data[9]));
                    laptops[i].setPrice(Integer.parseInt(data[10]));
                    i++;
                }
            }

            userReader1.close();
            userReader2.close();

            return laptops;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Laptop[] getByModel(String model) {
        try {
            BufferedReader userReader1 = new BufferedReader(new FileReader(path));
            BufferedReader userReader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = userReader1.readLine()) != null) {
                String[] data = s.split(",");
                if(data[1].equals(model)) {
                    n++;
                }
            }

            Laptop[] laptops = new Laptop[n];
            int i = 0;

            while ((s = userReader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    laptops[i] = new Laptop();
                    laptops[i].setModel(data[1]);
                    laptops[i].setColor(data[2]);
                    laptops[i].setCpu(data[3]);
                    laptops[i].setHardDiscCapacity(Integer.parseInt(data[4]));
                    laptops[i].setRam(Integer.parseInt(data[5]));
                    laptops[i].setCamera(Integer.parseInt(data[6]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[7]));
                    screen.setHeight(Integer.parseInt(data[8]));
                    laptops[i].setScreen(screen);
                    laptops[i].setAnnouncementYear(Integer.parseInt(data[9]));
                    laptops[i].setPrice(Integer.parseInt(data[10]));
                    i++;
                }
            }

            userReader1.close();
            userReader2.close();

            return laptops;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Laptop[] getByColor(String color) {
        try {
            BufferedReader userReader1 = new BufferedReader(new FileReader(path));
            BufferedReader userReader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = userReader1.readLine()) != null) {
                String[] data = s.split(",");
                if(data[2].equals(color)) {
                    n++;
                }
            }

            Laptop[] laptops = new Laptop[n];
            int i = 0;

            while ((s = userReader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    laptops[i] = new Laptop();
                    laptops[i].setModel(data[1]);
                    laptops[i].setColor(data[2]);
                    laptops[i].setCpu(data[3]);
                    laptops[i].setHardDiscCapacity(Integer.parseInt(data[4]));
                    laptops[i].setRam(Integer.parseInt(data[5]));
                    laptops[i].setCamera(Integer.parseInt(data[6]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[7]));
                    screen.setHeight(Integer.parseInt(data[8]));
                    laptops[i].setScreen(screen);
                    laptops[i].setAnnouncementYear(Integer.parseInt(data[9]));
                    laptops[i].setPrice(Integer.parseInt(data[10]));
                    i++;
                }
            }

            userReader1.close();
            userReader2.close();

            return laptops;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Laptop[] getByRam(int ram) {
        try {
            BufferedReader userReader1 = new BufferedReader(new FileReader(path));
            BufferedReader userReader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = userReader1.readLine()) != null) {
                String[] data = s.split(",");
                if(Integer.parseInt(data[5]) == ram) {
                    n++;
                }
            }

            userReader1.close();
            Laptop[] laptops = new Laptop[n];
            int i = 0;

            while ((s = userReader2.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[5]) == ram) {
                    laptops[i] = new Laptop();
                    laptops[i].setModel(data[1]);
                    laptops[i].setColor(data[2]);
                    laptops[i].setCpu(data[3]);
                    laptops[i].setHardDiscCapacity(Integer.parseInt(data[4]));
                    laptops[i].setRam(Integer.parseInt(data[5]));
                    laptops[i].setCamera(Integer.parseInt(data[6]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[7]));
                    screen.setHeight(Integer.parseInt(data[8]));
                    laptops[i].setScreen(screen);
                    laptops[i].setAnnouncementYear(Integer.parseInt(data[9]));
                    laptops[i].setPrice(Integer.parseInt(data[10]));
                    i++;
                }
            }

            userReader2.close();

            return laptops;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public void print(Laptop[] laptops) {
        for(Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    @Override
    public void listenToMusic() {

        System.out.println("Listen to music with Laptop");
    }


    @Override
    public void audiCall() {

        System.out.println("Audio call with laptop");
    }

    @Override
    public void videoCall() {
        System.out.println("Video call with laptop");
    }

    @Override
    public void play() {
        System.out.println("Playing game with laptop");
    }

    @Override
    public void downloadGame() {
        System.out.println("Download game into laptop");
    }

    @Override
    public void deleteGame() {
        System.out.println("Delete game from laptop");
    }

    @Override
    public void connectToTheInternet() {

        System.out.println("Laptop is connected to the Internet");
    }

    @Override
    public void disconnectFromTheInternet() {
        System.out.println("Laptop is disconnected from the Internet");
    }
}
