import java.util.Scanner;
public class ArithmeticDemo2 {
    public static void main(String[] args){
        double firstNumber;
        double secoundNumber;
        double sum;
        double difference;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an double >>");
        firstNumber = input.nextDouble();
        System.out.print("Please enter another double >>");
        secoundNumber = input.nextDouble();
        sum = firstNumber + secoundNumber;
        difference = firstNumber - secoundNumber;
        average = sum / 2;
        System.out.println(firstNumber + " + " + secoundNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secoundNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secoundNumber + " is " + average);

    }
}