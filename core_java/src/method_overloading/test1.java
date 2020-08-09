package method_overloading;
// here method overloading is done by same datatypes but diffent parameters
class run{
	
	 static int sum(int a,int s,int d){
		int f=a+s+d;
		return f;
	}
}

public class test1 {
 static int bun(int z,int x,int c)
{int v=z+x+c;
return v;
}
	int sum(int i,int j)
	{
		int c=i+j;
		return c;
	}
	int sum(int w,int e ,int r)
	{
		int y=w+e+r;
		return y;// sum is returned
	}
	
	public static void main(String[] args) {
		   System.out.println(" im from static method from run class="+run.sum(12,34,45));
	       System.out.println(" im from static method from test1 class="+test1.bun(56,66,78));       
	        // shortcut way to get ans from method without making instance of object
	       // we made method static, hence we dint need to make any instance
	       
		test1 t1=new test1();//object is created for calling methods
  		int result=t1.sum(12,23);// values is passsed
		int result1=t1.sum(1,2,34);// values is passed
 
		System.out.println("im from two parameters="+result);
        System.out.println( " im from 3 parameters="+result1);
	}

}
