package homework_4.model;

import homework_4.service.UserService;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public void setFullName(String fullName) {

        Pattern pattern = Pattern.compile("([A-Z])([a-z]+)\\s([A-Z])([a-z]+)");
        Matcher matcher = pattern.matcher(fullName);

        if(matcher.matches()) {
            this.fullName = fullName;
        }
        else {
            throw new RuntimeException("Invalid fullName");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        UserService userService = new UserService();
        Set<String> userNameSet = userService.getAllUsernames();
        if (!userNameSet.contains(username)) {
            if (username.length() > 10) {
                this.username = username;
            } else {
                throw new RuntimeException("Invalid userName");
            }
        } else {
            throw new RuntimeException("There is a user with this userName");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern validEmail =
                Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = validEmail.matcher(email);

        if(matcher.matches()) {
            this.email = email;
        }
        else {
            throw new RuntimeException("Invalid email format");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
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

            if(countOfUppercaseLetters != 2 || countOfNumbers != 3) {
                throw new RuntimeException("Invalid password");
            }
            this.password = password;
        }
        else {
            throw new RuntimeException("Invalid password");
        }
        this.password = password;
    }
}
