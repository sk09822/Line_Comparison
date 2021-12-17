import java.util.Scanner;
public class Line_Comp3 {

	public static void main(String[] args) {
		
		 System.out.println("Welcome To Line Comparison Program");
	     Scanner sc = new Scanner(System.in);
	     
	    System.out.println("Enter x Co-ordinate Number of First Point");	
	    int x1 = sc.nextInt();      
         System.out.println("Enter Y Co-ordinate Number Of First Point");
         int y1 = sc.nextInt();
        
         System.out.println("Enter X Co-ordinate Number Of Second Point");
         int x2 = sc.nextInt();
         System.out.println("Enter Y Co-ordinate Number Of Second Point");
         int y2 = sc.nextInt();
        
         System.out.println("Enter P Co-ordinate Number Of Third Point");
         int p1 = sc.nextInt();
         System.out.println("Enter Q Co-ordinate Number Of Third Point");
         int q1 = sc.nextInt();
         
        
         System.out.println("Enter P Co-ordinate Number Of Forth Point");
         int p2 = sc.nextInt();
         System.out.println("Enter Q Co-ordinate Number Of Forth Point");
         int q2 = sc.nextInt();
         sc.close();
         
         double Length_Of_Line1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
         double Length_Of_Line2=Math.sqrt((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1));
         
         System.out.println("length of 1st end points are :" +Length_Of_Line1);
 		 System.out.println("length of 2nd end points are : " +Length_Of_Line2);
 	
 		
         if(Length_Of_Line1>Length_Of_Line2){

        	 System.out.println("length of 1st end points are Greater Than length of 2st end points are ");
         }
         else if(Length_Of_Line1<Length_Of_Line2){

        	 System.out.println("length of 1st end points are Less Than length of 2st end points are ");
         }
         else{

        	 System.out.println("Both Line Are  Equal");
         }

	}

}