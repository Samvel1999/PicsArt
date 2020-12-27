package homework_4.service;

import homework_4.model.*;
import homework_4.model.Dictionary;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

public class UserService {
    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\User.txt";
    private static int id = 0;

    public Set<String> getAllUsernames() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;

            Set<String> usernameSet = new HashSet<>();

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                usernameSet.add(data[2]);
            }

            reader.close();

            return usernameSet;
        }
        catch (IOException e) {
            System.out.println("File is not found.");
            return null;
        }
    }

    private User create(Language language) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        Map<Language, HashMap<String, String>> myDictionary = new Dictionary().translate();

        System.out.println(myDictionary.get(language).get("FullName: "));
        user.setFullName(scanner.nextLine());

        System.out.println(myDictionary.get(language).get("Username: "));
        user.setUsername(scanner.nextLine());

        System.out.println(myDictionary.get(language).get("Email: "));
        user.setEmail(scanner.nextLine());

        System.out.println(myDictionary.get(language).get("Password: "));
        user.setPassword(scanner.nextLine());

        return user;
    }

    public void registration(Language language) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            User user = create(language);
            String hashedPassword = new MD5Encoder().md5DigestJavaHexString(user.getPassword());

            if(new File(path).length() == 0) {
                id++;
                data = id + "," + user.getFullName() + "," + user.getUsername() + "," + user.getEmail() + ","
                        + hashedPassword;
            }
            else {
                BufferedReader reader = new BufferedReader(new FileReader(path));
                String s;
                while ((s = reader.readLine()) != null) {
                    String[] info = s.split(",");

                    id = Integer.parseInt(info[0]);
                }
                id++;
                data = "\n" + id + "," + user.getFullName() + "," + user.getUsername()
                        + "," + user.getEmail() + "," + hashedPassword;
            }
            writer.write(data);

            writer.close();

            Map<Language, HashMap<String, String>> myDictionary = new Dictionary().translate();

            System.out.println(myDictionary.get(language).get("Login"));
            login(language);
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    public void login(Language language) {
        Map<Language, HashMap<String, String>> myDictionary = new Dictionary().translate();

        Scanner scanner = new Scanner(System.in);
        System.out.println(myDictionary.get(language).get("Username: "));
        String inputUsername = scanner.nextLine();
        System.out.println(myDictionary.get(language).get("Password: "));
        String inputPassword = scanner.nextLine();



        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String s;

            while ((s = reader.readLine()) != null) {
                String[] data = s.split(",");

                if(data[2].equals(inputUsername) && data[4].equals(new MD5Encoder().md5DigestJavaHexString(inputPassword))) {
                    System.out.println(myDictionary.get(language).get("Login success"));
                    return;
                }
            }

            System.out.println("Invalid input data. Try again.");
            login(language);


        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }




}
