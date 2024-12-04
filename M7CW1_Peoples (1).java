import java.util.Scanner;

public class M7CW1_Peoples 
{
    public static void main(String[] args) 
    {
        runMenu();
    }

    public static void runMenu() {
        Scanner in = new Scanner(System.in); // Corrected Scanner initialization
        String keepGoing = "yes";
        
        while (keepGoing.equalsIgnoreCase("yes")) 
        {
            displayInfo(); // Fixed method name
            // Calls to your function/methods come from runMenu()
            
            int sideA = getSideA(in); // Corrected variable naming
            int sideB = getSideB(in);
            int area = calculateArea(sideA, sideB); // Fixed method name and return type
            double hypotenuse = calculateHypotenuse(sideA, sideB); // Corrected variable naming
            
            displayValues(sideA, sideB, area, hypotenuse); // Fixed method name
            
            System.out.println();
            System.out.print("Do you want to run the program again? Enter yes or no: ");
            keepGoing = in.next();
            System.out.println();
        }
        
        in.close();
        System.out.println("Program has terminated!");
    }

    public static void displayInfo() 
    {
        System.out.println();
        System.out.println("Welcome to the Right Triangle Calculator!");
        System.out.println("This program calculates the area and hypotenuse of a right triangle.");
        System.out.println();
    }

    public static int getSideA(Scanner in) 
    {
        System.out.print("Enter side A of the right triangle: ");
        return in.nextInt(); // Fixed input type
    }

    public static int getSideB(Scanner in) 
    {
        System.out.print("Enter side B of the right triangle: ");
        return in.nextInt(); // Fixed input type and removed incorrect method
    }

    public static int calculateArea(int a, int b) 
    {
        return (a * b) / 2; // Corrected formula for triangle area
    }

    public static double calculateHypotenuse(int a, int b) 
    {
        // Hypotenuse calculation is correct
        return Math.hypot(a, b);
    }

    public static void displayValues(int sideA, int sideB, int area, double hypotenuse) 
    {
        System.out.println();
        System.out.println("Side A: " + sideA); // Fixed method signature and print format
        System.out.println("Side B: " + sideB);
        System.out.println("Area: " + area);
        System.out.println("Hypotenuse: " + hypotenuse);
        System.out.println();
    }
}