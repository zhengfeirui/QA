

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "I am OK!";
    
    String strReverse = ReverseFunction(str);
    
    System.out.println(strReverse);
    
	}
	
	public static String ReverseFunction(String str){
		String every = "";

		for (int i=str.length();i>0;i--){
			every = every+str.substring(i-1,i);	
		}
		return every;
		
	}

}
