package _2_OCP_Open_Closed_Principle;

public class Main {
    public static void main(String[] args) {
        Mathematics mathematics = new Mathematics();
        History history = new History();
        System.out.println(mathematics.calculate(80));
        System.out.println(history.calculate(70));
    }
}
