package this_keyword;
class ka{
	int len;
	ka(int l){
		len=l;
	}
	
	void display() {
		System.out.println(len);
	}
	
	
}
public class z {
	int cc;
	String susp;
	z(int i,String ss)
	{cc=i;
	susp=ss;	
	}

	void show()
	{
		System.out.println(" cc="+cc+" suspension="+susp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ka obj1=new ka(2000);
	z obj2= new z(250,"inverted");
	obj2.show();
	obj1.display();
	
		
		
		
	}

	
}
