package homework_4.model;

import homework_4.exceptions.EmailException;
import homework_4.exceptions.FullNameException;
import homework_4.exceptions.PasswordException;
import homework_4.exceptions.UsernameException;
import homework_4.service.UserService;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>Name and surname(fullName) must begin with uppercase letter.
 * Between them is one space.</p>
 * <p>Length of username must be greater than 5. Username must begin with
 * uppercase letter and it is one word.</p>
 * <p>Email must be in standard email format.</p>
 * <p>Password contains at least 2 uppercase letters
 * and 3 numbers. Length of password is greater than 8.</p>
 */

public class User {

    private Integer id;
    private String fullName;
    private String username;
    private String email;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws FullNameException {

        Pattern pattern = Pattern.compile("([A-Z])([a-z]+)\\s([A-Z])([a-z]+)");
        Matcher matcher = pattern.matcher(fullName);

        if(matcher.matches()) {
            this.fullName = fullName;
        }
        else {
            throw new FullNameException("Invalid message");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws UsernameException {
        UserService userService = new UserService();
        Set<String> userNameSet = userService.getAllUsernames();
        Pattern pattern = Pattern.compile("([A-Z])([a-z]+)");
        Matcher matcher = pattern.matcher(username);

        if (!userNameSet.contains(username)) {
            if (username.length() > 5 && matcher.matches()) {
                this.username = username;
            } else {
                throw new UsernameException("Invalid userName");
            }
        } else {
            throw new UsernameException("There is a user with this userName");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
        Pattern validEmail =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = validEmail.matcher(email);

        if(matcher.matches()) {
            this.email = email;
        }
        else {
            throw new EmailException("Invalid email format");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        int countOfUppercaseLetters = 0;
        int countOfNumbers = 0;

        int len = password.length();
        if(len > 8) {
            for (int i = 0; i < len; i++) {
                String symbol = password.substring(i, i + 1);
                if(symbol.matches("[A-Z]")) {
                    countOfUppercaseLetters++;
                }

                if(symbol.matches("[0-9]")) {
                    countOfNumbers++;
                }
            }

            if(countOfUppercaseLetters < 2 || countOfNumbers < 3) {
                throw new PasswordException("Invalid password");
            }
            this.password = password;
        }
        else {
            throw new PasswordException("Invalid password");
        }
        this.password = password;
    }
}
