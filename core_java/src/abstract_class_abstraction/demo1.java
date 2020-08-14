package abstract_class_abstraction;

import org.hibernate.cfg.Configuration;

abstract class bike1
{
	abstract void run();
	
}
public class demo1 extends bike1 {

	void run() {
		System.out.println(" keep studying dont lets others define your journey,prove your self ,best way to kill them is by ignoring them");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      bike1 obj=new demo1();
      obj.run();
      
      
      
      
		
		
	}

}
