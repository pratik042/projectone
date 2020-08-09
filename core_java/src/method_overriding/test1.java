package method_overriding;
//DEFINITION ,IF A METHOD IN CHILD CLASS HAS SAME NAME AND PARAMETERS AS METHOD IN PARENT CLASS
// THEN IT IS CALLED METHOD OVERRIDING
//OVERRIDING IS used for achieving runtime poly morphism
//there must be is a relationship between  child and parent class
class  vehicle{
	int bike(int a,int b)
	{int c=a+b;
	System.out.println(" hii im from vehicle bike method");
	return c;
	}
}
public class test1  extends vehicle{

	int  bike(int a,int b)
	{int c=a+b;
		System.out.println("hii im from test1 bike ");
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test1 cc= new test1();
		int result=cc.bike(2,3);
		System.out.println("result="+ result);
		
		// after calling as we see output is called method from class test1 ,not from  class vehicle
	}

}
