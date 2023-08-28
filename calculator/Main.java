package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1, num2;
        char operator;

        System.out.print("input expression what you want to operate");
        System.out.println("ex) 4 + 5");
        System.out.println("expression : ");
        String expression = br.readLine();

        StringTokenizer st = new StringTokenizer(expression);
        num1 = Integer.parseInt(st.nextToken());
        operator = st.nextToken().charAt(0);
        num2 = Integer.parseInt(st.nextToken());

        int result;
        Calculator cal;

        switch (operator) {
            case '+':
                // TODO create Sum
                cal = new Sum();
                break;
            case '-':
                // TODO create Min
                cal = new Min();
                break;
            case '*':
                // TODO create Mul
                cal = new Mul();
                break;
            case '/':
                // TODO create Div
                cal = new Div();
                break;
            default:
        }
        result = cal.apply(num1, num2);
        System.out.println("answer is " + result);
    }
}
