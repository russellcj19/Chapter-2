import java.util.Scanner;

public class RemainderPractice {

    public static void main(String [] ars){

        Scanner input = new Scanner(System.in);
        double atBats;
        double hits;
        int strikeOuts;
        int walks;
        double battingAverage;

       System.out.println("Please enter the number of at bats");
        Scanner keyboard = new Scanner(System.in);
        atBats = keyboard.nextInt ();

        System.out.println("Please enter the number of at hits");
        hits = keyboard.nextInt ();

        System.out.println("Number of Strike outs");
        strikeOuts = keyboard.nextInt();

        System.out.println("How many runs did you bring in? ");
        int runs = keyboard.nextInt();

        battingAverage = hits / Double.valueOf(hits)/ Double.valueOf(atBats);

        double numberOfBaseRunnrtsLeftOnBase = hits % runs;

        System.out.println("Your batting average is " + battingAverage);
        System.out.println("The numbrt of strike outs is" + strikeOuts);

        System.out.println("Number of runners");





    }
}
