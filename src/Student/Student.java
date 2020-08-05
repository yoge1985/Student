package Student;

public class Student {

    private String firstName;
    private String lastName;
    private int number;

    public Student(String firstName, String lastName, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
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