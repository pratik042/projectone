package this_keyword;
//here we will call parameterised constructor from default constructor
// we made a class B
      class B{
	
	//here we will make  two constructors
	B()
	{this(3);
	
	System.out.println(" im from nonparameterised constructor");
	}
	B(int x)
	{	
		System.out.println(x);
	}
                 }
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B a=new B(6);

	}

}
