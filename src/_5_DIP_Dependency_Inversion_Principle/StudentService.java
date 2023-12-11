package _5_DIP_Dependency_Inversion_Principle;

public class StudentService {
    private StudentImp studentImp;
    public StudentService(StudentImp studentImp) {
        this.studentImp = studentImp;
    }

    public void studentInfoView() {
        System.out.println("Student Info:");
        System.out.println("Name: " + studentImp.getName());
        System.out.println("Faculity: " + studentImp.getFaculity());
        System.out.println("-------");
    }
}
