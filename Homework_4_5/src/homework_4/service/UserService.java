package homework_4.service;

import homework_4.enums.Language;
import homework_4.exceptions.EmailException;
import homework_4.exceptions.FullNameException;
import homework_4.exceptions.PasswordException;
import homework_4.exceptions.UsernameException;
import homework_4.model.*;
import homework_4.otherClasses.Dictionary;
import homework_4.otherClasses.MD5Encoder;

import java.io.*;
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
            return new HashSet<>();
        }
    }

    private User create(Language language) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        Map<Language, HashMap<String, String>> myDictionary = Dictionary.translate();

        try {
            System.out.println(myDictionary.get(language).get("FullName: "));

            user.setFullName(scanner.nextLine());

            System.out.println(myDictionary.get(language).get("Username: "));
            user.setUsername(scanner.nextLine());

            System.out.println(myDictionary.get(language).get("Email: "));
            user.setEmail(scanner.nextLine());

            System.out.println(myDictionary.get(language).get("Password: "));
            user.setPassword(scanner.nextLine());
        } catch (FullNameException e) {
            System.out.println("Invalid full name");
            create(language);

        } catch (UsernameException e) {

            System.out.println("Invalid username");
            create(language);

        } catch (EmailException e) {

            System.out.println("Invalid email format");
            create(language);

        } catch (PasswordException e) {
            System.out.println("Invalid password");
            create(language);
        }

        return user;
    }

    /**After registration I call login().*/
    public void registration(Language language) throws FullNameException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
            String data;
            User user = create(language);
            String hashedPassword = new MD5Encoder().md5DigestJavaHexString(user.getPassword());

            if(new File(path).length() == 0) {

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

                data = "\n" + id + "," + user.getFullName() + "," + user.getUsername()
                        + "," + user.getEmail() + "," + hashedPassword;
            }
            id++;
            writer.write(data);

            writer.close();

            Map<Language, HashMap<String, String>> myDictionary = Dictionary.translate();

            System.out.println(myDictionary.get(language).get("Login"));
            login(language);
        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }

    /**After wrong login I call it again.*/
    public void login(Language language) {
        Map<Language, HashMap<String, String>> myDictionary = Dictionary.translate();

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

            System.out.println(myDictionary.get(language).get("Invalid input data.Try again."));
            login(language);


        } catch (IOException e) {
            System.out.println("File is not found.");
        }
    }




}
