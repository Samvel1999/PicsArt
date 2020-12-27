package homework_4.otherClasses;

import homework_4.enums.Language;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\EngArmRusDictionary.txt";

    private Dictionary() {

    }

    public static Map<Language, HashMap<String, String>> translate() {
        Map<Language, HashMap<String, String>> dictionary = new HashMap<>();

        dictionary.put(Language.ARMENIAN, new HashMap<>());
        dictionary.put(Language.ENGLISH, new HashMap<>());
        dictionary.put(Language.RUSSIAN, new HashMap<>());

        HashMap<String, String> armDictionary = dictionary.get(Language.ARMENIAN);
        HashMap<String, String> engDictionary = dictionary.get(Language.ENGLISH);
        HashMap<String, String> rusDictionary = dictionary.get(Language.RUSSIAN);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            String str;

            while ((str = reader.readLine()) != null) {
                String[] data = str.split("/");

                engDictionary.put(data[0], data[0]);
                armDictionary.put(data[0], data[1]);
                rusDictionary.put(data[0], data[2]);
            }

            reader.close();
        }
        catch (IOException e) {
            System.out.println("File is not found.");

        }
        return dictionary;
    }
}
