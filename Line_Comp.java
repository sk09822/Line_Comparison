import java.util.Scanner;

public class Line_Comp{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Line Comparison Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x Co-ordinate Number of First Point");
		int x1 = sc.nextInt();
		System.out.println("Enter y Co-ordinate Number of First Point");
		int y1 = sc.nextInt();
		
		System.out.println("Enter x Co-ordinate Number of Second Point");
		int x2 = sc.nextInt();
		System.out.println("Enter y Co-ordinate Number of Second Point");
		int y2 = sc.nextInt();
		sc.close();
		
		double lenght_of_line = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Length of end point is : " +lenght_of_line);
	}
}

