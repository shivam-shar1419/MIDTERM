package arithmetic;

import java.util.Scanner;

/** This class takes input plus, minus, divide, and times from the user
 * and executes the arithmetic operation using enum.
 * The advantage of using enum is it provides type safety, better readability,
 * and prevents invalid values.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
    public double x, y;

    // Enum for arithmetic operations
    public enum Operation {
        PLUS, MINUS, TIMES, DIVIDE
    }

    double calculate(double x, double y, Operation operation) 
    {
        switch (operation) 
        {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                if (y == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + operation);
        }
    }
}
