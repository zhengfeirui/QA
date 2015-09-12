

public class StaticTest {
	
	static int counter1 =0;
	//static final int counter1 =0; when you do ++ on final constant, it will give errors


	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StaticTest z = new StaticTest();
    
    int counter =0;
    
    counter ++;
    System.out.println(counter);
    counter();
    z.printcounter1();
	}
	
	public static void counter(){
		counter1++;
	}
   public void printcounter1(){
	   System.out.println(counter1);
   }
}

/**static should be defined in class, static cannot be defined in function.
counter() function is static while printcounter1 is not static,
so when you use the counter() you can just directly use it,
but for printcounter1() you need create a object first before you use it.
*/