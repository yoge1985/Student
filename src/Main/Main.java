package Main;

import Student.Student;

public class Main {

    public static void main(String[] args) {


        Student s1 = new Student("Miranda", "Frost", 123001);
        Student s2 = new Student("Mister", "Bullion", 123002);
        Student s3 = new Student("Natalya", "Simonova", 123003);
        Student s4 = new Student("Boris", "Grishenko", 123004);

        StudentList studentList = new StudentList(3);
        studentList.addStudent(s1);
        studentList.addStudent(s2);
        studentList.addStudent(s3);

        studentList.printInfo();



    }
}
