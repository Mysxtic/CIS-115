/**
 * M4Hw1Peoples
 */
import java.util.Scanner;
public class M4Hw1Peoples 
{

    public static void main(String[] args) 
    {
        // declare variables
        int widgets_sold, widgets_returned, net_widgets_sold;
        double widget_sales_amount, commission_amount, salary, comm_rate;
        final double WIDGET_PRICE = 4.79, BASE_SALRY = 2000;
        String name;

        // input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the salesperson's name:");
        name = in.next();
        System.out.print("Enter the number of widgets sold:");
        widgets_sold = in.nextInt();
        System.out.print("Enter the number of widgets returned:");
        widgets_returned = in.nextInt();

        //calculations
        net_widgets_sold = widgets_sold - widgets_returned;
        widget_sales_amount = net_widgets_sold * WIDGET_PRICE;

        // decision structure
        if(net_widgets_sold <=100)
            comm_rate = .1;
        else if(net_widgets_sold < 200)
            comm_rate = .15;
        else if(net_widgets_sold < 300)
            comm_rate = .2;
        else 
            comm_rate = .25;
        
        commission_amount = comm_rate * widget_sales_amount;
        salary = commission_amount + BASE_SALRY;

        //output
        System.out.println("Sales person: " + name);
        System.out.println("Net Widgets sold: " + net_widgets_sold);
        System.out.println("Widget Sales Amount: " + widget_sales_amount);
        System.out.println("Commission Amount: " + commission_amount);
        System.out.println("Monthly Salary: " + salary);
        in.close();
    }
}