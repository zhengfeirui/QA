

public class Calculates {
	
	static int result = 0;
	static String gradeResult="";
	
	/*
	public void add(int x,int y) {
		
		result = x+y;
		System.out.println(result);
	}
  */
	//if void, you can just print it out, but you can not use it;
	//if you want to use the result, you need pass the value and return it
	
	public static int add (int x, int y) {
		result = x+y;
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//always call function from the main
    result = add(8,9);
    System.out.println("The reslut is "+result);
    
    Calculates a = new Calculates();
    double average = a.avgcal(94,92,85);
    
    if(average>=93&&average<=100) {
    	gradeResult = "A"; //this it the way to use static variable
    	System.out.println("From these three grades, the average grade is "+ gradeResult);
    	//retun("A");
    	//graderesult = "A"; return graderesult;
    }
    else if(average>=87&&average<=92) {
    	gradeResult = "B";
    	System.out.println("From these three grades, the average grade is "+ gradeResult);
    	
    }
    else if(average>=80&&average<=86) {
    	gradeResult = "C";
    	System.out.println("From these three grades, the average grade is "+ gradeResult);
    }
    else {
    	gradeResult = "Fail";

    	System.out.println("From these three grades, the average grade is "+ gradeResult);
    }
	}

	public static double avgcal(double x,double y, double z){
		double avg =  (x+y+z)/3;
		return avg;
		
	}
}
