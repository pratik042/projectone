/**here we will invoke current class method
  
 */
package this_keyword;
/**here we will make one more class and invoke its method
 * 
 *
 */
class kk{
	
	void display()
	{
		System.out.println(" hi im form display");
	}
	
	void show()
	{this.display();
		System.out.println(" hi im from show");
	}
	
	
}
public class invoking_current_class_methods {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		kk m=new  kk();
		m.show();
		
	}

}
