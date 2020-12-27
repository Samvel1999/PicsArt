package homework_4.service;

import homework_4.model.Printer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrinterService {

    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\Printer.txt";
    private static int id = 0;

    private Printer create() {
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

    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            Printer printer = create();
            String colored = printer.isColored()? "colored" : "non-colored";

            if(new File(path).length() == 0) {
                id++;
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
                id++;
                data = "\n" + id + "," + printer.getModel() + "," + printer.getColor() + ","
                        + printer.getMaxNumberOfLists() + "," + colored + ","
                        + printer.getAnnouncementYear() + "," + printer.getPrice();
            }
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    public List<Printer> getAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Printer> printers = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                Printer printer = new Printer();
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

    public Printer getById(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            Printer printer = new Printer();
            int i = 0;

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

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

    public List<Printer> getByPrice(int price) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Printer> printers = new ArrayList<>();


            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[6]) == price) {
                    Printer printer = new Printer();
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

    public List<Printer> getByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Printer> printers = new ArrayList<>();


            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    Printer printer = new Printer();
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

    public List<Printer> getByColor(String color) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Printer> printers = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    Printer printer = new Printer();
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

    public List<Printer> getByColored(boolean isColored) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<Printer> printers = new ArrayList<>();


            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Boolean.parseBoolean(data[4]) == isColored) {
                    Printer printer = new Printer();
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

    public void print(List<Printer> printers) {
        for(Printer printer : printers) {
            System.out.println(printer);
        }
    }

    /*public void print(int numberOfSamples) {
        System.out.println("Print " + numberOfSamples + " sample");
    }

    public void xerox(int numberOfSamples) {
        System.out.println("Xerox " + numberOfSamples + " sample");
    }*/

}
