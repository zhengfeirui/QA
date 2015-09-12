package introduction;

public class arrassign
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int[] num=new int[]{1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<num.length;i++)
		{
			if(num[i] % 2==0)
			{
				System.out.println("the even numbers are"+num[i]);
			}
			else
			{
			 System.out.println("the odd nos are "+num[i]);
			}
		}

	}

}
