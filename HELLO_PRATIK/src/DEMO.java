import java.util.Scanner;

public class DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i ,j,k;
		
    System.out.println(" enter 1st number \n");
     Scanner sc =new Scanner(System.in);//Scanner class for 1st number
     i=sc.nextInt();
     System.out.println(" enter 2nt number \n");//Scanner class for 2nd number
     j=sc.nextInt();
     System.out.println(" enter 3rd number \n");//Scanner class for 3nd number
     k=sc.nextInt();
     
     System.out.println("  enter operation  you want to  perform\n");
     Scanner bc =new Scanner(System.in);////Scanner class for getting operation e.g "add","sub"
     String operation=bc.nextLine();
     

         switch(operation)// mi ithe switch case use kelay,,if else ne pn hou shakta
{
case "add":
{
	System.out.println(" add="+(i+j+k));
}
case "sub":
{
	System.out.println(" sub="+((i-j)-k));
}
    break;
   default:
	{
		System.out.println(" wrong operaation");
	}
}		
		}

}
