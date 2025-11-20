import java.util.Scanner;

/**
 * Write a description of class scannerclass here.
 *
 * @author (Reshma)
 * @version (a version number or a date)
 */
public class scannerclass
{
public static void main (String[] args){
Scanner scan=  new Scanner(System.in);
System.out.println("Enter first Number");

int firstNum= scan.nextInt();// for whole numbers
System.out.println("Enter second Number");

double secondNum= scan.nextDouble();
System.out.println("My first Number is: "+firstNum + secondNum
); 

// Ternery Operator
// int age= 18;
Scanner input = new Scanner(System.in);
int age= input.nextInt();
  
String isValid= (age >18)? "Driving is allowed" : "Driving is not allowed" ;

System.out.println(isValid);


    
}

}
