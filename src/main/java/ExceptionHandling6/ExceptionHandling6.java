package ExceptionHandling6;
import java.util.Scanner;

public class ExceptionHandling6 {
    public static double divide(double x, double y) throws DivisionByZeroException, ResultIsAlwaysZeroException
    {
        double result;
        System.out.println("\nExecuting divide() ...");
        if (y == 0)
            throw new DivisionByZeroException("Error: Division by Zero Detected; Cannot Perform Division.");
        else if (x == 0)
            throw new ResultIsAlwaysZeroException("Trivial Division; Result is Always 0.");
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
        catch(DivisionByZeroException e)
        {
            String s = e.getMessage();
            System.out.println(s);
            System.out.print("However, you will be given another chance to perform a correct division: ");

            try
            {
                System.out.print("\nPlease enter two new values to perform a division: ");
                d1 = kb.nextDouble();
                d2 = kb.nextDouble();
                divide(d1, d2);
            }catch(DivisionByZeroException e2) // Notice the different object name here. Why?
            {
                s = e2.getMessage();
                System.out.println(s);
                System.out.print("You have exhausted your last chance to perform a correct division: ");
                System.out.print("Program will terminate.");
                System.exit(0);
            }
            catch(ResultIsAlwaysZeroException e2)
            {
                s = e2.getMessage();
                System.out.println(s);
            }


        }
        catch(ResultIsAlwaysZeroException e)
        {
            String s = e.getMessage();
            System.out.println(s);
        }

        System.out.print("Program reached last statement.");
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

    public String getMessage()
    {
        return super.getMessage();
    }
}


class ResultIsAlwaysZeroException extends Exception
{
    // Constructor
    public ResultIsAlwaysZeroException()
    {
        super("Trivial Division ... Result is Always 0.");
    }

    // A constructor that takes a String parameter
    public ResultIsAlwaysZeroException(String s)
    {
        // Allows the possibility to display any other desired exception message
        super(s);
    }

    public String getMessage()
    {
        return super.getMessage();
    }
}
