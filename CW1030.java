/**
 * CW1030
 * program will demo repition structures
 */
import java.util.Scanner;
public class CW1030 
{

    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        /*String choice = "yes";
        while(choice.equalsIgnoreCase("yes"))
        {
            System.out.println("Dayvion");
            System.out.print("Would you like to run the program again? Enter yes or no: ");
            choice = k.next();
        }
        System.out.println("Program has exited");
        */
        System.out.print("Enter number of grades to average: ");
        int num = k.nextInt();
        int count;
        double total = 0; // acumulator must be initialized to zero
        for(count = 0; count < num; count++)
        {
            System.out.print("Enter a grade: ");
            int grade = k.nextInt();
            total += grade; // total = grade + 0
        }
        System.out.print(total);
        k.close();
    }
}