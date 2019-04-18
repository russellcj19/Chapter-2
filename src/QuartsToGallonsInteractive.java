import java.util.Scanner;

public class QuartsToGallonsInteractive {

    public static void main (String [] args){
        int numberOfQuartsInputed;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of quarts needed to do the job >>> ");
        numberOfQuartsInputed = keyboard.nextInt();

        displayMath(numberOfQuartsInputed);


        }

        public static void displayMath(int numberOfQuartsInputed){
        final int NUMBER_QUARTS_IN_GALLON = 4;
        int remainderOfQuarts;
        int numberOfGallons;
        numberOfGallons = numberOfQuartsInputed / NUMBER_QUARTS_IN_GALLON;
        remainderOfQuarts = numberOfQuartsInputed % NUMBER_QUARTS_IN_GALLON;

        System.out.println("The numbrt of gallons ordered is  " + numberOfGallons +
                "and the number of quarts remaining is " + remainderOfQuarts);

    }

}

