package calculator;

public class Min implements Calculator{

    @Override
    public int apply(int num1, int num2) {
        return num1 - num2;
    }
}
