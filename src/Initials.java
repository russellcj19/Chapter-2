import java.util.Scanner;

public class Initials {
    public static void main(String[]args){
        String userEntryOne;
        String userEntryTwo;
        String userEntryThree;

        Scanner input = new Scanner(System.in);
        System.out.println("Hello and welcome.");
        System.out.println("Please enter your first Int >>>");
        userEntryOne = input.next();
        System.out.println("Please enter your second Int >>>");
        userEntryTwo = input.next();
        System.out.println("Please enter your last Int >>>");
        userEntryThree = input.next();

        System.out.println("Your Initials = " + userEntryOne + "." + userEntryTwo + "." + userEntryThree);
    }
}
