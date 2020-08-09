package inheritance;
// SIMPLE INHERITANCE
class mice{
	int i;
void show(int i) {
     System.out.println("im from show"+i);
     }
      void show2(int l)
    {this.show(l);// here we passed the value l in this.show so tht it will  this will call show method and display it there 
    	System.out.println("im form show 2="+l);
    }
    }
public class cat extends mice
 {
	void display(int k)
	{
	System.out.println(" im from display"+k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			cat ss=new cat();
			ss.display(34);
			ss.show(45);
			ss.show2(56);
				
	}

}
