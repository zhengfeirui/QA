package introduction;

public class arraynum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= new int[]{1,2,3,4,5,6,7,8,9,10};    //num is array of type integer
        
        	System.out.println("elements of array:"+ num[2]);
        
        String[] ch=new String[]{"joe","smith","harry","tony"};
        
        System.out.println("the element at 0 postion "+ch[0]);
        System.out.println("the element at 3 postion "+ch[3]);
        System.out.println("the length of array "+ch.length);
        
        //array of fixed size.these are not resizable
        
        String[] mysecondstringarray = new String[3];
        mysecondstringarray[0]="String 1";
        mysecondstringarray[1]="String 2";
        mysecondstringarray[2]="String 3";
        
        System.out.println("the array element at position 1 is "+mysecondstringarray[0]);
        System.out.println("the array element at position 2 is "+mysecondstringarray[1]);
        System.out.println("the array element at position 3 is "+mysecondstringarray[2]);
	}

}
