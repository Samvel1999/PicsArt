package homework_4.service;

import homework_4.abstractClasses.AbstractDeviceService;
import homework_4.model.Printer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrinterService extends AbstractDeviceService<Printer> {

    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\Printer.txt";
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
    public Printer create() {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();

        System.out.println("Enter model: ");
        printer.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        printer.setColor(scanner.nextLine());

        System.out.println("Enter maximum number of lists: ");
        printer.setMaxNumberOfLists(scanner.nextInt());

        System.out.println("Enter is Colored or not: ");
        printer.setColored(scanner.nextBoolean());

        System.out.println("Enter announcement year: ");
        printer.setAnnouncementYear(scanner.nextInt());

        System.out.println("Enter price: ");
        printer.setPrice(scanner.nextInt());

        return printer;
    }

    @Override
    public List<Printer> getAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Printer> printers = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                Printer printer = new Printer();
                printer.setId(Integer.parseInt(data[0]));
                printer.setModel(data[1]);
                printer.setColor(data[2]);
                printer.setMaxNumberOfLists(Integer.parseInt(data[3]));
                printer.setColored(data[4].equals("colored"));
                printer.setAnnouncementYear(Integer.parseInt(data[5]));
                printer.setPrice(Integer.parseInt(data[6]));

                printers.add(printer);
            }

            reader.close();

            return printers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public Printer getById(Integer id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            Printer printer = new Printer();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    printer.setId(id);
                    printer.setModel(data[1]);
                    printer.setColor(data[2]);
                    printer.setMaxNumberOfLists(Integer.parseInt(data[3]));
                    printer.setColored(data[4].equals("colored"));
                    printer.setAnnouncementYear(Integer.parseInt(data[5]));
                    printer.setPrice(Integer.parseInt(data[6]));

                    break;
                }
            }

            reader.close();

            return printer;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }

    }

    @Override
    public List<Printer> getByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Printer> printers = new ArrayList<>();


            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    Printer printer = new Printer();
                    printer.setId(Integer.parseInt(data[0]));
                    printer.setModel(data[1]);
                    printer.setColor(data[2]);
                    printer.setMaxNumberOfLists(Integer.parseInt(data[3]));
                    printer.setColored(data[4].equals("colored"));
                    printer.setAnnouncementYear(Integer.parseInt(data[5]));
                    printer.setPrice(Integer.parseInt(data[6]));

                    printers.add(printer);
                }
            }


            reader.close();

            return printers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<Printer> getByColor(String color) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Printer> printers = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    Printer printer = new Printer();
                    printer.setId(Integer.parseInt(data[0]));
                    printer.setModel(data[1]);
                    printer.setColor(data[2]);
                    printer.setMaxNumberOfLists(Integer.parseInt(data[3]));
                    printer.setColored(data[4].equals("colored"));
                    printer.setAnnouncementYear(Integer.parseInt(data[5]));
                    printer.setPrice(Integer.parseInt(data[6]));

                    printers.add(printer);
                }
            }


            reader.close();

            return printers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<Printer> getByPrice(Integer price) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Printer> printers = new ArrayList<>();


            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[6]) == price) {
                    Printer printer = new Printer();
                    printer.setId(Integer.parseInt(data[0]));
                    printer.setModel(data[1]);
                    printer.setColor(data[2]);
                    printer.setMaxNumberOfLists(Integer.parseInt(data[3]));
                    printer.setColored(data[4].equals("colored"));
                    printer.setAnnouncementYear(Integer.parseInt(data[5]));
                    printer.setPrice(Integer.parseInt(data[6]));

                    printers.add(printer);
                }
            }


            reader.close();

            return printers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public List<Printer> getByColored(Boolean isColored) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Printer> printers = new ArrayList<>();


            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");


                if((data[4].equals("colored") && isColored) ||
                        (data[4].equals("non-colored") && !isColored)) {
                    Printer printer = new Printer();
                    printer.setId(Integer.parseInt(data[0]));
                    printer.setModel(data[1]);
                    printer.setColor(data[2]);
                    printer.setMaxNumberOfLists(Integer.parseInt(data[3]));
                    printer.setColored(isColored);
                    printer.setAnnouncementYear(Integer.parseInt(data[5]));
                    printer.setPrice(Integer.parseInt(data[6]));

                    printers.add(printer);
                }
            }


            reader.close();

            return printers;
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
            Printer printer = create();
            String colored = printer.isColored()? "colored" : "non-colored";

            if(new File(path).length() == 0) {
                data = id + "," + printer.getModel() + "," + printer.getColor() + ","
                        + printer.getMaxNumberOfLists() + "," + colored + ","
                        + printer.getAnnouncementYear() + "," + printer.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                data = "\n" + id + "," + printer.getModel() + "," + printer.getColor() + ","
                        + printer.getMaxNumberOfLists() + "," + colored + ","
                        + printer.getAnnouncementYear() + "," + printer.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void save(Printer printer) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            String colored = printer.isColored()? "colored" : "non-colored";

            if(new File(path).length() == 0) {
                data = id + "," + printer.getModel() + "," + printer.getColor() + ","
                        + printer.getMaxNumberOfLists() + "," + colored + ","
                        + printer.getAnnouncementYear() + "," + printer.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                data = "\n" + id + "," + printer.getModel() + "," + printer.getColor() + ","
                        + printer.getMaxNumberOfLists() + "," + colored + ","
                        + printer.getAnnouncementYear() + "," + printer.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void update(Integer id, Printer newPrinter) {
        List<Printer> printers = getAll();
        deleteAllInfoFromFile();
        for(Printer printer : printers) {
            if(printer.getId().equals(id)) {
                printer = newPrinter;
            }
            save(printer);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            List<Printer> printers = getAll();
            deleteAllInfoFromFile();
            printers.remove(id.intValue());

            for (Printer printer : printers) {
                save(printer);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong Index");
        }
    }
}
