package Main;

import Student.Student;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Miranda", "Frost", 123001);
        Student s2 = new Student("Mister", "Bullion", 123002);
        Student s3 = new Student("Natalya", "Simonova", 123003);
        Student s4 = new Student("Boris", "Grishenko", 123004);

        StudentList studentList = new StudentList(3);
        boolean canAdd = false;
        canAdd = studentList.addStudent(s1);
        if (!canAdd)
            System.out.println("Cannot add student: " + s1);

        System.out.println(studentList);

        if (studentList.contains(s1))
            System.out.println("The list already contains: " + s1 + "\n");

        canAdd = studentList.addStudent(s2);
        if (!canAdd)
            System.out.println("Cannot add student: " + s2);

        System.out.println(studentList);

        canAdd = studentList.addStudent(s3);
        if (!canAdd)
            System.out.println("Cannot add student: " + s3);

        System.out.println(studentList);

        canAdd = studentList.addStudent(s4);
        if (!canAdd)
            System.out.println("Cannot add student: " + s4);

        System.out.println(studentList);



    }
}
