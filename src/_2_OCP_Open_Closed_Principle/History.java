package _2_OCP_Open_Closed_Principle;

public class History implements StudentCalculateExam{
    @Override
    public double calculate(double examScore) {
        return examScore * 0.5;
    }
}
