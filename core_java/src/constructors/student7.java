package constructors;
//HERE WE HAVE WRITTEN A CODE FOR THIS KEYWORD,
//THIS KEYWORD  IS USED TO INVOKE CURRENT CLASS INSTANCE VARIABLE,OR CURRENT  CLASS METHOD, OR CURRENT CLASS METHOD
//this can be passed as an argument in the method call.
//this can be passed as argument in the constructor call.
//this can be used to return the current class instance from the method.


//so here we will make another class biker and get values in it from student7
class biker{
	//here we will make instance variables  
	int bikeid;
	String bikename;
	//here wewill  make constuctor to initialise variables 
	biker(int n,String ss)
	{
		bikeid=n;
		bikename=ss;
		
	}// here wewill make metod to dislplay
	void display()
	{
		System.out.println("bikeid="+bikeid+"  bike name=="+bikename);
	}
	
}
public class student7 {
    int cc;
	String suspension;
	student7(int ll,String nn)
	{
		 cc=ll;
        suspension=nn;
		
	}
	void show() {
		System.out.println(" cc="+cc+"  suspension="+suspension);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	we will make biker class  object  and pass values
		
		biker bb=new biker(304,"domiinar");//now we need constructor to initialise values in biker class
		student7 xx=new  student7(4000,"innverted");//from here values are sent to student7 class so we dont need this keyword
		//here we will call method
		bb.display();
		xx.show();
		
		}

}
