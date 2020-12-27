package homework_4.service;

import homework_4.abstractClasses.AbstractDeviceService;
import homework_4.model.DishWasher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DishWasherService extends AbstractDeviceService<DishWasher> {
    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\DishWasher.txt";
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
    public DishWasher create() {
        Scanner scanner = new Scanner(System.in);
        DishWasher dishWasher = new DishWasher();

        System.out.println("Enter model: ");
        dishWasher.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        dishWasher.setColor(scanner.nextLine());

        System.out.println("Enter capacity: ");
        dishWasher.setCapacity(scanner.nextInt());

        System.out.println("Enter width: ");
        dishWasher.setWidth(scanner.nextDouble());

        System.out.println("Enter height: ");
        dishWasher.setHeight(scanner.nextDouble());

        System.out.println("Enter depth: ");
        dishWasher.setDepth(scanner.nextDouble());

        System.out.println("Enter announcement year: ");
        dishWasher.setAnnouncementYear(scanner.nextInt());

        System.out.println("Enter manufacturer country: ");
        dishWasher.setManufacturerCountry(scanner.nextLine());

        System.out.println("Enter price: ");
        dishWasher.setPrice(scanner.nextInt());

        return dishWasher;
    }

    @Override
    public List<DishWasher> getAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;


            List<DishWasher> dishWashers = new ArrayList<>();


            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                DishWasher dishWasher = new DishWasher();
                dishWasher.setId(Integer.parseInt(data[0]));
                dishWasher.setModel(data[1]);
                dishWasher.setColor(data[2]);
                dishWasher.setCapacity(Integer.parseInt(data[3]));
                dishWasher.setWidth(Double.parseDouble(data[4]));
                dishWasher.setHeight(Double.parseDouble(data[5]));
                dishWasher.setDepth(Double.parseDouble(data[6]));
                dishWasher.setAnnouncementYear(Integer.parseInt(data[7]));
                dishWasher.setManufacturerCountry(data[8]);
                dishWasher.setPrice(Integer.parseInt(data[9]));

                dishWashers.add(dishWasher);
            }

            reader.close();

            return dishWashers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public DishWasher getById(Integer id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            DishWasher dishWasher = new DishWasher();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    dishWasher.setId(id);
                    dishWasher.setModel(data[1]);
                    dishWasher.setColor(data[2]);
                    dishWasher.setCapacity(Integer.parseInt(data[3]));
                    dishWasher.setWidth(Double.parseDouble(data[4]));
                    dishWasher.setHeight(Double.parseDouble(data[5]));
                    dishWasher.setDepth(Double.parseDouble(data[6]));
                    dishWasher.setAnnouncementYear(Integer.parseInt(data[7]));
                    dishWasher.setManufacturerCountry(data[8]);
                    dishWasher.setPrice(Integer.parseInt(data[9]));

                    break;
                }
            }

            reader.close();

            return dishWasher;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }

    }

    @Override
    public List<DishWasher> getByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;


            List<DishWasher> dishWashers = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    DishWasher dishWasher = new DishWasher();
                    dishWasher.setId(Integer.parseInt(data[0]));
                    dishWasher.setModel(data[1]);
                    dishWasher.setColor(data[2]);
                    dishWasher.setCapacity(Integer.parseInt(data[3]));
                    dishWasher.setWidth(Double.parseDouble(data[4]));
                    dishWasher.setHeight(Double.parseDouble(data[5]));
                    dishWasher.setDepth(Double.parseDouble(data[6]));
                    dishWasher.setAnnouncementYear(Integer.parseInt(data[7]));
                    dishWasher.setManufacturerCountry(data[8]);
                    dishWasher.setPrice(Integer.parseInt(data[9]));

                    dishWashers.add(dishWasher);
                }
            }


            reader.close();

            return dishWashers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<DishWasher> getByColor(String color) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<DishWasher> dishWashers = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    DishWasher dishWasher = new DishWasher();
                    dishWasher.setId(Integer.parseInt(data[0]));
                    dishWasher.setModel(data[1]);
                    dishWasher.setColor(data[2]);
                    dishWasher.setCapacity(Integer.parseInt(data[3]));
                    dishWasher.setWidth(Double.parseDouble(data[4]));
                    dishWasher.setHeight(Double.parseDouble(data[5]));
                    dishWasher.setDepth(Double.parseDouble(data[6]));
                    dishWasher.setAnnouncementYear(Integer.parseInt(data[7]));
                    dishWasher.setManufacturerCountry(data[8]);
                    dishWasher.setPrice(Integer.parseInt(data[9]));

                    dishWashers.add(dishWasher);
                }
            }


            reader.close();

            return dishWashers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<DishWasher> getByPrice(Integer price) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<DishWasher> dishWashers = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[8]) == price) {
                    DishWasher dishWasher = new DishWasher();
                    dishWasher.setId(Integer.parseInt(data[0]));
                    dishWasher.setModel(data[1]);
                    dishWasher.setColor(data[2]);
                    dishWasher.setCapacity(Integer.parseInt(data[3]));
                    dishWasher.setWidth(Double.parseDouble(data[4]));
                    dishWasher.setHeight(Double.parseDouble(data[5]));
                    dishWasher.setDepth(Double.parseDouble(data[6]));
                    dishWasher.setAnnouncementYear(Integer.parseInt(data[7]));
                    dishWasher.setManufacturerCountry(data[8]);
                    dishWasher.setPrice(Integer.parseInt(data[9]));

                    dishWashers.add(dishWasher);
                }
            }


            reader.close();

            return dishWashers;
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
            DishWasher dishWasher = create();

            if(new File(path).length() == 0) {
                data = id + "," + dishWasher.getModel() + "," + dishWasher.getColor()  + ","
                        + dishWasher.getCapacity()  + "," + dishWasher.getWidth() + ","
                        + dishWasher.getHeight() + "," + dishWasher.getDepth() +  ","
                        + dishWasher.getAnnouncementYear() + "," + dishWasher.getManufacturerCountry() + "," + dishWasher.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                data = "\n" + id + "," + dishWasher.getModel() + "," + dishWasher.getColor()  + ","
                        + dishWasher.getCapacity()  + "," + dishWasher.getWidth() + ","
                        + dishWasher.getHeight() + "," +dishWasher.getDepth() +  ","
                        + dishWasher.getAnnouncementYear()+ "," + dishWasher.getManufacturerCountry() + "," + dishWasher.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void save(DishWasher dishWasher) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;

            if(new File(path).length() == 0) {
                data = id + "," + dishWasher.getModel() + "," + dishWasher.getColor()  + ","
                        + dishWasher.getCapacity()  + "," + dishWasher.getWidth() + ","
                        + dishWasher.getHeight() + "," +dishWasher.getDepth() +  ","
                        + dishWasher.getAnnouncementYear()+ "," + dishWasher.getManufacturerCountry() + ","
                        + dishWasher.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                data = "\n" + id + "," + dishWasher.getModel() + "," + dishWasher.getColor()  + ","
                        + dishWasher.getCapacity()  + "," + dishWasher.getWidth() + ","
                        + dishWasher.getHeight() + "," +dishWasher.getDepth() +  ","
                        + dishWasher.getAnnouncementYear()+ "," + dishWasher.getManufacturerCountry() + ","
                        + dishWasher.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void update(Integer id, DishWasher newDishWasher) {
        List<DishWasher> dishWashers = getAll();
        deleteAllInfoFromFile();
        for(DishWasher dishWasher : dishWashers) {
            if(dishWasher.getId().equals(id)) {
                dishWasher = newDishWasher;
            }
            save(dishWasher);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            List<DishWasher> dishWashers = getAll();
            deleteAllInfoFromFile();
            dishWashers.remove(id.intValue());

            for (DishWasher dishWasher : dishWashers) {
                save(dishWasher);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong Index");
        }
    }

}
