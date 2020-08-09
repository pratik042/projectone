package constructors;
//FETCHING VALUES BY REFERANCE AND  METHOD ,,SEE THE DIFFERENCE  
class test{

	int id=0;//by method
	String name=null;
	
	int idd=0;//by referance
	String namee=null;
	
	public void insert(int i,String n) {//values came here and got stored into i and n 
		// TODO Auto-generated method stub
		
		id=i;// here values got stored into id , and name
		name=n;
		
	}
	public void fetch() {
		// TODO Auto-generated method stub
	System.out.println(id+"    "+name);	// so as values are in same class they could be sent in another method,and we called this method so values got fetched
	}
		
}
public class student  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		test t1 =new test();
		t1.insert(24,"sonu");//here we passsed the values into insert method
		t1.fetch();
		t1.idd=23;// passing values by referance
		t1.namee="sonuu";//but here values got stored into object ,so while getting them back we need to get them through object itself
	
		System.out.println(t1.idd+"=      "+t1.namee);//getting values by referance
	}

}
