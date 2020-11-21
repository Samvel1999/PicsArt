package data;

import model.Student;

import java.io.BufferedReader;
import java.io.FileReader;

public class DataLoader {
    public Student[] insertDataIntoStudent(String path) {
        try {
            BufferedReader studentsReader1 = new BufferedReader(new FileReader(path));
            BufferedReader studentsReader2 = new BufferedReader(new FileReader(path));
            String s;
            int n = 0;
            while(studentsReader1.readLine() != null) {
                n++;
            }

            Student[] students = new Student[n];
            int i = 0;

            while ((s = studentsReader2.readLine()) != null) {
                String[] data = s.split(",");

                students[i] = new Student();
                students[i].setFirstName(data[0]);
                students[i].setLastName(data[1]);
                students[i].setYear(Integer.parseInt(data[2]));
                students[i].setGender(data[3].charAt(0));
                students[i].setMark(Double.parseDouble(data[4]));
                i++;
            }

            return students;
        }
        catch (Exception e) {
            System.out.println("File is not found");
            return null;
        }
    }
}
