package arithmetic;

import java.util.Scanner;
import arithmetic.ArithmeticBase.Operation;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArithmeticBase r = new ArithmeticBase();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int n = in.nextInt();
        
        System.out.println("Enter second number: ");
        int m = in.nextInt();
        
        System.out.println("Enter arithmetic operation (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationInput = in.next().toUpperCase();

        try {
            Operation operation = Operation.valueOf(operationInput);
            double result = r.calculate(n, m, operation);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation. Please enter one of the following: PLUS, MINUS, TIMES, DIVIDE.");
        }
    }
}
