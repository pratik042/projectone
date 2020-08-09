package constructors;
//here we have used static variables   on variables

public class student5 {
	
	static int ll=23;
	//we will make a constructor here
	student5(int h)
	{
		System.out.println("hii from constructor");//items of constructor will be printed 1st
		System.out.println(h);
	// 	System.out.println("from constructor"+ll++);
		 
	}
	
	void tap(int k)
	{
		System.out.println("kkk from method");// item from method will be printed when we call them
		System.out.println(k);
		System.out.println("from method"+ll++);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main"+ll++);
		student5 kk=new student5(56);//we need to make object to student class to call method
	  	kk.tap(1);//method is called
		
		
		
		
		
		
	}

}
