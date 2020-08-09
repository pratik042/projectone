package constructors;
//here as you see you will find a constructor named student1 and method named insert  ,value 93 is passed to constructor and value 23 is passed to the insert method
// just see how values are passed and see the differnce

//NOTHING IS DIFFICULT ,EVERYTHING DEPENDS ON HOW MUCH FOCUS CAN YOU PUT ON IT, FOCUS IS A THING TO BE DEVELOPED GRADUALLY BY KEEPING 
//THOUGHTS ,BODY ,AND EYES STILL AND STIFF ON ONE PLACE,
//AS YOUR THIS PRACTICE GET INCREASED DAY  BY DAY ,NO TOPIC IS DIFFCULT FOR YOU COZ ULTIMATLY YOU WILL BE IN POSITION TO HANDEL ANY NEW TOPIC

//LEARN THIS FIRST TO KEEP SUPER CALM


public class student1 {

	student1(int k)//without calling it gets called
	{
		System.out.println("hii");	
		System.out.println(k);
	}
	
	void insert(int i)//method insert
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
//	int id = 93;  we can write like this also or direct also
	student1 s=new student1(93);//here value is passed to the constructor
             s.insert(23);//calling method 
			}

}
