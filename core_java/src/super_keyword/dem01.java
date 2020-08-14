package super_keyword;

import operators.demo1;

//super keyword is used if wewant to get anything from parent class,so basically it works with inheritance
//we can call instance variables,or methods and constructors,
//in following program  we will use to call everything from bike

class bike
{
	 int no;
	 String company;
	bike(int i,String c)
	{no=i;company=c;
	System.out.println(no+" from bike   "+company);
	}
}

     class model 
{
 String type;
 int no;
 String company;
	model(int no, String company,String m)
	{//super(no,company);//POINT= AS WE SEE WE CAN USE SUPER KEYWORD OR THIS,BOTH GIVE OUTPUT
		this.no=no;
	    this.type=m;
	    this.company=company;
    }
    void show()
	{
		System.out.println("bike number="+no+"\nbike company="+company+"\nmodel="+type);
	}
}
public class dem01 {

     public static void main(String[] args) {
		// TODO Auto-generated method stub
      //demo1 dd=new demo1(1202,"dominar","bajaj");
     model mm=new model(1202,"bajaj","dominar");
     mm.show();
      
		
		
	}

}
