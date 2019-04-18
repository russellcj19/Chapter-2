import java.util.Scanner;

public class Eggs {

    public static  void main(String[]args){
        int eggsInDoz = 12;
        double dozenEggsCost = 3.25;
        double individualEggsNotDozCost = .45;
        int userEntryEggs;
        double costOfDoz;
        double costOfRem;
        double numberOfDoz;
        double costOfTotal;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of eggs orderd >>>>>");
        userEntryEggs = input.nextInt();

        numberOfDoz = userEntryEggs / eggsInDoz;

        int eggsRemaning = userEntryEggs % 12;

        costOfDoz = numberOfDoz * dozenEggsCost;
        costOfRem = eggsRemaning * individualEggsNotDozCost;
        costOfTotal = costOfDoz + costOfRem;

        System.out.println(" You ordered " + userEntryEggs + " eggs. That's " + numberOfDoz + " dozen at "
                + dozenEggsCost + " per  dozen and " + eggsRemaning + " loose eggs at " + individualEggsNotDozCost +
        " cents each for a total of $" + costOfTotal);




    }
}
