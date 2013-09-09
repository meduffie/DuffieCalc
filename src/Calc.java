/*Austin Duffie | Duffie Calc | 0.01 | 9/8/13
 * Time to completion: 2 Hours
 */
import java.io.*;
import java.util.*;
public class Calc 
{
	public static void main(String[] args) 
	{
		final String NAME = "Duffie Calc ";
		final double VER = 0.01;
		final String NAME_VER = NAME+VER;
		System.out.println(NAME_VER);
		int power = 1; // 1 = on 0 = off LoGiC
		while(power == 1) //Loop for multiple uses
		{
			Scanner kbReader = new Scanner(System.in);
			System.out.print("Enter your first number: ");
			double a = kbReader.nextDouble();
			System.out.println("Enter your first operand: ");
			String ac = kbReader.next(); //Takes operand as a string
			char ao = ac.charAt(0); //Converts operand to a char
			System.out.print("Enter your Second number: ");
			double b = kbReader.nextDouble();
			
			double ans;
			if(ao == '+')
			{
				ans = a + b; //Bracketed for future implementation
			}
			else if(ao == '-')
			{
				ans = a - b; //^
			}
			else if(ao == '*')
			{
				ans = a * b; //Bracketed for future implementation
			}
			else if(ao == '/')
			{
				ans = a / b; //^
			}
			
			else
			{
				ans = 0;
				System.out.println("Something went wrong, restart the program"); //Wrong OP or Dub
				power = 0;
			}
			
			System.out.println(": " + ans);
			System.out.println("Restart? (Y/n): ");
			String rr = kbReader.next();
			
			
			if(rr.equals("Y"))
			{
				power = 1;
			}
			else if(rr.equals("y"))
			{
				power = 1;
			}
			else
			{
				power = 0; //Kills loop
			}
		}
		System.out.println("Goodbye!");
	}

}
