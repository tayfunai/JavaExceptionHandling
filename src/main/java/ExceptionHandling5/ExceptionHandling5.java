package ExceptionHandling5;
import java.util.Scanner;


public class ExceptionHandling5 {
    // A method that takes two double value and return the result of their division
    // This method throws an exception in case division by zero is detected
    public static double divide(double x, double y) throws Exception
    {
        double result;
        System.out.println("\nExecuting divide() ...");
        if (y == 0)
            throw new Exception("Error: Division by Zero Detected; Cannot Perform Division.");
        else
        {
            result = x/y;
            System.out.println("The result of dividing " + x + " by " + y + " is: " + result);
            return result;
        }

    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        double d1, d2;

        System.out.print("Please enter two values to perform a division: ");
        d1 = kb.nextDouble();
        d2 = kb.nextDouble();

        try
        {
            // Call divide() to perform the division
            divide(d1, d2);
        }
        catch(Exception e)
        {
            String s = e.getMessage();
            System.out.println(s + "Jonvorbek");
        }
    }


}
