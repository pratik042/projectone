package aggregation;
class fun{
	 int func;
	fun(int c)
	{func=c;
		System.out.println("im from constructor fun ="+func);
	}
	
	int display()
	{
		 return func;
	}
   int time() {
	// TODO Auto-generated method stub
System.out.println("im from void time="+func);
return func;
}
	
}
public class sum {
	int k;
	// so basically we ccan say constructor is used to initialize data outside main where ever we need 
	// if we want to use it everywhere outside main we need to initialize it
	sum(int m)
	{
	  k=m;
		System.out.println("im from constructor="+k);
	}

	int show(int i) {
		// TODO Auto-generated method stub
		System.out.println(" im from method show "+i);
		System.out.println(" im k from method="+k);
		int j=i*k;
	//	return i;
		return j;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum ss1=new sum(4);// value passed from here will go into constructor
		int result=ss1.show(3);// value passed from here will go into method show 
		System.out.println(" im from main ,product  "+ result);
		fun ff=new fun(2);
		int result2=ff.display();
		System.out.println(" im from main result2 ="+result2);
		int result3=ff.time();
		
		System.out.println(" im from main result3 ="+result3);
		
	}



}
