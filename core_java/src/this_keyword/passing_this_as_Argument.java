package this_keyword;

public class passing_this_as_Argument {
	private void method1() {
		// TODO Auto-generated method stub
		method2(this);
		
		System.out.println(" im from method1");
	}
	void method2(passing_this_as_Argument obj)
	{
		System.out.println(" im form method2");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		passing_this_as_Argument ss=new passing_this_as_Argument();
		ss.method1();
		
	}



}
