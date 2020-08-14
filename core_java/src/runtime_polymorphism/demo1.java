package runtime_polymorphism;
// polymorphism means many forms .
// 2 types of polymorphism in java,1)1)COMPILE TIME ,2) RUNTIME POLYMORPHISM
//both can be aachieved by method overloading and method overriding

//COMPILE TIME- 
  //e.g= if we override static method then it is ex of compile time polymorphism\
//RUNTIME POLYMORPHISM
//=  if  overrided  method is resolveed at runtime then its runtime polymorphism
// and this overided method is called through  referance variable of super class or parent class
// and method to be called is based on object being referred to by referance variable

//UPCASTING
//in upcasting the parent class variable refers to the object of child class
//DOWNCASTING
//in down casting thechild class variable refers to the object of object of parent class

class B {
	
	void bike()
	{
		System.out.println("hi im from class B ,method bike");
	}
}
public class demo1 extends B {

	void bike()
	{
		System.out.println(" hi im from class demo1 ,method bike");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj=new demo1();
		obj.bike();
		
		
		
	}

}
