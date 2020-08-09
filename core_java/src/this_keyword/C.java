package this_keyword;
//here we will call the default constructor from parameteriesd constructor
class M{
	
	M()// THIS CONSTRUCTOR IS CALLED FROM BELOW PARAMETERISED  CONSTRUCTOR
	{
	
	System.out.println("im from default constructor");
	}

	M(int v){
		this();
		System.out.println(v);
	}
	
	
	
}

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
M a=new M(3);

	}

}
