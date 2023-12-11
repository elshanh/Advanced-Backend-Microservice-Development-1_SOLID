package _5_DIP_Dependency_Inversion_Principle;

public class MasterStudent implements StudentImp{
    private String name;
    private String faculity;

    public MasterStudent(String name, String faculity) {
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
}
