package main;

import data.DataLoader;
import model.Student;
import service.StudentService;

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
        studentService.printStudentsSortedByMark(students);
        studentService.printFemaleStudentsSortedByYear(students);
    }
}
