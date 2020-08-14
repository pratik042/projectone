package super_keyword;

class biker{
	
	int i=10;
	biker(int i)
	{i=i;
		
	}
void display()
{
	
}
	
}
class car{
	static int i;
	car(int i)
	{i=i;
		
	}
	int  show(int i)
	{this.i=i;
	  	System.out.println(" im from show method="+i);
		return i;	
	}

}
public class demo2 extends car{

	demo2(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      demo2 obj= new demo2(5);
      obj.show(8);
    	System.out.println(" im from main"+i);
	}

}
