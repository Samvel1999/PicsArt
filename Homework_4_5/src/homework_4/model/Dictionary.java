package homework_4.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private static final String path = "C:\\Users\\Samvel\\Desktop\\PicsArt\\Homework_4_5\\DataBase\\EngArmRusDictionary.txt";


    public Dictionary() {

    }

    public Map<Language, HashMap<String, String>> translate() {
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

        /*armDictionary.put("Hello: Welcome to our Electronics supermarket.",
                "Բարև Ձեզ: Բարի գալուստ մեր էլեկտրոնիկայի սուպերմարկետ:");

        engDictionary.put("Hello: Welcome to our Electronics supermarket.",
                "Hello: Welcome to our Electronics supermarket.");

        rusDictionary.put("Hello: Welcome to our Electronics supermarket.",
                "Здравствуйте. Добро пожаловать в наш супермаркет электроники.");*/

        /*armDictionary.put("Please, choose your device:",
                "Խնդրում ենք, ընտրել ձեր սարքը:");
        engDictionary.put("Please, choose your device:",
                "Please, choose your device:");
        rusDictionary.put("Please, choose your device:",
                "Пожалуйста, выберите ваше устройство.");*/

        /*armDictionary.put("1: Device with screen", "1: Սարք էկրանով:");
        engDictionary.put("1: Device with screen", "1: Device with screen.");
        rusDictionary.put("1: Device with screen", "1: Устройство с экраном.");*/

        /*armDictionary.put("2: Device without screen", "2: Սարք առանց էկրանի:");
        engDictionary.put("2: Device without screen", "2: Device without screen.");
        rusDictionary.put("2: Device without screen", "2: Устройство без экрана.");*/

        /*armDictionary.put("Please, choose your device with screen",
                "Խնդրում ենք, ընտրեք ձեր էկրանով սարքը:");
        engDictionary.put("Please, choose your device with screen",
                "Please, choose your device with screen.");
        rusDictionary.put("Please, choose your device with screen",
                "Пожалуйста, выберите ваше устройство с экраном.");*/

        /*armDictionary.put("Please, choose your device without screen",
                "Խնդրում ենք, ընտրեք ձեր առանց էկրանի սարքը:");
        engDictionary.put("Please, choose your device without screen",
                "Please, choose your device without screen.");
        rusDictionary.put("Please, choose your device without screen",
                "Пожалуйста, выберите ваше устройство без экрана.");*/

        /*armDictionary.put("Please, choose what to look for ",
                "Խնդրում եմ, ընտրեք, թե ինչ փնտրել ");
        engDictionary.put("Please, choose what to look for ",
                "Please, choose what to look for ");
        rusDictionary.put("Please, choose what to look for ",
                "Пожалуйста, выберите, что искать ");*/

        /*armDictionary.put("in laptops.", "նոութբուքերում:");
        engDictionary.put("in laptops.", "in laptops.");
        rusDictionary.put("in laptops.", "в ноутбуках.");*/

        /*armDictionary.put("in mobiles.", "հեռախոսներում:");
        engDictionary.put("in mobiles.", "in mobiles.");
        rusDictionary.put("in mobiles.", "в мобильных.");*/

        /*armDictionary.put("in tvs.", "հեռուստացույցներում:");
        engDictionary.put("in tvs.", "in tvs.");
        rusDictionary.put("in tvs.", "в телевизорах.");*/

        /*armDictionary.put("in washing machines.", "լվացքի մեքենաներում:");
        engDictionary.put("in washing machines.", "in washing machines.");
        rusDictionary.put("in washing machines.", "в стиральных машинах.");*/

        /*armDictionary.put("in cameras.", "տեսախցիկներում:");
        engDictionary.put("in cameras.", "in cameras.");
        rusDictionary.put("in cameras.", "в камерах.");*/

        /*armDictionary.put("in playing consoles.", "խաղային կոնսոլներում:");
        engDictionary.put("in playing consoles.", "in playing consoles.");
        rusDictionary.put("in playing consoles.", "в игровых приставках.");*/

        /*armDictionary.put("in audio systems.", "աուդիո համակարգերում:");
        engDictionary.put("in audio systems.", "in audio systems.");
        rusDictionary.put("in audio systems.", "в аудиосистемах.");*/

        /*armDictionary.put("in vacuum cleaners.", "փոշեկուլներում:");
        engDictionary.put("in vacuum cleaners.", "in vacuum cleaners.");
        rusDictionary.put("in vacuum cleaners.", "в пылесосах.");*/

        /*armDictionary.put("in printers.", "տպիչ սարքերում:");
        engDictionary.put("in printers.", "in printers.");
        rusDictionary.put("in printers.", "в принтерах.");*/

        /*armDictionary.put("in dish washers.", "աման լվացող մեքենաներում:");
        engDictionary.put("in dish washers.", "in dish washers.");
        rusDictionary.put("in dish washers.", "в посудомоечных машинах.");*/

        /*armDictionary.put("1: Laptop", "1: Նոութբուք");
        engDictionary.put("1: Laptop", "1: Laptop");
        rusDictionary.put("1: Laptop", "1: Ноутбук");*/

        /*armDictionary.put("2: Mobile", "2: Հեռախոս");
        engDictionary.put("2: Mobile", "2: Mobile");
        rusDictionary.put("2: Mobile", "2: Мобильный");*/

        /*armDictionary.put("3: TV", "3: Հեռուստացույց");
        engDictionary.put("3: TV", "3: TV");
        rusDictionary.put("3: TV", "3: Телевизор");

        armDictionary.put("1: Washing machine", "1: Լվացքի մեքենա");
        engDictionary.put("1: Washing machine", "1: Washing machine");
        rusDictionary.put("1: Washing machine", "1: Стиральная машина");

        armDictionary.put("2: Camera", "2: Տեսախցիկ");
        engDictionary.put("2: Camera", "2: Camera");
        rusDictionary.put("2: Camera", "2: Камера");

        armDictionary.put("3: Playing console", "3: Խաղային կոնսոլ");
        engDictionary.put("3: Playing console", "3: Playing console");
        rusDictionary.put("3: Playing console", "3: Игровая приставка");

        armDictionary.put("4: Audio system", "4: Աուդիո համակարգ");
        engDictionary.put("4: Audio system", "4: Audio system");
        rusDictionary.put("4: Audio system", "4: Аудиосистема");

        armDictionary.put("5: Vacuum cleaner", "5: Փոշեկուլ");
        engDictionary.put("5: Vacuum cleaner", "5: Vacuum cleaner");
        rusDictionary.put("5: Vacuum cleaner", "5: Пылесос");

        armDictionary.put("6: Printer", "6: Տպիչ սարք");
        engDictionary.put("6: Printer", "6: Printer");
        rusDictionary.put("6: Printer", "6: Принтер");

        armDictionary.put("7: Dish washer", "7: Աման լվացող մեքենա");
        engDictionary.put("7: Dish washer", "7: Dish washer");
        rusDictionary.put("7: Dish washer", "7: Посудомоечная машина");

        armDictionary.put("Please, select filter.", "Խնդրում եմ, ընտրեք զտիչը:");
        engDictionary.put("Please, select filter.", "Please, select filter.");
        rusDictionary.put("Please, select filter.", "Пожалуйста, выберите фильтр.");

        armDictionary.put("All", "բոլորը");
        engDictionary.put("All", "all");
        rusDictionary.put("All", "все");

        armDictionary.put("Price", "գին");
        engDictionary.put("Price", "price");
        rusDictionary.put("Price", "цена");

        armDictionary.put("Model", "մոդել");
        engDictionary.put("Model", "model");
        rusDictionary.put("Model", "модел");

        armDictionary.put("Color", "գույն");
        engDictionary.put("Color", "color");
        rusDictionary.put("Color", "цвет");

        armDictionary.put("RAM", "օպերատիվ հիշողություն");
        engDictionary.put("RAM", "RAM");
        rusDictionary.put("RAM", "ОЗУ");

        armDictionary.put("OS", "օպերացիոն համակարգ");
        engDictionary.put("OS", "operating system");
        rusDictionary.put("OS", "операционная система");

        armDictionary.put("Smart", "սմարթ");
        engDictionary.put("Smart", "smart");
        rusDictionary.put("Smart", "смарт");

        armDictionary.put("Manufacturer country", "արտադրող երկիր");
        engDictionary.put("Manufacturer country", "manufacturer country");
        rusDictionary.put("Manufacturer country", "страна изготовитель");

        armDictionary.put("Pixel", "պիքսել");
        engDictionary.put("Pixel", "pixel");
        rusDictionary.put("Pixel", "пиксель");

        armDictionary.put("Colored", "գունավոր");
        engDictionary.put("Colored", "colored");
        rusDictionary.put("Colored", "цветной");

        */
    }


}
