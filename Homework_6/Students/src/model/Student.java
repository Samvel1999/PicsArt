package model;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private char gender;
    private double mark;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1980 && year <= LocalDate.now().getYear()) {
            this.year = year;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'm' || gender == 'f'){
            this.gender = gender;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if(mark >= 0 && mark <= 100) {
            this.mark = mark;
        }
        else {
            System.out.println("Wrong data");
        }
    }

    @Override
    public String toString() {
        return "FirstName: " + getFirstName() + "\n" +
                "LastName: " + getLastName() + "\n" +
                "Year: " + getYear() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Mark: " + getMark() + "\n" +
                "----------------------------";
    }
}
