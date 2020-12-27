package homework_4.service;

import homework_4.model.Screen;
import homework_4.model.TV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TVService {
    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\TV.txt";
    private static int id = 0;

    private TV create() {
        Scanner scanner = new Scanner(System.in);
        TV tv = new TV();

        System.out.println("Enter model: ");
        tv.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        tv.setColor(scanner.nextLine());

        System.out.println("Enter smart: ");
        tv.setSmart(scanner.nextBoolean());

        System.out.println("Enter width of screen: ");
        tv.getScreen().setWidth(scanner.nextInt());

        System.out.println("Enter height of screen: ");
        tv.getScreen().setHeight(scanner.nextInt());

        System.out.println("Enter announcement year: ");
        tv.setAnnouncementYear(scanner.nextInt());

        System.out.println("Enter price: ");
        tv.setPrice(scanner.nextInt());

        return tv;
    }

    public void save() {
        try {
            TV tv = create();
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            String smart;
            if(tv.isSmart()) {
                smart = "Is smart";
            }
            else {
                smart = "Is not smart";
            }

            if(new File(path).length() == 0) {
                id++;
                data = id + "," + tv.getModel() + "," + tv.getColor()+ "," + smart + "," + tv.getScreen().getWidth() +
                        "," + tv.getScreen().getHeight() + "," + tv.getAnnouncementYear() + "," + tv.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                id++;
                data = "\n" + id + "," + tv.getModel() + "," + tv.getColor()+ "," + smart + "," + tv.getScreen().getWidth() +
                        "," + tv.getScreen().getHeight() + "," + tv.getAnnouncementYear() + "," + tv.getPrice();
            }
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    public List<TV> getAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<TV> tvs = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                TV tv = new TV();
                tv.setModel(data[1]);
                tv.setColor(data[2]);
                tv.setSmart(data[3].equals("Is smart"));
                Screen screen = new Screen();
                screen.setWidth(Integer.parseInt(data[4]));
                screen.setHeight(Integer.parseInt(data[5]));
                tv.setScreen(screen);
                tv.setAnnouncementYear(Integer.parseInt(data[6]));
                tv.setPrice(Integer.parseInt(data[7]));

                tvs.add(tv);
            }

            reader.close();
            return tvs;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public TV getById(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            TV tv = new TV();
            int i = 0;

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    tv.setModel(data[1]);
                    tv.setColor(data[2]);
                    tv.setSmart(data[3].equals("Is smart"));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[4]));
                    screen.setHeight(Integer.parseInt(data[5]));
                    tv.setScreen(screen);
                    tv.setAnnouncementYear(Integer.parseInt(data[6]));
                    tv.setPrice(Integer.parseInt(data[7]));
                    break;
                }
            }

            reader.close();

            return tv;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public List<TV> getByPrice(int price) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<TV> tvs = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[7]) == price) {

                    TV tv = new TV();
                    tv.setModel(data[1]);
                    tv.setColor(data[2]);
                    tv.setSmart(data[3].equals("Is smart"));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[4]));
                    screen.setHeight(Integer.parseInt(data[5]));
                    tv.setScreen(screen);
                    tv.setAnnouncementYear(Integer.parseInt(data[6]));
                    tv.setPrice(Integer.parseInt(data[7]));

                    tvs.add(tv);
                }
            }


            reader.close();

            return tvs;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public List<TV> getByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<TV> tvs = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {

                    TV tv = new TV();
                    tv.setModel(data[1]);
                    tv.setColor(data[2]);
                    tv.setSmart(data[3].equals("Is smart"));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[4]));
                    screen.setHeight(Integer.parseInt(data[5]));
                    tv.setScreen(screen);
                    tv.setAnnouncementYear(Integer.parseInt(data[6]));
                    tv.setPrice(Integer.parseInt(data[7]));

                    tvs.add(tv);
                }
            }


            reader.close();

            return tvs;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public List<TV> getBySmart(boolean isSmart) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<TV> tvs = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Boolean.parseBoolean(data[3]) == isSmart) {

                    TV tv = new TV();
                    tv.setModel(data[1]);
                    tv.setColor(data[2]);
                    tv.setSmart(isSmart);
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[4]));
                    screen.setHeight(Integer.parseInt(data[5]));
                    tv.setScreen(screen);
                    tv.setAnnouncementYear(Integer.parseInt(data[6]));
                    tv.setPrice(Integer.parseInt(data[7]));

                    tvs.add(tv);
                }
            }


            reader.close();

            return tvs;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public void print(List<TV> tvs) {
        for(TV tv : tvs) {
            System.out.println(tv);
        }
    }

}
