import java.util.Scanner;

public class NauticalMiles
{
    public static void main(String[] args)
    {
      final double NUM_OF_KM = 1.852;
        final double NUM_OF_MI = 1.150779;
        double entry;
        double miles;
        double kilometers;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter nautical miles >>>>> ");
        entry = input.nextInt();

        kilometers = entry * NUM_OF_KM;
        miles = entry * NUM_OF_MI;

        System.out.println(entry + " Nautical Miles equal " + kilometers +
                " Kilometers and " + miles + " miles");



    }

}