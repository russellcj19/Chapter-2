import java.util.Scanner;
public class ArithmeticDemo {
    public static void main(String[] args){
        int firstNumber;
        int secoundNumber;
        int sum;
        int difference;
        int average;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer >>");
        firstNumber = input.nextInt();
        System.out.print("Please enter another integer >>");
        secoundNumber = input.nextInt();
        sum = firstNumber + secoundNumber;
        difference = firstNumber - secoundNumber;
        average = sum / 2;
        System.out.println(firstNumber + " + " + secoundNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secoundNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secoundNumber + " is " + average);

    }
}
