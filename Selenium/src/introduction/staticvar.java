package introduction;

public class staticvar 
{
	static int counter1=0;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		staticvar z=new staticvar();
		
		int counter=0;
		counter ++;
		System.out.println("main counte="+counter);
		counter();
		z.printcounter1();
		
	}
	public static void counter()
	{
		counter1 ++;
	}
	public void printcounter1()
	{
		System.out.println("counter1 is "+counter1);
		
	}

}
