package innerproject;

public class Calculator {
	public static Double calculate(double first, double second, char operator) {
        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return null;
        }

        return result;
    }
}
