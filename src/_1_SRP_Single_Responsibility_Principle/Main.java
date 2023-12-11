package _1_SRP_Single_Responsibility_Principle;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Student_Name_1", "Student_Surname_1", "Computer Engineering");

        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Faculity: " + student.getFaculity());
        System.out.println("-------");

        StudentInfoView studentInfoView = new StudentInfoView();
        studentInfoView.viewInfo(student);
    }
}
