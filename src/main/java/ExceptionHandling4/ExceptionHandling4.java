package ExceptionHandling4;
import java.util.Scanner;

public class ExceptionHandling4{

    // A method that takes two double value and return the result of their division
    public static double divide_1(double x, double y)
    {
        // This method simply does not do/handle anything about exceptions
        double result = x/y;
        System.out.println("\nExecuting divide_1() ...");
        System.out.println("The result of dividing " + x + " by " + y + " is: " + result);
        return result;
    }

    // A method that takes two double value and return the result of their division
    public static double divide_2(double x, double y)
    {
        // This method actually handles special cases without exception handling
        // techniques.
        double result;
        System.out.println("\nExecuting divide_2() ...");

        if (y != 0)
        {
            result = x/y;
            System.out.println("The result of dividing " + x + " by " + y + " is: " + result);
            return result;
        }
        else
        {
            System.out.println("Cannot perform division by 0. Will return \"-0\" as an indication of error. ");
            return -0;
        }
    }


    // A method that takes two double value and return the result of their division
    public static double divide_3(double x, double y)
    {
        // This method use exception handling techniques to catch and handle
        // potential errors/exceptions
        double result;
        System.out.println("\nExecuting divide_3() ...");
        try
        {
            if (y == 0)
                throw new DivisionByZeroException();
            else
            {
                result = x/y;
                System.out.println("The result of dividing " + x + " by " + y + " is: " + result);
                return result;
            }
        }
        catch(DivisionByZeroException e)
        {
            String s = e.getMessage();
            System.out.println(s);
            return -0;
        }

    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        double d1, d2;

        System.out.print("Please enter two values to perform a division: ");
        d1 = kb.nextDouble();
        d2 = kb.nextDouble();

        // Call divide_1() to perform the division
        divide_1(d1, d2);

        // Call divide_2() to perform the division
        divide_2(d1, d2);

        // Call divide_3() to perform the division
        divide_3(d1, d2);


    }

}



class DivisionByZeroException extends Exception
{
    // Constructor
    public DivisionByZeroException()
    {
        // Since this class is particular for this type of errors; that is,
        // division by zero, a message to that effect can be coded to that effect
        super("Error ... Division by zero detected. Cannot perform division operation.");
    }

    // A constructor that takes a String parameter
    public DivisionByZeroException(String s)
    {
        // Allows the possibility to display any other desired exception message
        super(s);
    }

    public String getMessage()	// Does this method do much? Why or why not?
    {
        return super.getMessage();
    }
}
