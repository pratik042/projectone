package constructors;
//here we will make  METHOD STATIC,
//ONLY STATIC VARIABLES CAN BE ACCCESED FROM STATIC METHODS
 class another{
	int bikeid;
	String bike;
	
	another(int bikeid,String bike)// we need a constructor to get/initialise values
	{
		this.bikeid=bikeid;// we can use diffrent variable names here also
		this.bike=bike;	
		
	}
	
	void display()
	{
		System.out.println( "bike id= "+bikeid+"  bike name= "+bike);
	}	
	
}
public class student6 {
           int id;
           String name;
            static String clg;//THIS VARIABLE SHOULD BE STATIC COZ ITS GOING TO BE OPERATED IN STATIC METHOD
        
// WE NEED A CONSTRUTOR TO INITIALIZE VARIABLES
           student6(int r,String kk)// we initialised values here so that they can operate in all programm
           {id=r;
           name=kk;
        	   
           }
           
		//now we will make static method
           static void change()
           {
        	   clg="IMA";
           }
           
           //now we will make a method to print them
           void show()
           {
        	
        	   System.out.println(id+"  "+name+"  "+clg);
           }

           

	public static void main(String[] args) {
		//now we will make objects
		another s3=new another(34,"dominar");//now we want to send this values in class another
		s3.display();
		student6 s1=new student6(42,"pratik");// values were inserted here and then to pass these values up we made a constructor,i.e. initialise values up
		student6 s2=new student6(11,"sonu");
		//now we need to call method show
      student6.change();//WE NEED TO CALL STATIC METHOD USING CLASS INSTANCE ,not object instace
		s1.show();// WE CALL METHOD WITH OBJECT INSTANCE NOT CLASS INSTANCE,, SEE DIFFFRECE
		s2.show();
		
		

	}

}
