package aggregation;
//we  will make a class named address and use it as an object in emp classs
class Address{
             String home;
	         String state;
	
	Address(String s1,String s2)
	{   home=s1;
		state=s2;
	System.out.println(" IM FROM ADDRESS CONSTRUCTOR"+" home="+home+" State="+ state);
	}
	
}
public class emp {
      int id;
      String name;
      Address add;
      
      emp(int i,String ss,Address aa)
      {
    	 id=i;
    	 name=ss;
    	  add=aa;
     }
	// as we know constructor does not return any  value, so we will make a method to displau values
      String show()
      {
    	  System.out.println(" id="+id+"name="+name);
    	  System.out.println("home="+add.home+"  state="+add.state);
		return name;
       }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Address ad1=new Address("panchgani","MH");// this is our  fixed address for  add employees so we made 
        // seperate class having its data and this obbject is sent into emp

		emp ee1=new emp(23,"PRATIK",ad1);
		String dd=ee1.show();
		
		System.out.println("returned name"+ dd);
		}

}
