package method_overloading;

public class test2 {
	
	static int sum(int a,int b)
	{
		return a+b;
	}
	static double  sum(int a,int b)
	{
         return a+b;		
	}
	
public static void main( String args[])
{
	
	System.out.println(test2.sum(23,34));
	
	
}
}
// so as we can see  return type of both is same so that isnt allowed