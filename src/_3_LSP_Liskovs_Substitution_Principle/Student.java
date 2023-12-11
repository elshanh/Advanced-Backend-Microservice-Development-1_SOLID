package _3_LSP_Liskovs_Substitution_Principle;

public class Student {
    private String name;
    private String surname;

    public Student(String name,String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.name = surname;
    }

    public void introducingYourSelf(){
        System.out.println("I am a student");
    }
}
