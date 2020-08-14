package this_keyword;

class pass
{
	passing_this_as_argument_in_constructor obj;//5) then we made object of main class
	
	pass(passing_this_as_argument_in_constructor obj)//6) then we passed it as as argument
	{
		 this.obj=obj;//7) then we transferred that obj in new obj with same variable name
		
	}
  public void display()
  {
		// TODO Auto-generated method stub
	       System.out.println(obj.no);//8) then we printed that obj and got output as 10/..........SIMPLE..WELCOME TO TOUGH PROGRAMMERS..PRACTICE THIS AGAIN AND AGAIN
	
	}
}
public class passing_this_as_argument_in_constructor
{
          int no=10;
          passing_this_as_argument_in_constructor()// 2) then we made constructor of it to initialise variable
{        //here we will make object of class pass
	
	      pass pb=new pass(this);//3) then we made obj of another class
	      pb.display();//4) then we called a method from that class from this constructor
}
	       public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		passing_this_as_argument_in_constructor  ss=new passing_this_as_argument_in_constructor();//1) we made obj of our main class
		
	}

}
