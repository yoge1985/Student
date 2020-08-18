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
        }else if (maxClassSize-1 > classList.getCurrentNumberOfStudentsInArray()){
            classList.addStudent(student);
            System.out.println(student.toString() + " has been added to " + shortTitle);
        }else if (MAX_SIZE_WAIT_LIST > waitList.getCurrentNumberOfStudentsInArray()){
            waitList.addStudent(student);
            System.out.println(student.toString() + " has been added to wait list");
        }else {
            System.out.println("wait list is full for " + shortTitle);
        }

    }
    public String getTitles(){
        return shortTitle + " - " + title;
    }

    @Override
    public String
    toString() {
        return getTitles() + "\n " + classList.toString() + "\n" + waitList.toString();
    }
}
