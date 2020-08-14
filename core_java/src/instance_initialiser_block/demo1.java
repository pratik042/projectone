package instance_initialiser_block;
//ye bs ek block h jiska kuch  naam ni hota.bs 2 braket ke bitch me kuch bhi likh do do ho gyya INSTANCE INITIALZER BLOCK
//RULES
//1) it will not work until instance of class is made
//2) even if data of tht block is displayed first,in acutal compiler vo IIB ko copy karke constructor me daal deta h
//aur jab tak super() keyword nhi dalte tab tak vo invoke nhi hoga

class bike{
	
	bike()
	{
		System.out.println(" im from bike");
	}
	
	
}

public class demo1  extends bike{

	demo1()//3) here we will make a constructor and lets see who displayed first
	{
		System.out.println(" hi im from constructor");//4) so as we see IIB is displayed first  then constructor is displayed
	}
	{System.out.println("hi imfrom IIB");}//1) we made a IIB but it work invoke until  instance is made


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    demo1 dd=new demo1();//2) so we made instance here so now it got displayed
    
	}

}
