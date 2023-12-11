package _5_DIP_Dependency_Inversion_Principle;

public class Main {
    public static void main(String[] args) {
        StudentImp undergraduateStudent = new UndergraduateStudent("Student_1", "Computer Engineering");
        StudentImp masterStudent = new MasterStudent("Student_2", "Faculty of Management");

        StudentService undergraduateStudentService = new StudentService(undergraduateStudent);
        undergraduateStudentService.studentInfoView();

        StudentService masterStudentService = new StudentService(masterStudent);
        masterStudentService.studentInfoView();
    }
}
