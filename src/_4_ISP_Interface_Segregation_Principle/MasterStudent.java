package _4_ISP_Interface_Segregation_Principle;

public class MasterStudent implements MasterStudentImp{
    private String name;
    private String faculity;

    public MasterStudent(String name, String faculity){
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

        System.out.println("I am a Master student");
    }

    @Override
    public void toStudy() {

        System.out.println("I am studying");
    }

    @Override
    public void mastersThesisWork() {
        System.out.println("I am doing a Thesis");
    }
}
