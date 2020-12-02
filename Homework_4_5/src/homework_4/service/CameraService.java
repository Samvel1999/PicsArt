package homework_4.service;

import homework_4.model.Camera;
import homework_4.model.interfaces.ShootingDevice;

import java.io.*;
import java.util.Scanner;

public class CameraService implements ShootingDevice {

    private static String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\Camera.txt";
    private static int id = 0;

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

    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            Camera camera = create();
            String bluetooth = camera.hasBluetooth()? "bluetooth" : "no bluetooth";

            if(new File(path).length() == 0) {
                id++;
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
                id++;
                data = "\n" + id + "," + camera.getModel() + "," + camera.getColor() + "," + camera.getPixel() + ","
                        + camera.getMemory() + "," + camera.getWeight() + "," + bluetooth + ","
                        + camera.getAnnouncementYear() +  "," + camera.getPrice();
            }
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    public Camera[] getAll() {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while(reader1.readLine() != null) {
                n++;
            }

            Camera[] cameras = new Camera[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                cameras[i] = new Camera();
                cameras[i].setModel(data[1]);
                cameras[i].setColor(data[2]);
                cameras[i].setPixel(Integer.parseInt(data[3]));
                cameras[i].setMemory(Integer.parseInt(data[4]));
                cameras[i].setWeight(Integer.parseInt(data[5]));
                cameras[i].setBluetooth(data[6].equals("bluetooth"));
                cameras[i].setAnnouncementYear(Integer.parseInt(data[7]));
                cameras[i].setPrice(Integer.parseInt(data[8]));
                i++;
            }

            reader1.close();
            reader2.close();

            return cameras;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Camera getById(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            Camera camera = new Camera();
            int i = 0;

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

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

    public Camera[] getByModel(String model) {
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

            Camera[] cameras = new Camera[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    cameras[i] = new Camera();
                    cameras[i].setModel(data[1]);
                    cameras[i].setColor(data[2]);
                    cameras[i].setPixel(Integer.parseInt(data[3]));
                    cameras[i].setMemory(Integer.parseInt(data[4]));
                    cameras[i].setWeight(Integer.parseInt(data[5]));
                    cameras[i].setBluetooth(data[6].equals("bluetooth"));
                    cameras[i].setAnnouncementYear(Integer.parseInt(data[7]));
                    cameras[i].setPrice(Integer.parseInt(data[8]));

                    i++;
                }
            }


            reader2.close();

            return cameras;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Camera[] getByPixel(int pixel) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(Integer.parseInt(data[3]) == pixel) {
                    n++;
                }
            }
            reader1.close();

            Camera[] cameras = new Camera[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[3]) == pixel) {
                    cameras[i] = new Camera();
                    cameras[i].setModel(data[1]);
                    cameras[i].setColor(data[2]);
                    cameras[i].setPixel(Integer.parseInt(data[3]));
                    cameras[i].setMemory(Integer.parseInt(data[4]));
                    cameras[i].setWeight(Integer.parseInt(data[5]));
                    cameras[i].setBluetooth(data[6].equals("bluetooth"));
                    cameras[i].setAnnouncementYear(Integer.parseInt(data[7]));
                    cameras[i].setPrice(Integer.parseInt(data[8]));

                    i++;
                }
            }


            reader2.close();

            return cameras;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Camera[] getByPrice(int price) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(Integer.parseInt(data[8]) == price) {
                    n++;
                }
            }
            reader1.close();

            Camera[] cameras = new Camera[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[8]) == price) {
                    cameras[i] = new Camera();
                    cameras[i].setModel(data[1]);
                    cameras[i].setColor(data[2]);
                    cameras[i].setPixel(Integer.parseInt(data[3]));
                    cameras[i].setMemory(Integer.parseInt(data[4]));
                    cameras[i].setWeight(Integer.parseInt(data[5]));
                    cameras[i].setBluetooth(data[6].equals("bluetooth"));
                    cameras[i].setAnnouncementYear(Integer.parseInt(data[7]));
                    cameras[i].setPrice(Integer.parseInt(data[8]));

                    i++;
                }
            }


            reader2.close();

            return cameras;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public void print(Camera[] cameras) {
        for(Camera camera : cameras) {
            System.out.println(camera);
        }
    }

    @Override
    public void takePhoto() {
        System.out.println("Take a photo with camera");
    }

    @Override
    public void takeVideo() {
        System.out.println("Take a video with camera");
    }
}
