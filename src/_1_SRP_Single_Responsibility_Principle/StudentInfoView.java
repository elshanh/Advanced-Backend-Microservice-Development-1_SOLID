package _1_SRP_Single_Responsibility_Principle;

public class StudentInfoView {

    public void viewInfo(Student student) {
        System.out.println("Student Info:");
        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSurname());
        System.out.println("Faculity: " + student.getFaculity());
        System.out.println("-------");
    }
}
