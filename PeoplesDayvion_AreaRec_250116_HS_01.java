/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peoplesdayvion_arearec_250116_hs_01;
import javax.swing.JOptionPane;
/**
 *
 * @author peoplesd0779
 */
public class PeoplesDayvion_AreaRec_250116_HS_01
{
public static double length = 0.0 ;
public static double width;
public static double area;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    getLength();
    getWidth();
    displayArea();    // TODO code application logic here
    }
    
    public static void getLength()
    {
        length = Double.parseDouble(JOptionPane.showInputDialog("Enter Length"));
    }
    public static void getWidth()
{
width = Double.parseDouble(JOptionPane.showInputDialog("Enter Width"));
}
public static void displayArea()
{
area = length * width
        
}
