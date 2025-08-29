package module1;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter breadth");
		double breadth=sc.nextDouble();
		System.out.println("Enter height");
		double height=sc.nextDouble();
		double area=0.5*breadth*height;
		System.out.println("Area is "+area);
		System.out.println("Enter a");
		double a=sc.nextDouble();
		double circum=a+breadth+height;
		System.out.println("Circumference" +circum);
		
		sc.close();
	
	}
	

}
