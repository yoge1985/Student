package Course;

import Main.StudentList;
import Student.Student;

public class Course {

    private final int MAX_SIZE_WAIT_LIST = 100;
    private String title;
    private String shortTitle;
    private int maxClassSize;
    private StudentList classList;
    private StudentList waitList;

    public Course(String title, String shortTitle, int maxClassSize) {
        this.title = title;
        this.shortTitle = shortTitle;
        this.maxClassSize = maxClassSize;
        this.classList = new StudentList(maxClassSize);
        this.waitList = new StudentList(MAX_SIZE_WAIT_LIST);
    }

    //registers student and assigns him to the relevant list
    public void register(Student student){
        if (classList.contains(student)){
            System.out.println(student.toString() + " already is registered to " + shortTitle);
        }else if (maxClassSize > classList.getCurrentNumberOfStudentsInArray()){
            classList.addStudent(student);
            student.addCourse(this);
            System.out.println(student.toString() + " has been added to " + shortTitle);
        }else if (MAX_SIZE_WAIT_LIST > waitList.getCurrentNumberOfStudentsInArray()){
            waitList.addStudent(student);
            System.out.println(student.toString() + " has been added to wait list");
        }else {
            System.out.println("wait list is full for " + shortTitle);
        }

    }

    public void withdraw(Student student){
        if (classList.contains(student)){
            //remove student from the class list
            classList.removeStudent(student);
            System.out.println("the student " + student + " has been removed from " + getTitles());
            //remove the subject from the student's list of subjects
            student.removeCourse(this);
            //add student on waiting list (if applicable) to the class list
            if (waitList != null){
                for (int i = 0; i < 1; i++){
                    Student[] students = waitList.getStudents();
                    Student students1 = students[i];
                    classList.addStudent(students1);
                    waitList.removeStudent(students1);
                }
            }

        }else if (waitList.contains(student)){
            waitList.removeStudent(student);
            System.out.println("the student " + student + " has been removed from the waitlist of " + getTitles());
        }else {
            System.out.println("the student" + student + " is not on any list of " + getTitles());
        }
    }

    public String getTitles(){
        return shortTitle + " - " + title;
    }

    @Override
    public String
    toString() {

        return getTitles() + "\nclass list:\n " + classList + "\nwait list:\n" + waitList;
    }
}
