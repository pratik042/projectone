package aggregation;

//here we are gng to use aggregation,ie code reusabitly
class operation
{
	int square(int k)// 5)to vo square ips usko leke aya ,int k namak chowkidar ke through usko andr bheja,
	{
		return k*k;//6) usko idr double baanya aur return kar dia
	}		
}
public class result 
{
  private double area(int  i)//2) fir vo area IPS  4 ko apne chowki prleke aya,aur int i namaak chowkidar ke through usko andar bheja
	{
	operation op=new operation();//3)ab vo radius ka double nikalna tha to  operation class ka  IAS bulaya jo kii " op " tha
	int rsquare=op.square(i);//4) op officer ne uskke apne square ips ko bollna is chutiye ko leke ja aur double kar ke bhej
		
	double pi=3.14;
	double p =pi*rsquare;//7)fir vo returned value ko pi ke sath multiply karke " p " namak SP ke havale kiya
	return p;// 8)aur SP ko return kar dia
	}
        public static void main(String[] args) 
        {
		// TODO Auto-generated method stub
         result rr=new result();

        double value=rr.area(4);//1) rr object jo result district ka  IAS  hai,usne area name ke apne IPS ko bulaya aur bola ye 4 int jo 
        //radius hai usko apne pas leke jaa aur vo bhi  ans aye value ko return kar
        // 9)fir vhi SP  value me store hua aur print kar dia
         System.out.println("value from main = "+value);
        }

}
