package Main;

import Student.Student;

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
        for (int i = 0; i < this.students.length; i++) {
            if (student.equals(i)) {
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

    @Override
    public String toString() {
        String list = null;

        for (int i = 0; i < currentNumberOfStudentsInArray; i++) {

            list = students[i].toString();
        }
        return list;
    }
}
