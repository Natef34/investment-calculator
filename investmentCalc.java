import java.util.*;


public class investmentCalc
{
	public static void main (String args[])
		{
				//User given variables (Name, Investment, Return Rate, Compound Int):
				String name;
				double initial;
				double rate;
				double interval;
				
				System.out.println ("Welcome to your investment calculator! Please enter your name: ");
				
				//Input Scanner:
				Scanner keyin = new Scanner (System.in);
				
				name = keyin.next();
				System.out.println ("Thank you, " +name);
				
				
				System.out.println ("Please enter your initial investment: ");
					initial = keyin.nextDouble();
				
				System.out.println ("Now enter your interest rate in decimal form: ");
					rate = keyin.nextDouble();
				
				System.out.println ("Now enter your compounding interval (ex. 4 is quarterly): ");
					interval = keyin.nextDouble();	
				
				//Final Report:
				System.out.println (name+ "'s Investment Report:");
				System.out.println ("___________________________");
				System.out.printf("Initial Investment: $%.02f\n", initial);
				System.out.printf ("      5 Year Total: $%.02f\n", (initial*Math.pow((1+(rate/interval)),(interval*5))));
				System.out.printf ("     10 Year Total: $%.02f\n", (initial*Math.pow((1+(rate/interval)),(interval*10))));
				System.out.printf ("     20 Year Total: $%.02f\n", (initial*Math.pow((1+(rate/interval)),(interval*20))));
		}


}
