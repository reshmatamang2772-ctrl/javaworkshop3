
/**
 * Write a description of class QUESTIONFIVE here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class QUESTIONFIVE
{
    public static void main (String[] args){
Scanner input= new Scanner (System.in);
System.out.println ("Enter first Number");
double number1= input.nextDouble();
System.out.println ("Enter second Number");
double number2= input.nextDouble();
System.out.println("\n---Displaying Entered Values---");
System.out.println("First Number: " + number1);
System.out.println("Second Number: " + number2);
input.close();
}
}

