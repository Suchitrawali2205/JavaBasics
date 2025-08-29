package module1;

import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args)
	
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount");
		double p=sc.nextDouble();
		System.out.println("Enter rate of interest");
		double r=sc.nextDouble();
		System.out.println("Enter time");
	double t=sc.nextDouble();
		double amount=(p*t*r)/100;
		System.out.println("The total amount is" +amount);
		sc.close();
		
			
	}

}
