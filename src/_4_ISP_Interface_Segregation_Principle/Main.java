package _4_ISP_Interface_Segregation_Principle;

public class Main {
    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Undergraduate Student", "Computer Engineering");
        MasterStudent masterStudent = new MasterStudent("Master Student","Faculty of Management");

        undergraduateStudent.introducingYourSelf();
        undergraduateStudent.toStudy();
        undergraduateStudent.chooseFaculity();

        System.out.println("---------------------------------------------------------------------------");

        masterStudent.introducingYourSelf();
        masterStudent.toStudy();
        masterStudent.mastersThesisWork();
    }
}
