package Course;

import Main.StudentList;
import Student.Student;

public class Course {

    private final int MAX_SIZE_WAIT_LIST = 100;
    private String title;
    private String shortTitle;
    private int MaxClassSize;
    private StudentList classList;
    private StudentList waitList;

    public Course(String title, String shortTitle, int maxClassSize) {
        this.title = title;
        this.shortTitle = shortTitle;
        MaxClassSize = maxClassSize;
        this.classList = new StudentList(maxClassSize);
        this.waitList = new StudentList(MAX_SIZE_WAIT_LIST);
    }

    //registers student and assigns him to the relevant list
    public void register(Student student){
        if (classList.contains(student)){
            System.out.println(student + " already is regeistered to " + shortTitle);
        }

    }
}
