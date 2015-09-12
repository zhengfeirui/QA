package introduction;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("the value of i in loop is "+ i);
		}
		System .out .println("out of loop");
		
		//loop in array
		
		int[] num=new int[]{1,2,3,4,5,6,7,8,9,10};
		for (int i=0;i<num.length;i++)
		{
			System.out.println("elements of array:" + num[i]);
		}
		}

	}

