

import java.util.Scanner;

public class ReverseString2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner aa = new Scanner(System.in);
    System.out.print("Enter the string : ");
    String str = aa.nextLine();        
    String strRev =reverseIt(str);   
    System.out.println(strRev);
    
    //Scanner bb = new Scanner(System.in); //不需要第二个scanner  第一个就可以了
    System.out.print("Enter the string : ");
    String original = aa.nextLine();  
    String reverse = new StringBuffer(original).reverse().toString();
    System.out.println(reverse);
    
	}
	

public static String reverseIt(String source) {
	
    int i, len = source.length();
    
    StringBuilder dest = new StringBuilder(len);//新建一个string老保存reverse后的结果

    for (i = (len - 1); i >= 0; i--){
        dest.append(source.charAt(i));
    }

    return dest.toString();
}
}