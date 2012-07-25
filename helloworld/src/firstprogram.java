
import java.util.*;
public class firstprogram
{
	static Scanner console=new Scanner(System.in);
	public static void main(String args[])
	{
		int accountnumber,connections,channel;
		char customercode;
		System.out.println("This program computers a cable bill");
		System.out.print("Enter an account number:");
		accountnumber= console.nextInt();
		System.out.print("Enter customer code:R or r (Residential), B or b (Business):");
	    customercode = console.next().charAt(0);
		System.out.print("Enter the number of basic service connections:");
		connections=console.nextInt();
		System.out.print("Enter number of premium channels:");
		channel=console.nextInt();
		System.out.println();
		switch(customercode)
		{
		case 'R':case 'r':
		{
			double price;
			price=4.50+20.50+channel*7.50;
			System.out.println("Account number="+accountnumber);
			System.out.println("Account due=$"+price);
			break;
		}
		case 'B':case 'b':
		{
			double price;
			if (connections<=10)
				price=15.00+75.00+50.00*channel;
			else
				price=15.00+75.00+5*(connections-10)+50.00*channel;
			System.out.println("Account number="+accountnumber);
			System.out.println("Account due=$"+price);		
			break;
		}	
		default:
			System.out.println("The customer code you have entered is not valid");
	}
}
}

