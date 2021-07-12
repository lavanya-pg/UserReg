package userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration
{
	Scanner scanner = new Scanner(System.in);
    public static final String NAMEPATTERN = "[A-Z][A-Za-z]{2,}";

    public static void main(String[] args)
    {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.readInput();
    }
    private void readInput() //Method for reading an input.
    {
        System.out.println("Enter first name ");
        String firstName = scanner.next();
        validateInput(NAMEPATTERN,firstName);
    }

    private void validateInput(String pattern, String input)
    {

        if(Pattern.matches(pattern, input))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
