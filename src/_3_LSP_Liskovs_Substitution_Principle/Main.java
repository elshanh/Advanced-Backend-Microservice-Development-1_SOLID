package _3_LSP_Liskovs_Substitution_Principle;

public class Main {
    static void introducingYourSelf(Student student) {
        student.introducingYourSelf();
    }

    public static void main(String[] args) {
        Student student = new Student("Student1_Name","Student1_Surname");
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Student2_Name","Student2_Surname");

        introducingYourSelf(student);
        introducingYourSelf(undergraduateStudent);

        undergraduateStudent.registryFaculity();
    }
}
