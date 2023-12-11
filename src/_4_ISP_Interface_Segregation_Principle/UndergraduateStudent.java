package _4_ISP_Interface_Segregation_Principle;

public class UndergraduateStudent implements UndergraduateStudentImp{
    private String name;
    private String faculity;

    public UndergraduateStudent(String name,String faculity){
        this.name = name;
        this.faculity = faculity;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFaculity() {
        return faculity;
    }

    @Override
    public void introducingYourSelf() {
        System.out.println("I am a Undergraduate student");
    }

    @Override
    public void toStudy() {
        System.out.println("I am studying");
    }

    @Override
    public void chooseFaculity() {
        System.out.println("Faculty selection is complete");
    }
}
