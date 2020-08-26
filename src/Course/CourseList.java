package Course;

public class CourseList {

    private final int MAX_COURSES_FOR_STUDENT = 100;
    private Course[] courses;
    private int currentNumberOfCoursesInList;

    public CourseList() {

        this.currentNumberOfCoursesInList = 0;
        this.courses = new Course[MAX_COURSES_FOR_STUDENT];
    }

    //returns true if the course is already in the list. false if not.
    public boolean contains(Course course){

        for (int i = 0; i < courses.length; i++) {
            if (courses[i].equals(course)) {
                System.out.println("contained");
                return true;
            }
        }
        return false;

    }
    //adds course to the list
    public void addCourse(Course course){
        courses[currentNumberOfCoursesInList] = course;
        currentNumberOfCoursesInList++;
    }

    public String getAllTitles(){
        String list = null;
        for (int i = 0; i < currentNumberOfCoursesInList; i++){
            list += courses[i].getTitles();
        }
        return list;
    }

    @Override
    public String toString() {
        String listOfCourses = " ";
        for (int i = 0; i < currentNumberOfCoursesInList; i++){
            listOfCourses += "\n" + courses[i].getTitles();
        }
        return listOfCourses;
    }
}
