package homework_4.service;

import homework_4.model.Mobile;
import homework_4.model.Screen;
import homework_4.model.interfaces.CallingDevice;
import homework_4.model.interfaces.GamingDevice;
import homework_4.model.interfaces.MusicDevice;
import homework_4.model.interfaces.ShootingDevice;

import java.io.*;
import java.util.Scanner;

public class MobileService implements MusicDevice, GamingDevice, CallingDevice, ShootingDevice {

    private static String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\DataBase\\Mobile.txt";
    private static int id = 0;

    public Mobile create() {
        Scanner scanner = new Scanner(System.in);
        Mobile mobile = new Mobile();

        System.out.println("Enter model: ");
        mobile.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        mobile.setColor(scanner.nextLine());

        System.out.println("Enter OS: ");
        mobile.setOs(scanner.nextLine());

        System.out.println("Enter ram: ");
        mobile.setRam(scanner.nextInt());

        System.out.println("Enter memory: ");
        mobile.setMemory(scanner.nextInt());

        System.out.println("Enter front camera: ");
        mobile.setFrontCamera(scanner.nextInt());

        System.out.println("Enter main camera: ");
        mobile.setMainCamera(scanner.nextInt());

        System.out.println("Enter battery capacity: ");
        mobile.setBatteryCapacity(scanner.nextInt());

        System.out.println("Enter width of screen: ");
        mobile.getScreen().setWidth(scanner.nextInt());

        System.out.println("Enter height of screen: ");
        mobile.getScreen().setHeight(scanner.nextInt());

        System.out.println("Enter announcement year: ");
        mobile.setAnnouncementYear(scanner.nextInt());

        System.out.println("Enter price: ");
        mobile.setPrice(scanner.nextInt());

        return mobile;
    }

    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            Mobile mobile = create();

            if(new File(path).length() == 0) {
                id++;
                data = id + "," + mobile.getModel() + "," + mobile.getColor() + "," + mobile.getOs() + ","
                        + mobile.getRam() + "," +mobile.getMemory() + "," + mobile.getFrontCamera() + ","
                        + mobile.getMainCamera() + "," + mobile.getBatteryCapacity() + ","
                        + mobile.getScreen().getWidth() + ","  + mobile.getScreen().getHeight() + ","
                        + mobile.getAnnouncementYear()  + "," + mobile.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                id++;
                data = "\n" + id + "," + mobile.getModel() + "," + mobile.getColor() + "," + mobile.getOs() + ","
                        + mobile.getRam() + "," +mobile.getMemory() + "," + mobile.getFrontCamera() + ","
                        + mobile.getMainCamera() + "," + mobile.getBatteryCapacity() + ","
                        + mobile.getScreen().getWidth() + ","  + mobile.getScreen().getHeight() + ","
                        + mobile.getAnnouncementYear()  + "," + mobile.getPrice();
            }
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    public Mobile[] getAll() {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while(reader1.readLine() != null) {
                n++;
            }

            Mobile[] mobiles = new Mobile[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                mobiles[i] = new Mobile();
                mobiles[i].setModel(data[1]);
                mobiles[i].setColor(data[2]);
                mobiles[i].setOs(data[3]);
                mobiles[i].setRam(Integer.parseInt(data[4]));
                mobiles[i].setMemory(Integer.parseInt(data[5]));
                mobiles[i].setFrontCamera(Integer.parseInt(data[6]));
                mobiles[i].setMainCamera(Integer.parseInt(data[7]));
                mobiles[i].setBatteryCapacity(Integer.parseInt(data[8]));
                mobiles[i].setAnnouncementYear(Integer.parseInt(data[9]));
                Screen screen = new Screen();
                screen.setWidth(Integer.parseInt(data[10]));
                screen.setHeight(Integer.parseInt(data[11]));
                mobiles[i].setScreen(screen);
                mobiles[i].setPrice(Integer.parseInt(data[12]));
                i++;
            }

            reader1.close();
            reader2.close();

            return mobiles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Mobile getById(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            Mobile mobile = new Mobile();
            int i = 0;

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    mobile.setModel(data[1]);
                    mobile.setColor(data[2]);
                    mobile.setOs(data[3]);
                    mobile.setRam(Integer.parseInt(data[4]));
                    mobile.setMemory(Integer.parseInt(data[5]));
                    mobile.setFrontCamera(Integer.parseInt(data[6]));
                    mobile.setMainCamera(Integer.parseInt(data[7]));
                    mobile.setBatteryCapacity(Integer.parseInt(data[8]));
                    mobile.setAnnouncementYear(Integer.parseInt(data[9]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[10]));
                    screen.setHeight(Integer.parseInt(data[11]));
                    mobile.setScreen(screen);
                    mobile.setPrice(Integer.parseInt(data[12]));

                    break;
                }
            }

            reader.close();

            return mobile;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }

    }

    public Mobile[] getByModel(String model) {
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

            Mobile[] mobiles = new Mobile[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    mobiles[i] = new Mobile();
                    mobiles[i].setModel(data[1]);
                    mobiles[i].setColor(data[2]);
                    mobiles[i].setOs(data[3]);
                    mobiles[i].setRam(Integer.parseInt(data[4]));
                    mobiles[i].setMemory(Integer.parseInt(data[5]));
                    mobiles[i].setFrontCamera(Integer.parseInt(data[6]));
                    mobiles[i].setMainCamera(Integer.parseInt(data[7]));
                    mobiles[i].setBatteryCapacity(Integer.parseInt(data[8]));
                    mobiles[i].setAnnouncementYear(Integer.parseInt(data[9]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[10]));
                    screen.setHeight(Integer.parseInt(data[11]));
                    mobiles[i].setScreen(screen);
                    mobiles[i].setPrice(Integer.parseInt(data[12]));

                    i++;
                }
            }


            reader2.close();

            return mobiles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Mobile[] getByRam(int ram) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(Integer.parseInt(data[4]) == ram) {
                    n++;
                }
            }
            reader1.close();

            Mobile[] mobiles = new Mobile[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[4]) == ram) {
                    mobiles[i] = new Mobile();
                    mobiles[i].setModel(data[1]);
                    mobiles[i].setColor(data[2]);
                    mobiles[i].setOs(data[3]);
                    mobiles[i].setRam(Integer.parseInt(data[4]));
                    mobiles[i].setMemory(Integer.parseInt(data[5]));
                    mobiles[i].setFrontCamera(Integer.parseInt(data[6]));
                    mobiles[i].setMainCamera(Integer.parseInt(data[7]));
                    mobiles[i].setBatteryCapacity(Integer.parseInt(data[8]));
                    mobiles[i].setAnnouncementYear(Integer.parseInt(data[9]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[10]));
                    screen.setHeight(Integer.parseInt(data[11]));
                    mobiles[i].setScreen(screen);
                    mobiles[i].setPrice(Integer.parseInt(data[12]));

                    i++;
                }
            }


            reader2.close();

            return mobiles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Mobile[] getByPrice(int price) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(Integer.parseInt(data[12]) == price) {
                    n++;
                }
            }
            reader1.close();

            Mobile[] mobiles = new Mobile[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[12]) == price) {
                    mobiles[i] = new Mobile();
                    mobiles[i].setModel(data[1]);
                    mobiles[i].setColor(data[2]);
                    mobiles[i].setOs(data[3]);
                    mobiles[i].setRam(Integer.parseInt(data[4]));
                    mobiles[i].setMemory(Integer.parseInt(data[5]));
                    mobiles[i].setFrontCamera(Integer.parseInt(data[6]));
                    mobiles[i].setMainCamera(Integer.parseInt(data[7]));
                    mobiles[i].setBatteryCapacity(Integer.parseInt(data[8]));
                    mobiles[i].setAnnouncementYear(Integer.parseInt(data[9]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[10]));
                    screen.setHeight(Integer.parseInt(data[11]));
                    mobiles[i].setScreen(screen);
                    mobiles[i].setPrice(Integer.parseInt(data[12]));

                    i++;
                }
            }


            reader2.close();

            return mobiles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Mobile[] getByColor(String color) {
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

            Mobile[] mobiles = new Mobile[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    mobiles[i] = new Mobile();
                    mobiles[i].setModel(data[1]);
                    mobiles[i].setColor(data[2]);
                    mobiles[i].setOs(data[3]);
                    mobiles[i].setRam(Integer.parseInt(data[4]));
                    mobiles[i].setMemory(Integer.parseInt(data[5]));
                    mobiles[i].setFrontCamera(Integer.parseInt(data[6]));
                    mobiles[i].setMainCamera(Integer.parseInt(data[7]));
                    mobiles[i].setBatteryCapacity(Integer.parseInt(data[8]));
                    mobiles[i].setAnnouncementYear(Integer.parseInt(data[9]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[10]));
                    screen.setHeight(Integer.parseInt(data[11]));
                    mobiles[i].setScreen(screen);
                    mobiles[i].setPrice(Integer.parseInt(data[12]));

                    i++;
                }
            }


            reader2.close();

            return mobiles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Mobile[] getByOs(String os) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(data[3].equals(os)) {
                    n++;
                }
            }
            reader1.close();

            Mobile[] mobiles = new Mobile[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[3].equals(os)) {
                    mobiles[i] = new Mobile();
                    mobiles[i].setModel(data[1]);
                    mobiles[i].setColor(data[2]);
                    mobiles[i].setOs(data[3]);
                    mobiles[i].setRam(Integer.parseInt(data[4]));
                    mobiles[i].setMemory(Integer.parseInt(data[5]));
                    mobiles[i].setFrontCamera(Integer.parseInt(data[6]));
                    mobiles[i].setMainCamera(Integer.parseInt(data[7]));
                    mobiles[i].setBatteryCapacity(Integer.parseInt(data[8]));
                    mobiles[i].setAnnouncementYear(Integer.parseInt(data[9]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[10]));
                    screen.setHeight(Integer.parseInt(data[11]));
                    mobiles[i].setScreen(screen);
                    mobiles[i].setPrice(Integer.parseInt(data[12]));

                    i++;
                }
            }


            reader2.close();

            return mobiles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public void print(Mobile[] mobiles) {
        for(Mobile mobile : mobiles) {
            System.out.println(mobile);
        }
    }

    @Override
    public void audiCall() {
        System.out.println("Audio call with mobile");
    }

    @Override
    public void videoCall() {
        System.out.println("Video call with mobile");
    }

    @Override
    public void play() {
        System.out.println("Playing game with mobile");
    }

    @Override
    public void downloadGame() {
        System.out.println("Download game into mobile");

    }

    @Override
    public void deleteGame() {
        System.out.println("Delete game from mobile");
    }

    @Override
    public void connectToTheInternet() {
        System.out.println("Mobile is connected to the Internet");

    }

    @Override
    public void disconnectFromTheInternet() {
        System.out.println("obile is disconnected from the Internet");

    }

    @Override
    public void listenToMusic() {
        System.out.println("Listen to music with mobile");
    }

    @Override
    public void takePhoto() {
        System.out.println("Take a photo with mobile");
    }

    @Override
    public void takeVideo() {
        System.out.println("Take a video with mobile");
    }

}
