package main;

import data.DataLoader;
import model.Student;
import service.StudentService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        DataLoader dataLoader = new DataLoader();
        String path = "C:\\Users\\Samvel\\Desktop\\Students.txt";
        Student[] students = dataLoader.insertDataIntoStudent(path);
        StudentService studentService = new StudentService();

        studentService.printFullNames(students);
        studentService.printAllMaleStudents(students);
        studentService.printAllFemaleStudentsWithSpecificMark(students);
        studentService.printStudentWithMinimalMark(students);
        studentService.printBiggestMaleStudent(students);
        for(Student student : students) {
            System.out.println(student);
        }
        studentService.printStudentsSortedByMark(students);
        for(Student student : students) {
            System.out.println(student);
        }
        studentService.printFemaleStudentsSortedByYear(students);
    }
}
