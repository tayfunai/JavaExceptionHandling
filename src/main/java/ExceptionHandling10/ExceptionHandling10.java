package ExceptionHandling10;

import java.util.Scanner;
import java.util.InputMismatchException;


public class ExceptionHandling10 {
    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        int x;	// To keep compiler happy!


        while(true) // go forever!
        {

            try
            {
                System.out.print("Please enter an integer value: ");
                x = kb.nextInt();
                break; // if you reach her, all is ok!
            }
            catch(InputMismatchException e)
            {
                kb.nextLine(); // Clear that input line
                System.out.println("You did not enter an integer! "
                        + "May you please enter an integer value and       nothing else: ");
            }

        } // go back to the loop

        System.out.print("Thank you! Your value is: " + x);
    }

}


