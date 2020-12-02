package homework_4.service;

import homework_4.model.Screen;
import homework_4.model.TV;

import java.io.*;
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

    public TV[] getAll() {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while(reader1.readLine() != null) {
                n++;
            }

            reader1.close();
            TV[] tvs = new TV[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                tvs[i] = new TV();
                tvs[i].setModel(data[1]);
                tvs[i].setColor(data[2]);
                tvs[i].setSmart(data[3].equals("Is smart"));
                Screen screen = new Screen();
                screen.setWidth(Integer.parseInt(data[4]));
                screen.setHeight(Integer.parseInt(data[5]));
                tvs[i].setScreen(screen);
                tvs[i].setAnnouncementYear(Integer.parseInt(data[6]));
                tvs[i].setPrice(Integer.parseInt(data[7]));
                i++;
            }

            reader2.close();
            return tvs;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
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

    public TV[] getByPrice(int price) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(Integer.parseInt(data[7]) == price) {
                    n++;
                }
            }
            reader1.close();

            TV[] tvs = new TV[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[7]) == price) {
                    tvs[i] = new TV();
                    tvs[i].setModel(data[1]);
                    tvs[i].setColor(data[2]);
                    tvs[i].setSmart(data[3].equals("Is smart"));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[4]));
                    screen.setHeight(Integer.parseInt(data[5]));
                    tvs[i].setScreen(screen);
                    tvs[i].setAnnouncementYear(Integer.parseInt(data[6]));
                    tvs[i].setPrice(Integer.parseInt(data[7]));
                    i++;
                }
            }


            reader2.close();

            return tvs;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public TV[] getByModel(String model) {
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

            TV[] tvs = new TV[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    tvs[i] = new TV();
                    tvs[i].setModel(data[1]);
                    tvs[i].setColor(data[2]);
                    tvs[i].setSmart(data[3].equals("Is smart"));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[4]));
                    screen.setHeight(Integer.parseInt(data[5]));
                    tvs[i].setScreen(screen);
                    tvs[i].setAnnouncementYear(Integer.parseInt(data[6]));
                    tvs[i].setPrice(Integer.parseInt(data[7]));
                    i++;
                }
            }


            reader2.close();

            return tvs;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public TV[] getBySmart(boolean isSmart) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;
            String smart = isSmart? "Is smart" : "Is not smart";

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(data[3].equals(smart)) {
                    n++;
                }
            }
            reader1.close();

            TV[] tvs = new TV[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[3].equals(smart)) {
                    tvs[i] = new TV();
                    tvs[i].setModel(data[1]);
                    tvs[i].setColor(data[2]);
                    tvs[i].setSmart(isSmart);
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[4]));
                    screen.setHeight(Integer.parseInt(data[5]));
                    tvs[i].setScreen(screen);
                    tvs[i].setAnnouncementYear(Integer.parseInt(data[6]));
                    tvs[i].setPrice(Integer.parseInt(data[7]));
                    i++;
                }
            }


            reader2.close();

            return tvs;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public void print(TV[] tvs) {
        for(TV tv : tvs) {
            System.out.println(tv);
        }
    }

}
