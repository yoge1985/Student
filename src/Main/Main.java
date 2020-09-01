package Main;

import Course.Course;
import Student.Student;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Miranda", "Frost", 123001);
        Student s2 = new Student("Mister", "Bullion", 123002);
        Student s3 = new Student("Natalya", "Simonova", 123003);
        Student s4 = new Student("Boris", "Grishenko", 123004);
        Student s5 = new Student("Sacha", "Davidov", 123005);
        Student s6 = new Student("Paris", "Carver", 123006);
        Student s7 = new Student("Henry", "Gupta", 123007);
        Student s8 = new Student("Xenia", "Onatopp", 123008);
        Student s9 = new Student("Hugo", "Drax", 123009);
        Student s10 = new Student("Valentin", "Zukovsky", 123010);
        Student s11 = new Student("Arkady Grigorovich", "Ourumov", 123011);
        Student s12 = new Student("Dmitri", "Mishkin", 123012);
        Student s13 = new Student("Vesper", "Lynd", 123013);
        Student s14 = new Student("Alec", "Trevelyan", 123014);
        Student s15 = new Student("Francisco", "Scaramanga", 123015);
        Student s16 = new Student("Christmas", "Jones", 123016);
        Student s17 = new Student("Wai", "Lin", 123017);
        Student s18 = new Student("Elektra", "King", 123018);

        Course comp1010 = new Course("Introductory Computer Science 1", "COMP1010", 6);
        Course comp1020 = new Course("Introductory Computer Science 2", "COMP1020", 5);
        Course comp2150 = new Course("Object Orientation", "COMP2150", 4);
        Course comp3350 = new Course("Software Engineering 1", "COMP3350", 3);

        comp1010.register(s1);
        comp2150.register(s1);
        comp1010.register(s2);
        comp1010.register(s3);
        comp1010.register(s4);
        comp1010.register(s5);
        comp1010.register(s6);
        comp1010.register(s7);
        comp1010.register(s8);
        System.out.println("\n" + comp1010);

        //Course list titles of s1:
        System.out.println(s1.getCourseListString());

        //Testing withdraws
        comp1010.withdraw(s10);
        System.out.println("\n" + comp1010);

        comp1010.withdraw(s7);
        System.out.println("\n" + comp1010);

        comp1010.withdraw(s1);
        System.out.println("\n" + comp1010);

        comp1010.withdraw(s2);
        System.out.println("\n" + comp1010);

        //once more, printing the course list titles of s1
        System.out.println(s1.getCourseListString());

//        comp1020.withdraw(s3);
//        System.out.println("\n" + comp1020);
//        System.out.println("================");
//        System.out.println(s3.getCourseListString());



    }
}
