package Student;

public class StudentList {

    private Student[] students;
    private int maxNumberInArray;
    private int currentNumberOfStudentsInArray;

    public StudentList(int maxNumberInArray) {
        this.students = new Student[maxNumberInArray];
        this.maxNumberInArray = maxNumberInArray;
        this.currentNumberOfStudentsInArray = currentNumberOfStudentsInArray;
    }

    //checks to see if student already exists in list.
    public boolean contains(Student student) {
        for (int i = 0; i < this.students.length; i++) {
            if (student.equals(i)) {
                return true;
            }
        }return false;
    }
}
