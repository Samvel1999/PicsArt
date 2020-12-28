package homework_4.service;

import homework_4.abstractClasses.AbstractDeviceService;
import homework_4.model.Camera;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CameraService extends AbstractDeviceService<Camera> {

    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\Camera.txt";
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
    public Camera create() {
        Scanner scanner = new Scanner(System.in);
        Camera camera = new Camera();

        System.out.println("Enter model: ");
        camera.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        camera.setColor(scanner.nextLine());

        System.out.println("Enter pixel: ");
        camera.setPixel(scanner.nextInt());

        System.out.println("Enter memory: ");
        camera.setMemory(scanner.nextInt());

        System.out.println("Enter weight: ");
        camera.setWeight(scanner.nextInt());

        System.out.println("Enter bluetooth: ");
        camera.setBluetooth(scanner.nextBoolean());

        System.out.println("Enter announcement year: ");
        camera.setAnnouncementYear(scanner.nextInt());

        System.out.println("Enter price: ");
        camera.setPrice(scanner.nextInt());

        return camera;
    }

    @Override
    public List<Camera> getAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String str;

            List<Camera> cameras = new ArrayList<>();

            while ((str = reader.readLine()) != null) {
                String[] data = str.split(",");

                Camera camera = new Camera();
                camera.setId(Integer.parseInt(data[0]));
                camera.setModel(data[1]);
                camera.setColor(data[2]);
                camera.setPixel(Integer.parseInt(data[3]));
                camera.setMemory(Integer.parseInt(data[4]));
                camera.setWeight(Integer.parseInt(data[5]));
                camera.setBluetooth(data[6].equals("bluetooth"));
                camera.setAnnouncementYear(Integer.parseInt(data[7]));
                camera.setPrice(Integer.parseInt(data[8]));

                cameras.add(camera);
            }

            reader.close();

            return cameras;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public Camera getById(Integer id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            Camera camera = new Camera();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    camera.setId(id);
                    camera.setModel(data[1]);
                    camera.setColor(data[2]);
                    camera.setPixel(Integer.parseInt(data[3]));
                    camera.setMemory(Integer.parseInt(data[4]));
                    camera.setWeight(Integer.parseInt(data[5]));
                    camera.setBluetooth(data[6].equals("bluetooth"));
                    camera.setAnnouncementYear(Integer.parseInt(data[7]));
                    camera.setPrice(Integer.parseInt(data[8]));

                    break;
                }
            }

            reader.close();

            return camera;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }

    }

    @Override
    public List<Camera> getByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;


            List<Camera> cameras = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    Camera camera = new Camera();
                    camera.setId(Integer.parseInt(data[0]));
                    camera.setModel(data[1]);
                    camera.setColor(data[2]);
                    camera.setPixel(Integer.parseInt(data[3]));
                    camera.setMemory(Integer.parseInt(data[4]));
                    camera.setWeight(Integer.parseInt(data[5]));
                    camera.setBluetooth(data[6].equals("bluetooth"));
                    camera.setAnnouncementYear(Integer.parseInt(data[7]));
                    camera.setPrice(Integer.parseInt(data[8]));

                    cameras.add(camera);
                }
            }


            reader.close();

            return cameras;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<Camera> getByColor(String color) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Camera> cameras = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    Camera camera = new Camera();
                    camera.setId(Integer.parseInt(data[0]));
                    camera.setModel(data[1]);
                    camera.setColor(data[2]);
                    camera.setPixel(Integer.parseInt(data[3]));
                    camera.setMemory(Integer.parseInt(data[4]));
                    camera.setWeight(Integer.parseInt(data[5]));
                    camera.setBluetooth(data[6].equals("bluetooth"));
                    camera.setAnnouncementYear(Integer.parseInt(data[7]));
                    camera.setPrice(Integer.parseInt(data[8]));

                    cameras.add(camera);
                }
            }


            reader.close();

            return cameras;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<Camera> getByPrice(Integer price) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Camera> cameras = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[8]) == price) {
                    Camera camera = new Camera();
                    camera.setId(Integer.parseInt(data[0]));
                    camera.setModel(data[1]);
                    camera.setColor(data[2]);
                    camera.setPixel(Integer.parseInt(data[3]));
                    camera.setMemory(Integer.parseInt(data[4]));
                    camera.setWeight(Integer.parseInt(data[5]));
                    camera.setBluetooth(data[6].equals("bluetooth"));
                    camera.setAnnouncementYear(Integer.parseInt(data[7]));
                    camera.setPrice(Integer.parseInt(data[8]));

                    cameras.add(camera);
                }
            }


            reader.close();

            return cameras;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public List<Camera> getByPixel(Integer pixel) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Camera> cameras = new ArrayList<>();


            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[3]) == pixel) {
                    Camera camera = new Camera();
                    camera.setId(Integer.parseInt(data[0]));
                    camera.setModel(data[1]);
                    camera.setColor(data[2]);
                    camera.setPixel(Integer.parseInt(data[3]));
                    camera.setMemory(Integer.parseInt(data[4]));
                    camera.setWeight(Integer.parseInt(data[5]));
                    camera.setBluetooth(data[6].equals("bluetooth"));
                    camera.setAnnouncementYear(Integer.parseInt(data[7]));
                    camera.setPrice(Integer.parseInt(data[8]));

                    cameras.add(camera);
                }
            }


            reader.close();

            return cameras;
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
            Camera camera = create();
            String bluetooth = camera.hasBluetooth()? "bluetooth" : "no bluetooth";

            if(new File(path).length() == 0) {
                data = id + "," + camera.getModel() + "," + camera.getColor() + "," + camera.getPixel() + ","
                        + camera.getMemory() + "," + camera.getWeight() + "," + bluetooth + ","
                        + camera.getAnnouncementYear() +  "," + camera.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                data = "\n" + id + "," + camera.getModel() + "," + camera.getColor() + "," + camera.getPixel() + ","
                        + camera.getMemory() + "," + camera.getWeight() + "," + bluetooth + ","
                        + camera.getAnnouncementYear() +  "," + camera.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void save(Camera camera) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            String bluetooth = camera.hasBluetooth()? "bluetooth" : "no bluetooth";

            if(new File(path).length() == 0) {
                data = id + "," + camera.getModel() + "," + camera.getColor() + "," + camera.getPixel() + ","
                        + camera.getMemory() + "," + camera.getWeight() + "," + bluetooth + ","
                        + camera.getAnnouncementYear() +  "," + camera.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                data = "\n" + id + "," + camera.getModel() + "," + camera.getColor() + "," + camera.getPixel() + ","
                        + camera.getMemory() + "," + camera.getWeight() + "," + bluetooth + ","
                        + camera.getAnnouncementYear() +  "," + camera.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void update(Integer id, Camera newCamera) {
        List<Camera> cameras = getAll();
        deleteAllInfoFromFile();
        for(Camera camera : cameras) {
            if(camera.getId().equals(id)) {
                camera = newCamera;
            }
            save(camera);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            List<Camera> cameras = getAll();
            deleteAllInfoFromFile();
            cameras.remove(id.intValue());

            for (Camera camera : cameras) {
                save(camera);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong Index");
        }
    }

}
