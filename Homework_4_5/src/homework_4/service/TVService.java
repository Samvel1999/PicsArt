package homework_4.service;

import homework_4.abstractClasses.AbstractDeviceService;
import homework_4.model.Screen;
import homework_4.model.TV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TVService extends AbstractDeviceService<TV> {
    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\TV.txt";
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
    public TV create() {
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

    @Override
    public List<TV> getAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<TV> tvs = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                TV tv = new TV();
                tv.setId(Integer.parseInt(data[0]));
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

    @Override
    public TV getById(Integer id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            TV tv = new TV();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    tv.setId(id);
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

    @Override
    public List<TV> getByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<TV> tvs = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {

                    TV tv = new TV();
                    tv.setId(Integer.parseInt(data[0]));
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

    @Override
    public List<TV> getByColor(String color) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<TV> tvs = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    TV tv = new TV();
                    tv.setId(Integer.parseInt(data[0]));
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

    @Override
    public List<TV> getByPrice(Integer price) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<TV> tvs = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[7]) == price) {

                    TV tv = new TV();
                    tv.setId(Integer.parseInt(data[0]));
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

    public List<TV> getBySmart(Boolean isSmart) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<TV> tvs = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if((data[3].equals("is smart") && isSmart) ||
                        (data[3].equals("is not smart") && !isSmart)){

                    TV tv = new TV();
                    tv.setId(Integer.parseInt(data[0]));
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

    @Override
    public void save() {
        try {
            TV tv = create();
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            String smart = tv.isSmart() ? "Is smart" : "Is not smart";

            if(new File(path).length() == 0) {
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
                data = "\n" + id + "," + tv.getModel() + "," + tv.getColor()+ "," + smart + "," + tv.getScreen().getWidth() +
                        "," + tv.getScreen().getHeight() + "," + tv.getAnnouncementYear() + "," + tv.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void save(TV tv) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            String smart = tv.isSmart() ? "Is smart" : "Is not smart";

            if(new File(path).length() == 0) {
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
                data = "\n" + id + "," + tv.getModel() + "," + tv.getColor()+ "," + smart + "," + tv.getScreen().getWidth() +
                        "," + tv.getScreen().getHeight() + "," + tv.getAnnouncementYear() + "," + tv.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void update(Integer id, TV newTV) {
        List<TV> tvs = getAll();
        deleteAllInfoFromFile();
        for(TV tv : tvs) {
            if(tv.getId().equals(id)) {
                tv = newTV;
            }
            save(tv);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            List<TV> tvs = getAll();
            deleteAllInfoFromFile();
            tvs.remove(id.intValue());

            for (TV tv : tvs) {
                save(tv);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong Index");
        }
    }
}
