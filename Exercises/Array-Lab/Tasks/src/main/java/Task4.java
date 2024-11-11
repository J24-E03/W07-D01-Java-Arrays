import java.util.Scanner;

public class Task4{

    public static void main(String[] args) {

        //Variable definition and assignment
        int first, second;
        Scanner obj = new Scanner(System.in); /* create a object */

        //Taking user input
        System.out.print("Enter an integer: ");
        first = obj.nextInt();
        System.out.print("Enter a second integer: ");
        second = obj.nextInt();

        //Add the numbers
        int sum = first + second;

        //Print the output
        System.out.println("The sum of two integers "+first+" and "+second+" is: "+sum);
    }
}