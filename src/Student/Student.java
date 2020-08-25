package Student;

import Course.Course;
import Course.CourseList;

public class Student {

    private String firstName;
    private String lastName;
    private int number;
    private CourseList courseList;

    public Student(String firstName, String lastName, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.courseList = new CourseList();
    }
    public void addCourse(Course course){
        courseList.addCourse(course);
    }

    public String getCourseListString(){
        return "student" + toString() + " is registered to:\n" + courseList.getAllTitles();
    }


    @Override
    public String toString() {
        return lastName + ", " + firstName + " (" + number + ")";
    }

    public boolean equals(Student student) {
        if (this.firstName.equals(student.firstName) && this.lastName.equals(student.lastName) &&
                this.number == student.number) {
            return true;
        } else {
            return false;
        }
    }
}