

import java.util.ArrayList;
import java.util.List;

public class Array_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] string1= new String[5];//array  fixed length
        string1[0]="Apple";
        string1[1]="is";
        string1[2]="nice";
        
        for (String i :string1){        	
        System.out.println(i);
        }
        
        
        System.out.println("**********");

        ArrayList<String> string2 = new ArrayList<String>();        
        string2.add("Apple");
        string2.add("is");
        string2.add(2, "bad");
        string2.add(3, "?");

        
        for (String i :string2){        	
            System.out.println(i);
            }

        
	}

}
