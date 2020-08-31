package Main;

import Student.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    private Student[] students;
    private int maxNumberIntArray;
    private int currentNumberOfStudentsInArray;

    public StudentList(int maxNumberIntArray) {
        this.currentNumberOfStudentsInArray = 0;
        this.maxNumberIntArray = maxNumberIntArray;
        this.students = new Student[maxNumberIntArray];
    }

    public int getCurrentNumberOfStudentsInArray() {
        return currentNumberOfStudentsInArray;
    }

    //checks to see if student already exists in list.
    public boolean contains(Student student) {
        for (int i = 0; i < currentNumberOfStudentsInArray; i++) {
            if (students[i].equals(student)) {
                return true;
            }
        }
        return false;
    }

    //adds student to the list if there is enough space. returns true if added; otherwise, returns false.
    public boolean addStudent(Student student) {
        if (currentNumberOfStudentsInArray < maxNumberIntArray) {
            students[currentNumberOfStudentsInArray] = student;
            currentNumberOfStudentsInArray++;
            return true;
        } else {
            return false;
        }
    }
    //removes student from list
    public void removeStudent(Student student){
        List<Student> studentsList = new ArrayList<Student>();
        Student[]anotherArray = new Student[students.length-1];
        for (int i = 0; i < currentNumberOfStudentsInArray; i++){
            if (students[i] != (student)){
                studentsList.add(students[i]);
                students = studentsList.toArray(students);
            }

//            students[i] = anotherArray[i];
        }
    }

    @Override
    public String toString() {

        String studentDetails = " ";

        for (int i = 0; i < getCurrentNumberOfStudentsInArray(); i++) {
            studentDetails += "\n" + students[i];
        }
        return studentDetails;
    }
}
