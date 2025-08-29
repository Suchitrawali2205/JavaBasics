package module1;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		double radius=sc.nextDouble();
		double area=Math.PI*radius*radius;
		System.out.println("Area is "+area);
		double circum=2*Math.PI*radius;
		System.out.println("Circumference is "+circum);
		
		
		sc.close();
		
		
	}
}
