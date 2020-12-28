package homework_4.service;

import homework_4.abstractClasses.AbstractDeviceService;
import homework_4.model.Mobile;
import homework_4.model.Screen;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobileService extends AbstractDeviceService<Mobile> {

    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\Mobile.txt";
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

    @Override
    public List<Mobile> getAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Mobile> mobiles = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                Mobile mobile = new Mobile();
                mobile.setId(Integer.parseInt(data[0]));
                mobile.setModel(data[1]);
                mobile.setColor(data[2]);
                mobile.setOs(data[3]);
                mobile.setRam(Integer.parseInt(data[4]));
                mobile.setMemory(Integer.parseInt(data[5]));
                mobile.setFrontCamera(Integer.parseInt(data[6]));
                mobile.setMainCamera(Integer.parseInt(data[7]));
                mobile.setBatteryCapacity(Integer.parseInt(data[8]));
                Screen screen = new Screen();
                screen.setWidth(Integer.parseInt(data[9]));
                screen.setHeight(Integer.parseInt(data[10]));
                mobile.setScreen(screen);
                mobile.setAnnouncementYear(Integer.parseInt(data[11]));
                mobile.setPrice(Integer.parseInt(data[12]));

                mobiles.add(mobile);
            }

            reader.close();

            return mobiles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public Mobile getById(Integer id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            Mobile mobile = new Mobile();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    mobile.setId(id);
                    mobile.setModel(data[1]);
                    mobile.setColor(data[2]);
                    mobile.setOs(data[3]);
                    mobile.setRam(Integer.parseInt(data[4]));
                    mobile.setMemory(Integer.parseInt(data[5]));
                    mobile.setFrontCamera(Integer.parseInt(data[6]));
                    mobile.setMainCamera(Integer.parseInt(data[7]));
                    mobile.setBatteryCapacity(Integer.parseInt(data[8]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[9]));
                    screen.setHeight(Integer.parseInt(data[10]));
                    mobile.setScreen(screen);
                    mobile.setAnnouncementYear(Integer.parseInt(data[11]));
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

    @Override
    public List<Mobile> getByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Mobile> mobiles = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    Mobile mobile = new Mobile();
                    mobile.setId(Integer.parseInt(data[0]));
                    mobile.setModel(data[1]);
                    mobile.setColor(data[2]);
                    mobile.setOs(data[3]);
                    mobile.setRam(Integer.parseInt(data[4]));
                    mobile.setMemory(Integer.parseInt(data[5]));
                    mobile.setFrontCamera(Integer.parseInt(data[6]));
                    mobile.setMainCamera(Integer.parseInt(data[7]));
                    mobile.setBatteryCapacity(Integer.parseInt(data[8]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[9]));
                    screen.setHeight(Integer.parseInt(data[10]));
                    mobile.setScreen(screen);
                    mobile.setAnnouncementYear(Integer.parseInt(data[11]));
                    mobile.setPrice(Integer.parseInt(data[12]));


                    mobiles.add(mobile);
                }
            }


            reader.close();

            return mobiles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<Mobile> getByColor(String color) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Mobile> mobiles = new ArrayList<>();


            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    Mobile mobile = new Mobile();
                    mobile.setId(Integer.parseInt(data[0]));
                    mobile.setModel(data[1]);
                    mobile.setColor(data[2]);
                    mobile.setOs(data[3]);
                    mobile.setRam(Integer.parseInt(data[4]));
                    mobile.setMemory(Integer.parseInt(data[5]));
                    mobile.setFrontCamera(Integer.parseInt(data[6]));
                    mobile.setMainCamera(Integer.parseInt(data[7]));
                    mobile.setBatteryCapacity(Integer.parseInt(data[8]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[9]));
                    screen.setHeight(Integer.parseInt(data[10]));
                    mobile.setScreen(screen);
                    mobile.setAnnouncementYear(Integer.parseInt(data[11]));
                    mobile.setPrice(Integer.parseInt(data[12]));

                    mobiles.add(mobile);
                }
            }


            reader.close();

            return mobiles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<Mobile> getByPrice(Integer price) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Mobile> mobiles = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[12]) == price) {
                    Mobile mobile = new Mobile();
                    mobile.setId(Integer.parseInt(data[0]));
                    mobile.setModel(data[1]);
                    mobile.setColor(data[2]);
                    mobile.setOs(data[3]);
                    mobile.setRam(Integer.parseInt(data[4]));
                    mobile.setMemory(Integer.parseInt(data[5]));
                    mobile.setFrontCamera(Integer.parseInt(data[6]));
                    mobile.setMainCamera(Integer.parseInt(data[7]));
                    mobile.setBatteryCapacity(Integer.parseInt(data[8]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[9]));
                    screen.setHeight(Integer.parseInt(data[10]));
                    mobile.setScreen(screen);
                    mobile.setAnnouncementYear(Integer.parseInt(data[11]));
                    mobile.setPrice(Integer.parseInt(data[12]));


                    mobiles.add(mobile);
                }
            }


            reader.close();

            return mobiles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public List<Mobile> getByRam(Integer ram) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;


            List<Mobile> mobiles = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[4]) == ram) {
                    Mobile mobile = new Mobile();
                    mobile.setId(Integer.parseInt(data[0]));
                    mobile.setModel(data[1]);
                    mobile.setColor(data[2]);
                    mobile.setOs(data[3]);
                    mobile.setRam(Integer.parseInt(data[4]));
                    mobile.setMemory(Integer.parseInt(data[5]));
                    mobile.setFrontCamera(Integer.parseInt(data[6]));
                    mobile.setMainCamera(Integer.parseInt(data[7]));
                    mobile.setBatteryCapacity(Integer.parseInt(data[8]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[9]));
                    screen.setHeight(Integer.parseInt(data[10]));
                    mobile.setScreen(screen);
                    mobile.setAnnouncementYear(Integer.parseInt(data[11]));
                    mobile.setPrice(Integer.parseInt(data[12]));

                    mobiles.add(mobile);
                }
            }


            reader.close();

            return mobiles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public List<Mobile> getByOs(String os) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Mobile> mobiles = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[3].equals(os)) {
                    Mobile mobile = new Mobile();
                    mobile.setId(Integer.parseInt(data[0]));
                    mobile.setModel(data[1]);
                    mobile.setColor(data[2]);
                    mobile.setOs(data[3]);
                    mobile.setRam(Integer.parseInt(data[4]));
                    mobile.setMemory(Integer.parseInt(data[5]));
                    mobile.setFrontCamera(Integer.parseInt(data[6]));
                    mobile.setMainCamera(Integer.parseInt(data[7]));
                    mobile.setBatteryCapacity(Integer.parseInt(data[8]));
                    Screen screen = new Screen();
                    screen.setWidth(Integer.parseInt(data[9]));
                    screen.setHeight(Integer.parseInt(data[10]));
                    mobile.setScreen(screen);
                    mobile.setAnnouncementYear(Integer.parseInt(data[11]));
                    mobile.setPrice(Integer.parseInt(data[12]));

                    mobiles.add(mobile);
                }
            }


            reader.close();

            return mobiles;
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
            Mobile mobile = create();

            if(new File(path).length() == 0) {
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
                data = "\n" + id + "," + mobile.getModel() + "," + mobile.getColor() + "," + mobile.getOs() + ","
                        + mobile.getRam() + "," +mobile.getMemory() + "," + mobile.getFrontCamera() + ","
                        + mobile.getMainCamera() + "," + mobile.getBatteryCapacity() + ","
                        + mobile.getScreen().getWidth() + ","  + mobile.getScreen().getHeight() + ","
                        + mobile.getAnnouncementYear()  + "," + mobile.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void save(Mobile mobile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;

            if(new File(path).length() == 0) {
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
                data = "\n" + id + "," + mobile.getModel() + "," + mobile.getColor() + "," + mobile.getOs() + ","
                        + mobile.getRam() + "," +mobile.getMemory() + "," + mobile.getFrontCamera() + ","
                        + mobile.getMainCamera() + "," + mobile.getBatteryCapacity() + ","
                        + mobile.getScreen().getWidth() + ","  + mobile.getScreen().getHeight() + ","
                        + mobile.getAnnouncementYear()  + "," + mobile.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void update(Integer id, Mobile newMobile) {
        List<Mobile> mobiles = getAll();
        deleteAllInfoFromFile();
        for(Mobile mobile : mobiles) {
            if(mobile.getId().equals(id)) {
                mobile = newMobile;
            }
            save(mobile);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            List<Mobile> mobiles = getAll();
            deleteAllInfoFromFile();
            mobiles.remove(id.intValue());

            for (Mobile mobile : mobiles) {
                save(mobile);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong Index");
        }
    }
}
