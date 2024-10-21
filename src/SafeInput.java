import java.util.Scanner;

public class SafeInput
{


    /**
     * gets a string from the user using the console,
     * and it must be at least one character in length
     *
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return a String of at least one character in length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do
        {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if(retVal.isEmpty())
                System.out.println("You must enter at least one character!");

        }while(retVal.length() == 0);

        return retVal;
    }

    /**
     * gets an int value from the user at the console with no contraint
     *
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return an int value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }

        }while(!done);

        return retVal;
    }

    /**
     * gets a double value from the user at the console with no contraint
     *
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return an int value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not " + trash);
            }

        }while(!done);

        return retVal;
    }

    /**
     * gets an integer from the user via console within a specified range
     *
     * @param pipe the scanner to use for input
     * @param prompt the prompt to tell the use what is required
     * @param low the low inclusive low bound
     * @param high the inclusive high bound
     * @return an int within the specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");;
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]: ");
                }

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }

        }while(!done);

        return retVal;
    }

    /**
     * gets a double from the user via console within a specified range
     *
     * @param pipe the scanner to use for input
     * @param prompt the prompt to tell the use what is required
     * @param low the low inclusive low bound
     * @param high the inclusive high bound
     * @return a double within the specified range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");;
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]: ");
                }

            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not " + trash);
            }

        }while(!done);

        return retVal;
    }

    /**
     * This method prompts the user for input and ensures that it matches a given regex pattern.
     * @param pipe The Scanner object to take input from the console.
     * @param prompt The message to display to the user.
     * @param regEx The regex pattern the input should match.
     * @return A valid string that matches the provided regex.
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String input = "";
        boolean valid = false;

        do {
            System.out.print(prompt);
            input = pipe.nextLine();


            if (input.matches(regEx)) {
                valid = true;
            } else {
                System.out.println("Input does not match the pattern. Please try again.");
            }

        } while (!valid);

        return input;
    }






















}
