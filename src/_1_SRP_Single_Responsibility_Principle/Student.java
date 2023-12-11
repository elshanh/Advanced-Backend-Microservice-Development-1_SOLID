package _1_SRP_Single_Responsibility_Principle;

public class Student {
    private String name;
    private String surname;
    private String faculity;

    public Student(String name, String surname, String faculity) {
        this.name = name;
        this.surname = surname;
        this.faculity = faculity;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculity() {
        return faculity;
    }

}
