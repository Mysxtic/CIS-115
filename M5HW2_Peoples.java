import java.util.Scanner;

/**
 * M5HW2_Peoples
 */
public class M5HW2_Peoples
{

    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        // variables
        String choice = "yes";
        while(choice.equalsIgnoreCase("yes"))
        {
            final double PRICE = 4.79, SALRY = 2000;
            int widgets_sold, totalwidgetsold = 0, weeks = 4 + 1, i, widgets_returned, totalwidgetreturned = 0;
            double widget_sales_amount, comm_amount, salary;
            String name;
            System.out.println("Enter Salesperson name ");
            name = k.nextLine();
            for(i = 1; i < weeks; i++)
            {
            System.out.print("Enter widgets sold for week # " + i +":");
            widgets_sold = k.nextInt();
            totalwidgetsold += widgets_sold;

            }
            System.out.println("Total widgets Sold: " + totalwidgetsold);
            // widgets returned for loop
            for(i = 1; i < weeks; i++)
            {
            System.out.print("Enter widgets returned for week # " + i +":");
            widgets_returned = k.nextInt();
            totalwidgetreturned += widgets_returned;

            }
            System.out.println("Total widgets Returned: " + totalwidgetsold);
            
            
            /*System.out.println("M5HW2 Solution"); */
            System.out.println();
            System.out.println("Would you like to run the program again? Enter yes or no.");
            choice = k.next();
        }
        k.close();
        System.out.println();
        System.out.println("Program has exited!");
    }
}