import java.util.Scanner;

public class InchesToFeet {

    public static void main(String[]args){
        int inchesInFeet = 12;
        int userEntryInches;
        double numberofFeet;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of inches >>>>>");
        userEntryInches = input.nextInt();

        numberofFeet = userEntryInches / inchesInFeet;

       int inchesRemaning = numberofFeet % userEntryInches;

       System.out.println("You have " + numberofFeet + " Feet and " + inchesRemaning + " inches." );




    }
}
