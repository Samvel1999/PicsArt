package homework_4.service;

import homework_4.model.PlayingConsole;
import homework_4.model.interfaces.GamingDevice;

import java.io.*;
import java.util.Scanner;

public class PlayingConsoleService implements GamingDevice {
    private static String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\PlayingConsole.txt";
    private static int id = 0;

    public PlayingConsole create() {
        Scanner scanner = new Scanner(System.in);
        PlayingConsole playingConsole = new PlayingConsole();

        System.out.println("Enter model: ");
        playingConsole.setModel(scanner.nextLine());

        System.out.println("Enter color: ");
        playingConsole.setColor(scanner.nextLine());

        System.out.println("Enter ram: ");
        playingConsole.setRam(scanner.nextInt());

        System.out.println("Enter memory: ");
        playingConsole.setMemory(scanner.nextInt());

        System.out.println("Enter announcement year: ");
        playingConsole.setAnnouncementYear(scanner.nextInt());

        System.out.println("Enter price: ");
        playingConsole.setPrice(scanner.nextInt());
        scanner.nextLine();

        return playingConsole;
    }

    public void save() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            PlayingConsole playingConsole = create();

            if(new File(path).length() == 0) {
                id++;
                data = id + "," + playingConsole.getModel() + "," + playingConsole.getColor()  + ","
                        + playingConsole.getRam() + "," + playingConsole.getMemory()  + ","
                        + playingConsole.getAnnouncementYear() + ","  + playingConsole.getPrice();
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                id++;
                data = "\n" + id + "," + playingConsole.getModel() + "," + playingConsole.getColor()  + ","
                        + playingConsole.getRam() + "," + playingConsole.getMemory()  + ","
                        + playingConsole.getAnnouncementYear() + ","  + playingConsole.getPrice();
            }
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    public PlayingConsole[] getAll() {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while(reader1.readLine() != null) {
                n++;
            }

            PlayingConsole[] playingConsoles = new PlayingConsole[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                playingConsoles[i] = new PlayingConsole();
                playingConsoles[i].setModel(data[1]);
                playingConsoles[i].setColor(data[2]);
                playingConsoles[i].setRam(Integer.parseInt(data[3]));
                playingConsoles[i].setMemory(Integer.parseInt(data[4]));
                playingConsoles[i].setAnnouncementYear(Integer.parseInt(data[5]));
                playingConsoles[i].setPrice(Integer.parseInt(data[6]));
                i++;
            }

            reader1.close();
            reader2.close();

            return playingConsoles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public PlayingConsole getById(int id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            PlayingConsole playingConsole = new PlayingConsole();
            int i = 0;

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {


                    playingConsole.setModel(data[1]);
                    playingConsole.setColor(data[2]);
                    playingConsole.setRam(Integer.parseInt(data[3]));
                    playingConsole.setMemory(Integer.parseInt(data[4]));
                    playingConsole.setAnnouncementYear(Integer.parseInt(data[5]));
                    playingConsole.setPrice(Integer.parseInt(data[6]));
                    break;
                }
            }

            reader.close();

            return playingConsole;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }

    }

    public PlayingConsole[] getByModel(String model) {
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

            PlayingConsole[] playingConsoles = new PlayingConsole[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    playingConsoles[i] = new PlayingConsole();
                    playingConsoles[i].setModel(data[1]);
                    playingConsoles[i].setColor(data[2]);
                    playingConsoles[i].setRam(Integer.parseInt(data[3]));
                    playingConsoles[i].setMemory(Integer.parseInt(data[4]));
                    playingConsoles[i].setAnnouncementYear(Integer.parseInt(data[5]));
                    playingConsoles[i].setPrice(Integer.parseInt(data[6]));

                    i++;
                }
            }


            reader2.close();

            return playingConsoles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public PlayingConsole[] getByRam(int ram) {
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(path));
            BufferedReader reader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;

            while((s = reader1.readLine()) != null) {
                String[] data = s.split(",");
                if(Integer.parseInt(data[3]) == ram) {
                    n++;
                }
            }
            reader1.close();

            PlayingConsole[] playingConsoles = new PlayingConsole[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[3]) == ram) {
                    playingConsoles[i] = new PlayingConsole();
                    playingConsoles[i].setModel(data[1]);
                    playingConsoles[i].setColor(data[2]);
                    playingConsoles[i].setRam(Integer.parseInt(data[3]));
                    playingConsoles[i].setMemory(Integer.parseInt(data[4]));
                    playingConsoles[i].setAnnouncementYear(Integer.parseInt(data[5]));
                    playingConsoles[i].setPrice(Integer.parseInt(data[6]));

                    i++;
                }
            }


            reader2.close();

            return playingConsoles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public PlayingConsole[] getByPrice(int price) {
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

            PlayingConsole[] playingConsoles = new PlayingConsole[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[6]) == price) {
                    playingConsoles[i] = new PlayingConsole();
                    playingConsoles[i].setModel(data[1]);
                    playingConsoles[i].setColor(data[2]);
                    playingConsoles[i].setRam(Integer.parseInt(data[3]));
                    playingConsoles[i].setMemory(Integer.parseInt(data[4]));
                    playingConsoles[i].setAnnouncementYear(Integer.parseInt(data[5]));
                    playingConsoles[i].setPrice(Integer.parseInt(data[6]));

                    i++;
                }
            }


            reader2.close();

            return playingConsoles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public PlayingConsole[] getByColor(String color) {
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

            PlayingConsole[] playingConsoles = new PlayingConsole[n];
            int i = 0;

            while ((s = reader2.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    playingConsoles[i] = new PlayingConsole();
                    playingConsoles[i].setModel(data[1]);
                    playingConsoles[i].setColor(data[2]);
                    playingConsoles[i].setRam(Integer.parseInt(data[3]));
                    playingConsoles[i].setMemory(Integer.parseInt(data[4]));
                    playingConsoles[i].setAnnouncementYear(Integer.parseInt(data[5]));
                    playingConsoles[i].setPrice(Integer.parseInt(data[6]));

                    i++;
                }
            }


            reader2.close();

            return playingConsoles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    public void print(PlayingConsole[] playingConsoles) {
        for(PlayingConsole playingConsole : playingConsoles) {
            System.out.println(playingConsole);
        }
    }

    @Override
    public void play() {
        System.out.println("Playing with playstation");
    }

    @Override
    public void downloadGame() {
        System.out.println("Download game into playstation");

    }

    @Override
    public void deleteGame() {
        System.out.println("Delete game from playstation");
    }

    @Override
    public void connectToTheInternet() {
        System.out.println("Playstation is connected to the Internet");
    }

    @Override
    public void disconnectFromTheInternet() {
        System.out.println("Playstation is disconnected from the Internet");
    }
}
