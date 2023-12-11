package _4_ISP_Interface_Segregation_Principle;

public class Student implements StudentImp{
    private String name;
    private String faculity;

    public Student(String name,String faculity){
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
        System.out.println("I am a Student");
    }

    @Override
    public void toStudy() {
        System.out.println("I am studying");
    }
}
