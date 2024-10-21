import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String pattern = "^[a-zA-Z]+$";
        int age = 0;
        int favNum = 0;
        double salary = 0;
        double constrained = 0; // must be between 100 and 10000
    /*
        firstName = getNonZeroLenString(in,"Enter your first name");

        System.out.println("Name is " + firstName);

        age = getInt(in, "Enter your age");
        System.out.println("You said your age is " + age);

        salary = getDouble(in, "Enter your salary");
        System.out.println("Salary is " + salary);

        favNum = getRangedInt(in, "Enter your favorite number", 1, 10);
        System.out.println("Favorite number is " + favNum);

        constrained = getRangedDouble(in, "Enter the constrained double", 100, 10000);
        System.out.println("Constrained is " + constrained)

        String result = getRegExString(in, "Enter a string that contains only letters: ", pattern);
        System.out.println("Valid input: " + result);

*/




    }

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
     * Gets a Y or N from the user and returns the equivalent true or false
     *
     * @param pipe scanner to use for input
     * @param prompt tells the user what to enter
     * @return true or false based on Y or N
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = false;
        String YNResponse = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            YNResponse = pipe.nextLine();

            if (YNResponse.matches("YyNn"))
            {
                System.out.println("You must enter [Y/N]: ");
            }
            else
            {
                done = true;
                switch (YNResponse)
                {
                    case "Y":
                    case "y":
                        retVal = true;
                        break;
                    case "N":
                    case "n":
                        retVal = false;
                        break;
                }
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