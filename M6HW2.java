import java.util.Scanner;

/**
 * M6HW2
 */
/* Dayvion Peoples
*/
public class M6HW2
{

    public static void main(String[] args)
    {
        // declare variables
        double previous_months, end_month, month_charge, water_usage;
        final double WATER = 0.20, FEE = 50;
        String name;

        // input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the homeowner's name:");
        name = in.next();
        System.out.print("Enter the previous months reading:");
        previous_months = in.nextInt();
        System.out.print("Enter the current months reading:");
        end_month= in.nextInt();
        System.out.print("Enter the charge for the month:");
        month_charge = in.nextInt();

        //calculations
        water_usage = previous_months + end_month + WATER;
        month_charge = water_usage + FEE;

         //output
        System.out.println("Homewoner: " + name);
        System.out.println("Previous reading: " + previous_months);
        System.out.println("Current reading: " + end_month);
        System.out.println("Month charge: " + month_charge);
        in.close();
    }
}