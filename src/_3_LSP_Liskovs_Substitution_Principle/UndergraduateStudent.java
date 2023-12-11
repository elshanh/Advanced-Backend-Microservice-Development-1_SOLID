package _3_LSP_Liskovs_Substitution_Principle;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name,String surname){
        super(name,surname);
    }

    public void introducingYourSelf(){
        System.out.println("I am a Undergraduate student");
    }

    public void registryFaculity(){
        System.out.println("Undergraduate registration is complete");
    }
}
