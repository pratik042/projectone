package inheritance;
class A{
void axe()
{
	System.out.println("hi im from axe");	
	
}
}
class B extends A{
	
	void dxe()
	{
		System.out.println(" hi im from dxe");
	}
	
}
 class C extends B{
	 
	 void  fxe()
	 {
		 System.out.println( " im from fxe");
	 }
 }
public class multilevel extends C {
multilevel()
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
multilevel mm=new multilevel();
mm.fxe();
mm.dxe();
mm.axe();
	}

}
