package service;

import mergeSort.MergeSortByMark;
import mergeSort.MergeSortByYear;
import model.Student;

public class StudentService {
    //Task 1: Print full names of students.
    public void printFullNames(Student[] students) {
        System.out.println("------Full names of students------");
        for(Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
        System.out.println("----------------------------------");
    }

    //Task 2: Print all male students.
    public void printAllMaleStudents(Student[] students) {
        System.out.println("-----------Male students-----------");
        for(Student student : students) {
            if(student.getGender() == 'm') {
                System.out.println(student);
            }
        }
        System.out.println("-----------------------------------");
    }

    //Task 3: Print all female students who has mark greater then 50.4.
    public void printAllFemaleStudentsWithSpecificMark(Student[] students) {
        System.out.println("---Female students who has mark grater than 50.4----");
        for (Student student : students) {
            if(student.getGender() == 'f' && student.getMark() > 50.4) {
                System.out.println(student);
            }
        }
        System.out.println("----------------------------------------------------");
    }

    //Task 4: Print student information having minimal mark.
    public void printStudentWithMinimalMark(Student[] students) {
        System.out.println("------------Student with minimal mark----------");
        Student minMarkStudent = students[0];
        int n = students.length;

        for(int i = 0; i < n; i++) {
            if(minMarkStudent.getMark() > students[i].getMark()) {
                minMarkStudent = students[i];
            }
        }
        System.out.println(minMarkStudent);
        System.out.println("------------------------------------------------");
    }

    //Task 5: Print biggest male student information.
    public void printBiggestMaleStudent(Student[] students) {
        System.out.println("-------Biggest Male Student------");
        Student biggestMaleStudent = students[0];
        int n = students.length;

        for(int i = 1; i < n; i++) {
            if(biggestMaleStudent.getYear() > students[i].getYear() && students[i].getGender() == 'm') {
                biggestMaleStudent = students[i];
            }
        }

        System.out.println(biggestMaleStudent);
        System.out.println("---------------------------------");

    }

    //Task 6: Print students sorted by mark.
    public void printStudentsSortedByMark(Student[] students) {
        int n = students.length;

        MergeSortByMark.sort(students, 0, n - 1);
        System.out.println("----Students sorted by mark-----");
        for(Student student : students) {
            System.out.println(student);
        }
        System.out.println("--------------------------------");
    }

    //Task 7: Print female students sorted by year.
    public void printFemaleStudentsSortedByYear(Student[] students) {
        int n = students.length;
        MergeSortByYear.sort(students, 0, n - 1);
        System.out.println("----Female students sorted by year-----");
        for(Student student : students) {
            if(student.getGender() == 'f') {
                System.out.println(student);
            }
        }
        System.out.println("---------------------------------------");
    }


}
