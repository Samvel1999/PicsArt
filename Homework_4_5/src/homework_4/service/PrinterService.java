package homework_4.service;

import homework_4.model.Printer;

import java.io.*;
import java.util.Scanner;

public class PrinterService {

    private static String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\DataBase\\Printer.txt";
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

    public Printer[] getAll() {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while(reader1.readLine() != null) {
                n++;
            }

            Printer[] printers = new Printer[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                printers[i] = new Printer();
                printers[i].setModel(data[1]);
                printers[i].setColor(data[2]);
                printers[i].setMaxNumberOfLists(Integer.parseInt(data[3]));
                printers[i].setColored(data[4].equals("colored"));
                printers[i].setAnnouncementYear(Integer.parseInt(data[5]));
                printers[i].setPrice(Integer.parseInt(data[6]));
                i++;
            }

            reader1.close();
            reader2.close();

            return printers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
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

    public Printer[] getByPrice(int price) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(Integer.parseInt(data[6]) == price) {
                    n++;
                }
            }
            reader1.close();

            Printer[] printers = new Printer[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[6]) == price) {
                    printers[i] = new Printer();
                    printers[i].setModel(data[1]);
                    printers[i].setColor(data[2]);
                    printers[i].setMaxNumberOfLists(Integer.parseInt(data[3]));
                    printers[i].setColored(data[4].equals("colored"));
                    printers[i].setAnnouncementYear(Integer.parseInt(data[5]));
                    printers[i].setPrice(Integer.parseInt(data[6]));

                    i++;
                }
            }


            reader2.close();

            return printers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Printer[] getByModel(String model) {
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

            Printer[] printers = new Printer[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    printers[i] = new Printer();
                    printers[i].setModel(data[1]);
                    printers[i].setColor(data[2]);
                    printers[i].setMaxNumberOfLists(Integer.parseInt(data[3]));
                    printers[i].setColored(data[4].equals("colored"));
                    printers[i].setAnnouncementYear(Integer.parseInt(data[5]));
                    printers[i].setPrice(Integer.parseInt(data[6]));

                    i++;
                }
            }


            reader2.close();

            return printers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Printer[] getByColor(String color) {
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

            Printer[] printers = new Printer[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    printers[i] = new Printer();
                    printers[i].setModel(data[1]);
                    printers[i].setColor(data[2]);
                    printers[i].setMaxNumberOfLists(Integer.parseInt(data[3]));
                    printers[i].setColored(data[4].equals("colored"));
                    printers[i].setAnnouncementYear(Integer.parseInt(data[5]));
                    printers[i].setPrice(Integer.parseInt(data[6]));

                    i++;
                }
            }


            reader2.close();

            return printers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public Printer[] getByColored(boolean isColored) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;
            String colored = isColored? "colored" : "non-colored";

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(data[4].equals(colored)) {
                    n++;
                }
            }
            reader1.close();

            Printer[] printers = new Printer[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[4].equals(colored)) {
                    printers[i] = new Printer();
                    printers[i].setModel(data[1]);
                    printers[i].setColor(data[2]);
                    printers[i].setMaxNumberOfLists(Integer.parseInt(data[3]));
                    printers[i].setColored(isColored);
                    printers[i].setAnnouncementYear(Integer.parseInt(data[5]));
                    printers[i].setPrice(Integer.parseInt(data[6]));
                    i++;
                }
            }


            reader2.close();

            return printers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public void print(Printer[] printers) {
        for(Printer printer : printers) {
            System.out.println(printer);
        }
    }

    public void print(int numberOfSamples) {
        System.out.println("Print " + numberOfSamples + " sample");
    }

    public void xerox(int numberOfSamples) {
        System.out.println("Xerox " + numberOfSamples + " sample");
    }

}
