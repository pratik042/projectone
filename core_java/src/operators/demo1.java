package operators;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
System.out.println("a++  "+ a++);//10
System.out.println("++a  "+ ++a);//12
System.out.println("a--  "+ a--);//12
System.out.println("--a  "+ --a);//10
System.out.println("b++  "+ b++);//20
System.out.println("++b  "+ ++b);//22
System.out.println("\n");
System.out.println("a  "+a);//value of a is 10
System.out.println("b  "+b);//now value of b is 22 coz we incremented it up
System.out.println("\n");
System.out.println(a++ + b++); //10 +22=32
System.out.println(++a + ++b);//12+24=36
System.out.println("a="+a  +"b="+b);
System.out.println("b++  "+b++);
System.out.println("++a="+a+"    " + ++a + b++);//14+24=38

System.out.println("a="+a  +"b="+b);	
		
		
		
		
		
		
		
		
		
	}

}
