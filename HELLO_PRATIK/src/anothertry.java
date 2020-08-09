import java.util.Scanner;

public class anothertry {
		public static void main (String[]args){
		System.out.println("Enter the numbers");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		System.out.println("Choose 1 for addition\nChoose 2 for Subtraction\nChoose 3 for Multiplication");

		int n = input.nextInt();
		       switch (n)
		{
		       case 1:
		      int num0;
		      num0 = num1 + num2;
		      System.out.println("Addition of the two numbers : " + num0);
		      break;
		       case 2:
		      int num3;
		      num3 = num1 - num2;
		      System.out.println("Subtraction of the two numbers :"+ num3);
		      break;
		       case 3:
		      int num4;
		      num4 = num1*num2;
		      System.out.println("Mulutiplication of the two numbers :"+ num4);
		      break;
		       

		}

		     
		       System.out.println("Choose 1 for addition\nChoose 2 for Subtraction\nChoose 3 for Multiplication");
		       
		}
}

