package constructors;
//here we will do constructor overloading

     public class student3 {

    	 int i;//we created an instance variable i
	student3(int j)
	 {
		// int i;//we created an instance variable i, we cannot declare variable here coz it wont work in method display
		 i=j;
		//System.out.println(i);
		
	 }
	
	void display()
	{	// int i;//we created an instance variable i , we cannot declare variable here then it will tell you to initialize it
		System.out.println("="+i);
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
      //int k = 23;
		student3 s1=new student3(23);
		student3 s2=new student3(34); 
		s1.display();
		s2.display();
		
	}

}
