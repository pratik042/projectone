package aggregation;

import java.util.Scanner;

public class sum2
{  int m;
	sum2(int s1)//constructor in only for initialising values dont use it for any other purpose ok,
    	{m=s1;//value of s1 is set into m so tht we can pass it into show method
		System.out.println(" im from constructor="+m);// m is displayed from constructor
	    }
     int show(int s) // value is bought from show method
        {
	System.out.println(" im s="+s);// s is displayed
	System.out.println("im m="+m);//m is displayed from show method
	return s*m;// product of s and m is returned
        }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

            System.out.println(" enter the number you want to sent in constructor\n");
            Scanner sc= new Scanner( System.in);
           int s=sc.nextInt();
           sum2 ss=new sum2(s);
           int result=ss.show(s);
          // System.out.println(return);
           System.out.println(" product ="+result);
            
                                                 
	}

}
