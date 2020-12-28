package homework_4.main;

import homework_4.exceptions.FullNameException;
import homework_4.menu.Menu;

/**
 * This project name is Electronics Supermarket
 * @author Samvel Khachatryan
 */

public class Main {
    public static void main(String[] args) throws FullNameException {
        Menu menu = new Menu();
        menu.startMenu();

    }
}
