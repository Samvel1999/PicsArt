package homework_4.service;

import homework_4.model.RecordPlayer;
import homework_4.model.interfaces.MusicDevice;

import java.io.*;
import java.util.Scanner;

public class RecordPlayerService implements MusicDevice {
    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\RecordPlayer.txt";
    private static int id = 0;

    public RecordPlayer create() {
        Scanner scanner = new Scanner(System.in);
        RecordPlayer recordPlayer = new RecordPlayer();

        System.out.println("Enter model: ");
        recordPlayer.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        recordPlayer.setColor(scanner.nextLine());

        System.out.println("Enter weight: ");
        recordPlayer.setWeight(scanner.nextInt());

        System.out.println("Enter announcement year: ");
        recordPlayer.setAnnouncementYear(scanner.nextInt());

        System.out.println("Enter price: ");
        recordPlayer.setPrice(scanner.nextInt());

        return recordPlayer;
    }

    public void save() {
        try {
            RecordPlayer recordPlayer = create();
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;

            if(new File(path).length() == 0) {
                id++;
                data = id + "," + recordPlayer.getModel() + "," + recordPlayer.getColor()+ ","
                        + recordPlayer.getWeight() + ","  + recordPlayer.getAnnouncementYear() + ","
                        + recordPlayer.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                id++;
                data = "\n" + id + "," + recordPlayer.getModel() + "," + recordPlayer.getColor()+ ","
                        + recordPlayer.getWeight() + ","  + recordPlayer.getAnnouncementYear() + ","
                        + recordPlayer.getPrice();
            }
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    public RecordPlayer[] getAll() {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while(reader1.readLine() != null) {
                n++;
            }

            reader1.close();
            RecordPlayer[] recordPlayers = new RecordPlayer[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                recordPlayers[i] = new RecordPlayer();
                recordPlayers[i].setModel(data[1]);
                recordPlayers[i].setColor(data[2]);
                recordPlayers[i].setWeight(Integer.parseInt(data[3]));
                recordPlayers[i].setAnnouncementYear(Integer.parseInt(data[4]));
                recordPlayers[i].setPrice(Integer.parseInt(data[5]));
                i++;
            }

            reader2.close();
            return recordPlayers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public RecordPlayer getById(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            RecordPlayer recordPlayer = new RecordPlayer();
            int i = 0;

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    recordPlayer.setModel(data[1]);
                    recordPlayer.setColor(data[2]);
                    recordPlayer.setWeight(Integer.parseInt(data[3]));
                    recordPlayer.setAnnouncementYear(Integer.parseInt(data[4]));
                    recordPlayer.setPrice(Integer.parseInt(data[5]));
                    break;
                }
            }

            reader.close();

            return recordPlayer;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public RecordPlayer[] getByModel(String model) {
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

            RecordPlayer[] recordPlayers = new RecordPlayer[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    recordPlayers[i] = new RecordPlayer();
                    recordPlayers[i].setModel(data[1]);
                    recordPlayers[i].setColor(data[2]);
                    recordPlayers[i].setWeight(Integer.parseInt(data[3]));
                    recordPlayers[i].setAnnouncementYear(Integer.parseInt(data[4]));
                    recordPlayers[i].setPrice(Integer.parseInt(data[5]));
                    i++;
                }
            }


            reader2.close();

            return recordPlayers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public RecordPlayer[] getByColor(String color) {
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

            RecordPlayer[] recordPlayers = new RecordPlayer[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    recordPlayers[i] = new RecordPlayer();
                    recordPlayers[i].setModel(data[1]);
                    recordPlayers[i].setColor(data[2]);
                    recordPlayers[i].setWeight(Integer.parseInt(data[3]));
                    recordPlayers[i].setAnnouncementYear(Integer.parseInt(data[4]));
                    recordPlayers[i].setPrice(Integer.parseInt(data[5]));
                    i++;
                }
            }


            reader2.close();

            return recordPlayers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }


    public RecordPlayer[] getByPrice(int price) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(Integer.parseInt(data[5]) == price) {
                    n++;
                }
            }
            reader1.close();

            RecordPlayer[] recordPlayers = new RecordPlayer[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[5]) == price) {
                    recordPlayers[i] = new RecordPlayer();
                    recordPlayers[i].setModel(data[1]);
                    recordPlayers[i].setColor(data[2]);
                    recordPlayers[i].setWeight(Integer.parseInt(data[3]));
                    recordPlayers[i].setAnnouncementYear(Integer.parseInt(data[4]));
                    recordPlayers[i].setPrice(Integer.parseInt(data[5]));
                    i++;
                }
            }


            reader2.close();

            return recordPlayers;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public void print(RecordPlayer[] recordPlayers) {
        for(RecordPlayer recordPlayer : recordPlayers) {
            System.out.println(recordPlayer);
        }
    }

    public void insertDisc() {
        System.out.println("Disc is inserted");
    }

    public void removeDisc() {
        System.out.println("Disc is removed");
    }

    public void changeMusic() {
        System.out.println("Change music");
    }

    @Override
    public void listenToMusic() {
        System.out.println("Listen to music with record player");
    }

}
