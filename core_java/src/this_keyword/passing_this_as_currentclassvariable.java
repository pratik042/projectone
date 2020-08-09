package this_keyword;
//here we are going to pass this as current class variable
//SO BASICALLY THE THING IS IF ARE WRITING SAME VARIABLE NAME IN CONSTRUCTOR TO INITIALIZE VARIABLE THEN THIS KEYWORD IS NEEDED TO DIFFRENTIATE IT

class currentclass{
   int r,lenght;
	currentclass(int r,int m)//made constructor
	{
		this.r=r;//HERE IS DIFFRENCE ,this keywrod is used coz name of parameter is same
		lenght=m;//here name of parameter is diffrent hence no need of this keyword
		
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(r);
		System.out.println("lenght="+lenght);
	}	
}
public class passing_this_as_currentclassvariable {
       String bikename;
       //we will make constructor here to initialise variables
       passing_this_as_currentclassvariable (String l)//made constructor
       {
    	   bikename=l;
       }
     private void show() {
   		// TODO Auto-generated method stub
   		System.out.println(bikename);
   	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		currentclass ss=new currentclass(3540,2000);
		passing_this_as_currentclassvariable kk=new passing_this_as_currentclassvariable("doominar");
		
		ss.display();
		kk.show();
		
		
		
	}




}
