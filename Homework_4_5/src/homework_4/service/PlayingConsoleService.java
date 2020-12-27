package homework_4.service;

import homework_4.abstractClasses.AbstractDeviceService;
import homework_4.model.PlayingConsole;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayingConsoleService extends AbstractDeviceService<PlayingConsole> {
    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\PlayingConsole.txt";
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

    @Override
    public List<PlayingConsole> getAll() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<PlayingConsole> playingConsoles = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                PlayingConsole playingConsole = new PlayingConsole();
                playingConsole.setId(Integer.parseInt(data[0]));
                playingConsole.setModel(data[1]);
                playingConsole.setColor(data[2]);
                playingConsole.setRam(Integer.parseInt(data[3]));
                playingConsole.setMemory(Integer.parseInt(data[4]));
                playingConsole.setAnnouncementYear(Integer.parseInt(data[5]));
                playingConsole.setPrice(Integer.parseInt(data[6]));

                playingConsoles.add(playingConsole);
            }

            reader.close();

            return playingConsoles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public PlayingConsole getById(Integer id) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;
            PlayingConsole playingConsole = new PlayingConsole();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[0]) == id) {

                    playingConsole.setId(id);
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

    @Override
    public List<PlayingConsole> getByModel(String model) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<PlayingConsole> playingConsoles = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[1].equals(model)) {
                    PlayingConsole playingConsole = new PlayingConsole();
                    playingConsole.setId(Integer.parseInt(data[0]));
                    playingConsole.setModel(data[1]);
                    playingConsole.setColor(data[2]);
                    playingConsole.setRam(Integer.parseInt(data[3]));
                    playingConsole.setMemory(Integer.parseInt(data[4]));
                    playingConsole.setAnnouncementYear(Integer.parseInt(data[5]));
                    playingConsole.setPrice(Integer.parseInt(data[6]));

                    playingConsoles.add(playingConsole);
                }
            }


            reader.close();

            return playingConsoles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<PlayingConsole> getByColor(String color) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<PlayingConsole> playingConsoles = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(color)) {
                    PlayingConsole playingConsole = new PlayingConsole();
                    playingConsole.setId(Integer.parseInt(data[0]));
                    playingConsole.setModel(data[1]);
                    playingConsole.setColor(data[2]);
                    playingConsole.setRam(Integer.parseInt(data[3]));
                    playingConsole.setMemory(Integer.parseInt(data[4]));
                    playingConsole.setAnnouncementYear(Integer.parseInt(data[5]));
                    playingConsole.setPrice(Integer.parseInt(data[6]));

                    playingConsoles.add(playingConsole);
                }
            }


            reader.close();

            return playingConsoles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    @Override
    public List<PlayingConsole> getByPrice(Integer price) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<PlayingConsole> playingConsoles = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[6]) == price) {
                    PlayingConsole playingConsole = new PlayingConsole();
                    playingConsole.setId(Integer.parseInt(data[0]));
                    playingConsole.setModel(data[1]);
                    playingConsole.setColor(data[2]);
                    playingConsole.setRam(Integer.parseInt(data[3]));
                    playingConsole.setMemory(Integer.parseInt(data[4]));
                    playingConsole.setAnnouncementYear(Integer.parseInt(data[5]));
                    playingConsole.setPrice(Integer.parseInt(data[6]));

                    playingConsoles.add(playingConsole);
                }
            }


            reader.close();

            return playingConsoles;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return new ArrayList<>();
        }
    }

    public List<PlayingConsole> getByRam(Integer ram) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String s;

            List<PlayingConsole> playingConsoles = new ArrayList<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(Integer.parseInt(data[3]) == ram) {
                    PlayingConsole playingConsole = new PlayingConsole();
                    playingConsole.setId(Integer.parseInt(data[0]));
                    playingConsole.setModel(data[1]);
                    playingConsole.setColor(data[2]);
                    playingConsole.setRam(Integer.parseInt(data[3]));
                    playingConsole.setMemory(Integer.parseInt(data[4]));
                    playingConsole.setAnnouncementYear(Integer.parseInt(data[5]));
                    playingConsole.setPrice(Integer.parseInt(data[6]));

                    playingConsoles.add(playingConsole);
                }
            }


            reader.close();

            return playingConsoles;
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
            PlayingConsole playingConsole = create();

            if(new File(path).length() == 0) {
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
                data = "\n" + id + "," + playingConsole.getModel() + "," + playingConsole.getColor()  + ","
                        + playingConsole.getRam() + "," + playingConsole.getMemory()  + ","
                        + playingConsole.getAnnouncementYear() + ","  + playingConsole.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void save(PlayingConsole playingConsole) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;

            if(new File(path).length() == 0) {
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
                data = "\n" + id + "," + playingConsole.getModel() + "," + playingConsole.getColor()  + ","
                        + playingConsole.getRam() + "," + playingConsole.getMemory()  + ","
                        + playingConsole.getAnnouncementYear() + ","  + playingConsole.getPrice();
            }
            id++;
            writer.write(data);

            writer.close();
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    @Override
    public void update(Integer id, PlayingConsole newPlayingConsole) {
        List<PlayingConsole> playingConsoles = getAll();
        deleteAllInfoFromFile();
        for(PlayingConsole playingConsole : playingConsoles) {
            if(playingConsole.getId().equals(id)) {
                playingConsole = newPlayingConsole;
            }
            save(playingConsole);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            List<PlayingConsole> playingConsoles = getAll();
            deleteAllInfoFromFile();
            playingConsoles.remove(id.intValue());

            for (PlayingConsole playingConsole : playingConsoles) {
                save(playingConsole);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wrong Index");
        }
    }
}
